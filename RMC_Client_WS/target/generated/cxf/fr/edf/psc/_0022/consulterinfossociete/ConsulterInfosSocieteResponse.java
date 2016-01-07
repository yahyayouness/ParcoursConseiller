
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour consulterInfosSociete_Response complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété etatService.
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
     * Définit la valeur de la propriété etatService.
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
     * Obtient la valeur de la propriété donneesRetour.
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
     * Définit la valeur de la propriété donneesRetour.
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
