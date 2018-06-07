/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.union.jws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.com.union.business.ApplicantFacadeLocal;
import org.com.union.entities.Applicant;

/**
 *
 * @author sydney
 */
@WebService(serviceName = "UNIONSOAPWebService")
@Stateless()
public class UNIONSOAPWebService {

    @EJB
    private ApplicantFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createApplicant")
    public void createApplicant(@WebParam(name = "applicantXML") String applicantXML) throws Exception {
        ejbRef.createApplicant(applicantXML);
    }

    @WebMethod(operationName = "editApplicant")
    public void editApplicant(@WebParam(name = "applicantXML") String applicantXML) throws Exception {
        ejbRef.editApplicant(applicantXML);
    }

    @WebMethod(operationName = "removeApplicant")
    public void removeApplicant(@WebParam(name = "id") Long id) throws Exception {
        ejbRef.removeApplicant(id);
    }

    @WebMethod(operationName = "findApplicant")
    public Applicant findApplicant(@WebParam(name = "id") Long id) throws Exception {
        return ejbRef.findApplicant(id);
    }

    @WebMethod(operationName = "findAllApplicants")
    public List<Applicant> findAllApplicants() throws Exception {
        return ejbRef.findAllApplicants();
    }

    @WebMethod(operationName = "getStatus")
    public String getStatus() throws Exception {
        return ejbRef.getStatus();
    }
    
}
