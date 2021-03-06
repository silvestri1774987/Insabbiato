
package com.mycompany.aaawsserver;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AaawsInterface", targetNamespace = "http://aaawsserver.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AaawsInterface {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClients", targetNamespace = "http://aaawsserver.mycompany.com/", className = "com.mycompany.aaawsserver.GetClients")
    @ResponseWrapper(localName = "getClientsResponse", targetNamespace = "http://aaawsserver.mycompany.com/", className = "com.mycompany.aaawsserver.GetClientsResponse")
    public List<String> getClients();

}
