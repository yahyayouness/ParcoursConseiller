
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercheMosaiqueTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the rechercheMosaique property.
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
     * Sets the value of the rechercheMosaique property.
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
