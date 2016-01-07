
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
 *         &lt;element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.edf.fr/psc/0022/consulterInfosSociete}CustomHeaderContext" minOccurs="0"/>
 *         &lt;element ref="{http://www.edf.fr/psc/0022/consulterInfosSociete}_XMLHierarchyOutput" minOccurs="0"/>
 *         &lt;element ref="{http://www.edf.fr/psc/0022/consulterInfosSociete}consulterInfosSociete_Response" minOccurs="0"/>
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "faultactor",
    "customHeaderContext",
    "xmlHierarchyOutput",
    "consulterInfosSocieteResponse",
    "faultcode",
    "faultstring"
})
@XmlRootElement(name = "rechercheMosaique_Output")
public class RechercheMosaiqueOutput {

    protected String faultactor;
    @XmlElement(name = "CustomHeaderContext")
    protected CustomHeaderContext customHeaderContext;
    @XmlElement(name = "_XMLHierarchyOutput")
    protected XMLHierarchyOutput xmlHierarchyOutput;
    @XmlElement(name = "consulterInfosSociete_Response")
    protected ConsulterInfosSocieteResponse consulterInfosSocieteResponse;
    protected String faultcode;
    protected String faultstring;

    /**
     * Obtient la valeur de la propriété faultactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultactor() {
        return faultactor;
    }

    /**
     * Définit la valeur de la propriété faultactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultactor(String value) {
        this.faultactor = value;
    }

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
     * Obtient la valeur de la propriété xmlHierarchyOutput.
     * 
     * @return
     *     possible object is
     *     {@link XMLHierarchyOutput }
     *     
     */
    public XMLHierarchyOutput getXMLHierarchyOutput() {
        return xmlHierarchyOutput;
    }

    /**
     * Définit la valeur de la propriété xmlHierarchyOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLHierarchyOutput }
     *     
     */
    public void setXMLHierarchyOutput(XMLHierarchyOutput value) {
        this.xmlHierarchyOutput = value;
    }

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

    /**
     * Obtient la valeur de la propriété faultcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultcode() {
        return faultcode;
    }

    /**
     * Définit la valeur de la propriété faultcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultcode(String value) {
        this.faultcode = value;
    }

    /**
     * Obtient la valeur de la propriété faultstring.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Définit la valeur de la propriété faultstring.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

}
