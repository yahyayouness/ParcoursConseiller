package fr.edf.psc._0022.consulterinfossociete;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.3
 * 2015-11-25T13:01:07.925+01:00
 * Generated source version: 2.4.3
 * 
 */
@WebService(targetNamespace = "http://www.edf.fr/psc/0022/consulterInfosSociete", name = "MosaiqueControllerPort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MosaiqueControllerPort {

    @WebMethod(action = "http://www.edf.fr/psc/0022/consulterInfosSociete")
    @WebResult(name = "rechercheMosaique_Output", targetNamespace = "http://www.edf.fr/psc/0022/consulterInfosSociete", partName = "rechercheMosaique_Output")
    public RechercheMosaiqueOutput rechercheMosaique(
        @WebParam(partName = "rechercheMosaique_Input", name = "rechercheMosaique_Input", targetNamespace = "http://www.edf.fr/psc/0022/consulterInfosSociete")
        RechercheMosaiqueInput rechercheMosaiqueInput
    );
}