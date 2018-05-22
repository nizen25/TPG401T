/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.dha.jws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.ac.dha.business.PersonFacadeLocal;

/**
 *
 * @author leseg
 */
@WebService(serviceName = "DepartmentSOAPWebService")
@Stateless()
public class DepartmentSOAPWebService {
    @EJB
    private PersonFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "isIdFound")
    public boolean isIdFound(@WebParam(name = "id") Long id) throws Exception {
        return ejbRef.isIdFound(id);
    }
    
}
