
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consulterInfosSociete_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consulterInfosSociete_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EtatService" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}EtatService"/>
 *         &lt;element name="DonneesRetour" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}DonneesRetour" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulterInfosSociete_Response", propOrder = {
    "etatService",
    "donneesRetour"
})
public class ConsulterInfosSocieteResponse {

    @XmlElement(name = "EtatService", required = true)
    protected EtatService etatService;
    @XmlElement(name = "DonneesRetour")
    protected DonneesRetour donneesRetour;

    /**
     * Gets the value of the etatService property.
     * 
     * @return
     *     possible object is
     *     {@link EtatService }
     *     
     */
    public EtatService getEtatService() {
        return etatService;
    }

    /**
     * Sets the value of the etatService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtatService }
     *     
     */
    public void setEtatService(EtatService value) {
        this.etatService = value;
    }

    /**
     * Gets the value of the donneesRetour property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesRetour }
     *     
     */
    public DonneesRetour getDonneesRetour() {
        return donneesRetour;
    }

    /**
     * Sets the value of the donneesRetour property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesRetour }
     *     
     */
    public void setDonneesRetour(DonneesRetour value) {
        this.donneesRetour = value;
    }

}
