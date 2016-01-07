
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercheMosaiqueTopElmt complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercheMosaiqueTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rechercheMosaique" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}rechercheMosaique"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheMosaiqueTopElmt", propOrder = {
    "rechercheMosaique"
})
public class RechercheMosaiqueTopElmt {

    @XmlElement(required = true)
    protected RechercheMosaique rechercheMosaique;

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
