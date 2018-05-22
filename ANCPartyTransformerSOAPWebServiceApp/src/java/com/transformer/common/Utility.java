/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transformer.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author MemaniV
 */
public class Utility {
    public static boolean validate(String clientXML, String cdataclientxsd) throws Exception {
        //--> Create a schema factory
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        
        //--> Create a schema
        Schema sourceSchema = factory.newSchema(new File(cdataclientxsd));
        
        //--> Create a validator
        Validator sourceValidator = sourceSchema.newValidator();
        
        //--> Create a document
        Document document = createDocument(clientXML);
        
        //--> Validate the document against the schema
        sourceValidator.validate(new DOMSource(document));
        return true;
    }

    public static String transform(String inputXMLDoc,String xsltFile) throws Exception {
        //--> create a transformer factory
        TransformerFactory transfactory = TransformerFactory.newInstance();
        
        //--> create a template out of the factory for threading purposes from the xslt file
        Templates xslttemplate = transfactory.newTemplates(new StreamSource(new File(xsltFile)));
        
        //--> create a transformer out of the template
        Transformer transformer = xslttemplate.newTransformer();
        
        //--> create an output stream
        ByteArrayOutputStream destMessage = new ByteArrayOutputStream();
        
        //--> create a document
        Document document = createDocument(inputXMLDoc);    
        
        //--> transform the document using the xslt transformer
        transformer.transform(new DOMSource(document), new StreamResult(destMessage));//inputDoc
        
        //--> get the string representation
        return destMessage.toString();
    }

    public static Object unmarshal(String responseClientXML, Class c) throws Exception {
        //--> Create a context
        JAXBContext context = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object o = unmarshaller.unmarshal(new StringReader(responseClientXML));
        return o;
    }
    
    public static String marshal(Class c) throws Exception {
        //--> Create a context
        JAXBContext context = JAXBContext.newInstance(c);
        Marshaller marshaller = context.createMarshaller();
        StringWriter sw = new StringWriter();
        marshaller.marshal(c, sw);
        return sw.toString();
    }
    
    private static Document createDocument(String clientXML) throws Exception {
        //--> Create a document factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        //--> create a document builder
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        
        //-->Change the xml into a document
        Document document = documentBuilder.parse(new InputSource(new StringReader(clientXML)));
        
        //--> return the document
        return document;
    }

}
