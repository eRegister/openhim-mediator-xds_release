package ihe.iti.xds_b._2007;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2021-11-11T08:33:44.475Z
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "urn:ihe:iti:xds-b:2007", name = "DocumentRepository_PortType")
@XmlSeeAlso({ObjectFactory.class, oasis.names.tc.ebxml_regrep.xsd.rs._3.ObjectFactory.class, oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory.class, oasis.names.tc.ebxml_regrep.xsd.lcm._3.ObjectFactory.class, oasis.names.tc.ebxml_regrep.xsd.query._3.ObjectFactory.class})
@SOAPBinding(use = SOAPBinding.Use.ENCODED, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DocumentRepositoryPortType {

    @WebMethod(operationName = "DocumentRepository_ProvideAndRegisterDocumentSet-b", action = "urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b")
    @Action(input = "urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b", output = "urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-bResponse")
    @WebResult(name = "RegistryResponse", targetNamespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", partName = "body")
    public oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryResponseType documentRepositoryProvideAndRegisterDocumentSetB(
        @WebParam(partName = "body", name = "ProvideAndRegisterDocumentSetRequest", targetNamespace = "urn:ihe:iti:xds-b:2007")
        ProvideAndRegisterDocumentSetRequestType body
    );

    @WebMethod(operationName = "DocumentRepository_RetrieveDocumentSet", action = "urn:ihe:iti:2007:RetrieveDocumentSet")
    @Action(input = "urn:ihe:iti:2007:RetrieveDocumentSet", output = "urn:ihe:iti:2007:RetrieveDocumentSetResponse")
    @WebResult(name = "RetrieveDocumentSetResponse", targetNamespace = "urn:ihe:iti:xds-b:2007", partName = "body")
    public RetrieveDocumentSetResponseType documentRepositoryRetrieveDocumentSet(
        @WebParam(partName = "body", name = "RetrieveDocumentSetRequest", targetNamespace = "urn:ihe:iti:xds-b:2007")
        RetrieveDocumentSetRequestType body
    );
}
