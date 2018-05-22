/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.org.dha.entities.Email;

/**
 *
 * @author Katlego
 */
@Stateless
public class EmailFacade extends AbstractFacade<Email> implements EmailFacadeLocal {
    @PersistenceContext(unitName = "DeptOfHomeAffairsSOAPWebServiceApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmailFacade() {
        super(Email.class);
    }
    
}
