
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SCORE complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SCORE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TYPE_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALEUR_SCORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCORE", propOrder = {
    "typescore",
    "valeurscore"
})
public class SCORE {

    @XmlElement(name = "TYPE_SCORE")
    protected String typescore;
    @XmlElement(name = "VALEUR_SCORE")
    protected String valeurscore;

    /**
     * Obtient la valeur de la propriété typescore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPESCORE() {
        return typescore;
    }

    /**
     * Définit la valeur de la propriété typescore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPESCORE(String value) {
        this.typescore = value;
    }

    /**
     * Obtient la valeur de la propriété valeurscore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALEURSCORE() {
        return valeurscore;
    }

    /**
     * Définit la valeur de la propriété valeurscore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALEURSCORE(String value) {
        this.valeurscore = value;
    }

}
