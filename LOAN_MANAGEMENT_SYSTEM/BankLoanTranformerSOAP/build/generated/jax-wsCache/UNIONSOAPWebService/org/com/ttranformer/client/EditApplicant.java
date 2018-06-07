
package org.com.ttranformer.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editApplicant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editApplicant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editApplicant", propOrder = {
    "applicantXML"
})
public class EditApplicant {

    protected String applicantXML;

    /**
     * Gets the value of the applicantXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantXML() {
        return applicantXML;
    }

    /**
     * Sets the value of the applicantXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantXML(String value) {
        this.applicantXML = value;
    }

}
