
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DonneesRetour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DonneesRetour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MosaiqueMessageOut" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}MosaiqueMessageOut"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonneesRetour", propOrder = {
    "mosaiqueMessageOut"
})
public class DonneesRetour {

    @XmlElement(name = "MosaiqueMessageOut", required = true)
    protected MosaiqueMessageOut mosaiqueMessageOut;

    /**
     * Gets the value of the mosaiqueMessageOut property.
     * 
     * @return
     *     possible object is
     *     {@link MosaiqueMessageOut }
     *     
     */
    public MosaiqueMessageOut getMosaiqueMessageOut() {
        return mosaiqueMessageOut;
    }

    /**
     * Sets the value of the mosaiqueMessageOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link MosaiqueMessageOut }
     *     
     */
    public void setMosaiqueMessageOut(MosaiqueMessageOut value) {
        this.mosaiqueMessageOut = value;
    }

}
