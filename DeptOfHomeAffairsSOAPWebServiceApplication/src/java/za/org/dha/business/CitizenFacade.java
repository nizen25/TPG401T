/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.org.dha.entities.Citizen;
import za.org.dhe.common.Utility;

/**
 *
 * @author Katlego
 */
@Stateless
public class CitizenFacade extends AbstractFacade<Citizen> implements CitizenFacadeLocal {
    @PersistenceContext(unitName = "DeptOfHomeAffairsSOAPWebServiceApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CitizenFacade() {
        super(Citizen.class);
    }

    @Override
    public void addCitizen(String citizenXML) throws Exception {
        String citizenXSDFile = "C:\\Users\\Katlego\\Documents\\Tutorial 9\\citizenXSDFile.xsd";
        
        if(Utility.validate(citizenXML, citizenXSDFile)) {
            
            Citizen citizen = (Citizen)Utility.unmarshal(citizenXML, Citizen.class);
            
            create(citizen);
        } else {
            throw new Exception("This XML file is not valid.");
        }
    }

    @Override
    public void editCitizen(String citizenXML) throws Exception {
        String citizenXSDFile = "C:\\Users\\Katlego\\Documents\\Tutorial 9\\citizenXSDFile.xsd";
        
        if(Utility.validate(citizenXML, citizenXSDFile)) {
            
            Citizen citizen = (Citizen)Utility.unmarshal(citizenXML, Citizen.class);
            
            edit(citizen);
        } else {
            throw new Exception("This XML file is not valid.");
        }
    }

    @Override
    public void removeCitizen(String citizenXML) throws Exception {
        String citizenXSDFile = "C:\\Users\\Katlego\\Documents\\Tutorial 9\\citizenXSDFile.xsd";
        
        if(Utility.validate(citizenXML, citizenXSDFile)) {
            
            Citizen citizen = (Citizen)Utility.unmarshal(citizenXML, Citizen.class);
            
            remove(citizen);
        } else {
            throw new Exception("This XML file is not valid.");
        }
    }

    @Override
    public Citizen findCitizen(Object id) throws Exception {
        return null;
       /* long id = "citizenXSDFile.xsd";
        
        if(Utility.validate(citizenXML, citizenXSDFile)) {
            
            Citizen citizen = (Citizen)Utility.unmarshal(citizenXML, Citizen.class);
            
            find(citizen);
        } else {
            throw new Exception("This XML file is not valid.");
        }*/
    }
    
}
