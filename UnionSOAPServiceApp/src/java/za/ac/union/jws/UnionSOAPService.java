/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.union.jws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.ac.union.business.ClienttFacadeLocal;
import za.ac.union.entities.Clientt;

/**
 *
 * @author leseg
 */
@WebService(serviceName = "UnionSOAPService")
@Stateless()
public class UnionSOAPService {
    @EJB
    private ClienttFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createClient")
    public void createClient(@WebParam(name = "clienttXml") String clienttXml) throws Exception {
        ejbRef.createClient(clienttXml);
    }

    @WebMethod(operationName = "editClient")
    public void editClient(@WebParam(name = "clienttXml") String clienttXml) throws Exception {
        ejbRef.editClient(clienttXml);
    }

    @WebMethod(operationName = "removeClient")
    public void removeClient(@WebParam(name = "id") Long id) throws Exception {
        ejbRef.removeClient(id);
    }

    @WebMethod(operationName = "findClient")
    public Clientt findClient(@WebParam(name = "id") Long id) throws Exception {
        return ejbRef.findClient(id);
    }

    @WebMethod(operationName = "findAllClients")
    public List<Clientt> findAllClients() throws Exception {
        return ejbRef.findAllClients();
    }
    
}
