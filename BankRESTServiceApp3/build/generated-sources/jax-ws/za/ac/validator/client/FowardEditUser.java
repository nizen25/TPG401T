
package za.ac.validator.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fowardEditUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fowardEditUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fowardEditUser", propOrder = {
    "userXml"
})
public class FowardEditUser {

    protected String userXml;

    /**
     * Gets the value of the userXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserXml() {
        return userXml;
    }

    /**
     * Sets the value of the userXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserXml(String value) {
        this.userXml = value;
    }

}
