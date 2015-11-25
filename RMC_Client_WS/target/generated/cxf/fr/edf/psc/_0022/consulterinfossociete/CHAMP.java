
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHAMP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHAMP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOM_CHAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALEUR_CHAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHAMP", propOrder = {
    "nomchamp",
    "valeurchamp"
})
public class CHAMP {

    @XmlElement(name = "NOM_CHAMP")
    protected String nomchamp;
    @XmlElement(name = "VALEUR_CHAMP")
    protected String valeurchamp;

    /**
     * Gets the value of the nomchamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMCHAMP() {
        return nomchamp;
    }

    /**
     * Sets the value of the nomchamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMCHAMP(String value) {
        this.nomchamp = value;
    }

    /**
     * Gets the value of the valeurchamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALEURCHAMP() {
        return valeurchamp;
    }

    /**
     * Sets the value of the valeurchamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALEURCHAMP(String value) {
        this.valeurchamp = value;
    }

}
