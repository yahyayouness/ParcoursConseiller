
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the faultactor property.
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
     * Sets the value of the faultactor property.
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
     * Gets the value of the customHeaderContext property.
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
     * Sets the value of the customHeaderContext property.
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
     * Gets the value of the xmlHierarchyOutput property.
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
     * Sets the value of the xmlHierarchyOutput property.
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
     * Gets the value of the consulterInfosSocieteResponse property.
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
     * Sets the value of the consulterInfosSocieteResponse property.
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
     * Gets the value of the faultcode property.
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
     * Sets the value of the faultcode property.
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
     * Gets the value of the faultstring property.
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
     * Sets the value of the faultstring property.
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
