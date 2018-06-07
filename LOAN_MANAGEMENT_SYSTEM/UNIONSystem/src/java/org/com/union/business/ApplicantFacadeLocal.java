/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.union.business;

import java.util.List;
import javax.ejb.Local;
import org.com.union.entities.Applicant;

/**
 *
 * @author sydney
 */
@Local
public interface ApplicantFacadeLocal {

    void createApplicant(String applicantXML) throws Exception;

    void editApplicant(String applicantXML) throws Exception;

    void removeApplicant(Long id) throws Exception;

    Applicant findApplicant(Long id) throws Exception;

    List<Applicant> findAllApplicants() throws Exception;
    
    String getStatus() throws Exception;
    
}
