
package fr.edf.psc._0022.consulterinfossociete;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MosaiqueMessageOut complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MosaiqueMessageOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETABLISSEMENT" type="{http://www.edf.fr/psc/0022/consulterInfosSociete}ETABLISSEMENT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MosaiqueMessageOut", propOrder = {
    "etablissement"
})
public class MosaiqueMessageOut {

    @XmlElement(name = "ETABLISSEMENT")
    protected List<ETABLISSEMENT> etablissement;

    /**
     * Gets the value of the etablissement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etablissement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETABLISSEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETABLISSEMENT }
     * 
     * 
     */
    public List<ETABLISSEMENT> getETABLISSEMENT() {
        if (etablissement == null) {
            etablissement = new ArrayList<ETABLISSEMENT>();
        }
        return this.etablissement;
    }

}
