
package za.ac.union.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clienttXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createClient", propOrder = {
    "clienttXml"
})
public class CreateClient {

    protected String clienttXml;

    /**
     * Gets the value of the clienttXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienttXml() {
        return clienttXml;
    }

    /**
     * Sets the value of the clienttXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienttXml(String value) {
        this.clienttXml = value;
    }

}
