/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.dha.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.dha.common.Utility;
import za.ac.dha.entities.Person;

/**
 *
 * @author leseg
 */
@Stateless
public class PersonFacade extends AbstractFacade<Person> implements PersonFacadeLocal {
    @PersistenceContext(unitName = "DepartmentSOAPWebServiceAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonFacade() {
        super(Person.class);
    }

    @Override
    public boolean isIdFound(Long id) throws Exception{
         
        //String clientXML, String cdataclientxsd
        //String personXsdFile = "";
        
        Person p =  null;
        
        p = find(id);
        
        if(p == null)
        {
            return false;
        }
        else
        {
            return true;
        }
        
        
    }
    
}
