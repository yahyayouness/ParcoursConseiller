
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtatService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the codeEtatService property.
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
     * Sets the value of the codeEtatService property.
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
     * Gets the value of the libelleEtatService property.
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
     * Sets the value of the libelleEtatService property.
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
     * Gets the value of the etapeService property.
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
     * Sets the value of the etapeService property.
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
