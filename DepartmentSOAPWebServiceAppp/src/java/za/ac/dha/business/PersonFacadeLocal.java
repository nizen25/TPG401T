/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.dha.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.dha.entities.Person;

/**
 *
 * @author leseg
 */
@Local
public interface PersonFacadeLocal {

    //void create(Person person);

    //void edit(Person person);

    //void remove(Person person);

    public boolean isIdFound(Long id) throws Exception;
    

    //List<Person> findAll();

    //List<Person> findRange(int[] range);

    //int count();
    
}
