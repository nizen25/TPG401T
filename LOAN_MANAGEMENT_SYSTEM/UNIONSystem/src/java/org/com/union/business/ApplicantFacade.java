/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.union.business;

import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.com.union.common.Utility;
import org.com.union.entities.Applicant;

/**
 *
 * @author sydney
 */
@Stateless
public class ApplicantFacade extends AbstractFacade<Applicant> implements ApplicantFacadeLocal {

    @PersistenceContext(unitName = "UNIONSystemPU")
    private EntityManager em;

    private static final String RISKY = "RISKY";
    private static final String NOT_RISKY = "NOT_RISKY";
    private static final String TOO_RISKY = "TOO_RISKY";
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicantFacade() {
        super(Applicant.class);
    }

    @Override
    public void createApplicant(final String applicantXML) throws Exception {
        final String applicantXSD = "/home/sydney/applicantXSD.xsd";
        if(Utility.validate(applicantXML, applicantXSD)){
            final Applicant applicant = (Applicant) Utility.unmarshal(applicantXML, Applicant.class);
            create(applicant);
        } else {
            throw new Exception("This XML file is invalid!");
        }
    }

    @Override
    public void editApplicant(String applicantXML) throws Exception {
        final String applicantXSD = "/home/sydney/applicantXSD.xsd";
        if(Utility.validate(applicantXML, applicantXSD)){
            final Applicant applicant = (Applicant) Utility.unmarshal(applicantXML, Applicant.class);
            edit(applicant);
        } else {
            throw new Exception("This XML file is invalid!");
        }
    }

    @Override
    public void removeApplicant(Long id) throws Exception {
        final Applicant applicant = findApplicant(id);
        if (applicant != null) {
            remove(applicant);
        }
    }

    @Override
    public Applicant findApplicant(Long id) throws Exception {
        return find(id);
    }

    @Override
    public List<Applicant> findAllApplicants() throws Exception {
        return findAll();
    }
    
    @Override
    public String getStatus() throws Exception {
        final int riskCap = new Random().nextInt(10) + 1;
        if (riskCap > 5) {
            return TOO_RISKY;
        } else if(riskCap < 5 && riskCap > 2) {
            return RISKY;
        } else {
            return NOT_RISKY;
        }
        
    }
}
