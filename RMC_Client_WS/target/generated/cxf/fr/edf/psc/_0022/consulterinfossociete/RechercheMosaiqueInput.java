
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.edf.fr/psc/0022/consulterInfosSociete}CustomHeaderContext" minOccurs="0"/>
 *         &lt;element ref="{http://www.edf.fr/psc/0022/consulterInfosSociete}rechercheMosaique" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customHeaderContext",
    "rechercheMosaique"
})
@XmlRootElement(name = "rechercheMosaique_Input")
public class RechercheMosaiqueInput {

    @XmlElement(name = "CustomHeaderContext")
    protected CustomHeaderContext customHeaderContext;
    protected RechercheMosaique rechercheMosaique;

    /**
     * Obtient la valeur de la propriété customHeaderContext.
     * 
     * @return
     *     possible object is
     *     {@link CustomHeaderContext }
     *     
     */
    public CustomHeaderContext getCustomHeaderContext() {
        return customHeaderContext;
    }

    /**
     * Définit la valeur de la propriété customHeaderContext.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomHeaderContext }
     *     
     */
    public void setCustomHeaderContext(CustomHeaderContext value) {
        this.customHeaderContext = value;
    }

    /**
     * Obtient la valeur de la propriété rechercheMosaique.
     * 
     * @return
     *     possible object is
     *     {@link RechercheMosaique }
     *     
     */
    public RechercheMosaique getRechercheMosaique() {
        return rechercheMosaique;
    }

    /**
     * Définit la valeur de la propriété rechercheMosaique.
     * 
     * @param value
     *     allowed object is
     *     {@link RechercheMosaique }
     *     
     */
    public void setRechercheMosaique(RechercheMosaique value) {
        this.rechercheMosaique = value;
    }

}
