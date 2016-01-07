
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour consulterInfosSociete_ResponseTopElmt complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="consulterInfosSociete_ResponseTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consulterInfosSociete_Response" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}consulterInfosSociete_Response"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulterInfosSociete_ResponseTopElmt", propOrder = {
    "consulterInfosSocieteResponse"
})
public class ConsulterInfosSocieteResponseTopElmt {

    @XmlElement(name = "consulterInfosSociete_Response", required = true)
    protected ConsulterInfosSocieteResponse consulterInfosSocieteResponse;

    /**
     * Obtient la valeur de la propriété consulterInfosSocieteResponse.
     * 
     * @return
     *     possible object is
     *     {@link ConsulterInfosSocieteResponse }
     *     
     */
    public ConsulterInfosSocieteResponse getConsulterInfosSocieteResponse() {
        return consulterInfosSocieteResponse;
    }

    /**
     * Définit la valeur de la propriété consulterInfosSocieteResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsulterInfosSocieteResponse }
     *     
     */
    public void setConsulterInfosSocieteResponse(ConsulterInfosSocieteResponse value) {
        this.consulterInfosSocieteResponse = value;
    }

}
