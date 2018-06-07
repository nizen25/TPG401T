/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.bank.common;

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
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.omg.CORBA.portable.InputStream;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;


/**
 *
 * @author sydney
 */
public class Utility {
    public static boolean validate(final String inputXML, final String inputXSD) throws Exception {
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
        final Schema schema = schemaFactory.newSchema(new File(inputXML));
        final Validator validator = schema.newValidator();
        final Document document = createDocument(inputXML);
        validator.validate(new DOMSource(document));
        return true;
    }
    
    public static String transform(final String inputXML, final String inputXSL) throws Exception {
        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Templates templates = transformerFactory.newTemplates(new StreamSource(new File(inputXSL)));
        final Transformer transformer = templates.newTransformer();
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final Document document = createDocument(inputXML);
        transformer.transform(new DOMSource(document), new StreamResult(outputStream));
        return outputStream.toString();
    }
    
    public static String marshal(final Class c) throws Exception {
        final JAXBContext context = JAXBContext.newInstance(c);
        final Marshaller marshaller = context.createMarshaller();
        final StringWriter sw = new StringWriter();
        marshaller.marshal(c, sw);
        return sw.toString();
    }
    
    public static Object unmarshall(final String inputXML, final Class c) throws Exception {
        final JAXBContext context = JAXBContext.newInstance(c);
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        final Object o = unmarshaller.unmarshal(new StringReader(inputXML));
        return o;
    }
    
    private static Document createDocument(final String inputXML) throws Exception{
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        final Document document = documentBuilder.parse(new InputSource(new StringReader(inputXML)));
        return document;
    }
}
