/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.business;

import java.util.List;
import javax.ejb.Local;
import za.org.dha.entities.Citizen;

/**
 *
 * @author Katlego
 */
@Local
public interface CitizenFacadeLocal {

    public void addCitizen(String citizenXML) throws Exception;

    public void editCitizen(String citizenXML) throws Exception;

    public void removeCitizen(String citizenXML) throws Exception;

    public Citizen findCitizen(Object id) throws Exception;

    public List<Citizen> findAll() throws Exception;

   

    int count();
    
}
