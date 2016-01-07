
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CHAMP complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété nomchamp.
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
     * Définit la valeur de la propriété nomchamp.
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
     * Obtient la valeur de la propriété valeurchamp.
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
     * Définit la valeur de la propriété valeurchamp.
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
