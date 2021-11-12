package ihe.iti.xds_b._2007;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2021-11-11T08:33:49.082Z
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "DocumentRegistry_Service", 
                  wsdlLocation = "file:/var/lib/jenkins/workspace/hie-module-xdsmediator/src/main/resources/wsdl/XDS.b_DocumentRegistry.wsdl",
                  targetNamespace = "urn:ihe:iti:xds-b:2007") 
public class DocumentRegistryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:ihe:iti:xds-b:2007", "DocumentRegistry_Service");
    public final static QName DocumentRegistryPortSoap12 = new QName("urn:ihe:iti:xds-b:2007", "DocumentRegistry_Port_Soap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/var/lib/jenkins/workspace/hie-module-xdsmediator/src/main/resources/wsdl/XDS.b_DocumentRegistry.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DocumentRegistryService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/var/lib/jenkins/workspace/hie-module-xdsmediator/src/main/resources/wsdl/XDS.b_DocumentRegistry.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DocumentRegistryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DocumentRegistryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocumentRegistryService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DocumentRegistryService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DocumentRegistryService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DocumentRegistryService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns DocumentRegistryPortType
     */
    @WebEndpoint(name = "DocumentRegistry_Port_Soap12")
    public DocumentRegistryPortType getDocumentRegistryPortSoap12() {
        return super.getPort(DocumentRegistryPortSoap12, DocumentRegistryPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentRegistryPortType
     */
    @WebEndpoint(name = "DocumentRegistry_Port_Soap12")
    public DocumentRegistryPortType getDocumentRegistryPortSoap12(WebServiceFeature... features) {
        return super.getPort(DocumentRegistryPortSoap12, DocumentRegistryPortType.class, features);
    }

}