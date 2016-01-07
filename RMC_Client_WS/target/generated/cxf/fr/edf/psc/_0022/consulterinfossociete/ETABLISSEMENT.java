
package fr.edf.psc._0022.consulterinfossociete;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ETABLISSEMENT complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ETABLISSEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLG_EXIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHAMP" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}CHAMP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SCORE" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}SCORE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETABLISSEMENT", propOrder = {
    "siret",
    "flgexist",
    "champ",
    "score"
})
public class ETABLISSEMENT {

    @XmlElement(name = "SIRET")
    protected String siret;
    @XmlElement(name = "FLG_EXIST")
    protected String flgexist;
    @XmlElement(name = "CHAMP")
    protected List<CHAMP> champ;
    @XmlElement(name = "SCORE")
    protected List<SCORE> score;

    /**
     * Obtient la valeur de la propriété siret.
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
     * Définit la valeur de la propriété siret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIRET(String value) {
        this.siret = value;
    }

    /**
     * Obtient la valeur de la propriété flgexist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGEXIST() {
        return flgexist;
    }

    /**
     * Définit la valeur de la propriété flgexist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGEXIST(String value) {
        this.flgexist = value;
    }

    /**
     * Gets the value of the champ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the champ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHAMP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHAMP }
     * 
     * 
     */
    public List<CHAMP> getCHAMP() {
        if (champ == null) {
            champ = new ArrayList<CHAMP>();
        }
        return this.champ;
    }

    /**
     * Gets the value of the score property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSCORE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCORE }
     * 
     * 
     */
    public List<SCORE> getSCORE() {
        if (score == null) {
            score = new ArrayList<SCORE>();
        }
        return this.score;
    }

}
