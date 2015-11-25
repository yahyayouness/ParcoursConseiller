
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercheMosaique complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercheMosaique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheMosaique", propOrder = {
    "siret"
})
public class RechercheMosaique {

    @XmlElement(name = "SIRET")
    protected String siret;

    /**
     * Gets the value of the siret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIRET() {
        return siret;
    }

    /**
     * Sets the value of the siret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIRET(String value) {
        this.siret = value;
    }

}
