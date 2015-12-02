
package fr.edf.psc._0022.consulterinfossociete;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.edf.psc._0022.consulterinfossociete package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsulterInfosSocieteResponse_QNAME = new QName("http://www.edf.fr/psc/0022/consulterInfosSociete", "consulterInfosSociete_Response");
    private final static QName _RechercheMosaique_QNAME = new QName("http://www.edf.fr/psc/0022/consulterInfosSociete", "rechercheMosaique");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.edf.psc._0022.consulterinfossociete
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercheMosaiqueOutput }
     * 
     */
    public RechercheMosaiqueOutput createRechercheMosaiqueOutput() {
        return new RechercheMosaiqueOutput();
    }

    /**
     * Create an instance of {@link CustomHeaderContext }
     * 
     */
    public CustomHeaderContext createCustomHeaderContext() {
        return new CustomHeaderContext();
    }

    /**
     * Create an instance of {@link XMLHierarchyOutput }
     * 
     */
    public XMLHierarchyOutput createXMLHierarchyOutput() {
        return new XMLHierarchyOutput();
    }

    /**
     * Create an instance of {@link ConsulterInfosSocieteResponse }
     * 
     */
    public ConsulterInfosSocieteResponse createConsulterInfosSocieteResponse() {
        return new ConsulterInfosSocieteResponse();
    }

    /**
     * Create an instance of {@link RechercheMosaique }
     * 
     */
    public RechercheMosaique createRechercheMosaique() {
        return new RechercheMosaique();
    }

    /**
     * Create an instance of {@link RechercheMosaiqueInput }
     * 
     */
    public RechercheMosaiqueInput createRechercheMosaiqueInput() {
        return new RechercheMosaiqueInput();
    }

    /**
     * Create an instance of {@link ConsulterInfosSocieteResponseTopElmt }
     * 
     */
    public ConsulterInfosSocieteResponseTopElmt createConsulterInfosSocieteResponseTopElmt() {
        return new ConsulterInfosSocieteResponseTopElmt();
    }

    /**
     * Create an instance of {@link SCORE }
     * 
     */
    public SCORE createSCORE() {
        return new SCORE();
    }

    /**
     * Create an instance of {@link EtatService }
     * 
     */
    public EtatService createEtatService() {
        return new EtatService();
    }

    /**
     * Create an instance of {@link RechercheMosaiqueTopElmt }
     * 
     */
    public RechercheMosaiqueTopElmt createRechercheMosaiqueTopElmt() {
        return new RechercheMosaiqueTopElmt();
    }

    /**
     * Create an instance of {@link CHAMP }
     * 
     */
    public CHAMP createCHAMP() {
        return new CHAMP();
    }

    /**
     * Create an instance of {@link ETABLISSEMENT }
     * 
     */
    public ETABLISSEMENT createETABLISSEMENT() {
        return new ETABLISSEMENT();
    }

    /**
     * Create an instance of {@link DonneesRetour }
     * 
     */
    public DonneesRetour createDonneesRetour() {
        return new DonneesRetour();
    }

    /**
     * Create an instance of {@link MosaiqueMessageOut }
     * 
     */
    public MosaiqueMessageOut createMosaiqueMessageOut() {
        return new MosaiqueMessageOut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterInfosSocieteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.edf.fr/psc/0022/consulterInfosSociete", name = "consulterInfosSociete_Response")
    public JAXBElement<ConsulterInfosSocieteResponse> createConsulterInfosSocieteResponse(ConsulterInfosSocieteResponse value) {
        return new JAXBElement<ConsulterInfosSocieteResponse>(_ConsulterInfosSocieteResponse_QNAME, ConsulterInfosSocieteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheMosaique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.edf.fr/psc/0022/consulterInfosSociete", name = "rechercheMosaique")
    public JAXBElement<RechercheMosaique> createRechercheMosaique(RechercheMosaique value) {
        return new JAXBElement<RechercheMosaique>(_RechercheMosaique_QNAME, RechercheMosaique.class, null, value);
    }

}
