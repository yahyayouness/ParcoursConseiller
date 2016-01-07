
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EtatService complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EtatService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeEtatService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LibelleEtatService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EtapeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtatService", propOrder = {
    "codeEtatService",
    "libelleEtatService",
    "etapeService"
})
public class EtatService {

    @XmlElement(name = "CodeEtatService")
    protected String codeEtatService;
    @XmlElement(name = "LibelleEtatService")
    protected String libelleEtatService;
    @XmlElement(name = "EtapeService")
    protected String etapeService;

    /**
     * Obtient la valeur de la propriété codeEtatService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEtatService() {
        return codeEtatService;
    }

    /**
     * Définit la valeur de la propriété codeEtatService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEtatService(String value) {
        this.codeEtatService = value;
    }

    /**
     * Obtient la valeur de la propriété libelleEtatService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleEtatService() {
        return libelleEtatService;
    }

    /**
     * Définit la valeur de la propriété libelleEtatService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleEtatService(String value) {
        this.libelleEtatService = value;
    }

    /**
     * Obtient la valeur de la propriété etapeService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtapeService() {
        return etapeService;
    }

    /**
     * Définit la valeur de la propriété etapeService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtapeService(String value) {
        this.etapeService = value;
    }

}
