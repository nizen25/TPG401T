/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.business;

import java.util.List;
import javax.ejb.Local;
import za.org.dha.entities.Email;

/**
 *
 * @author Katlego
 */
@Local
public interface EmailFacadeLocal {

    void create(Email email);

    void edit(Email email);

    void remove(Email email);

    Email find(Object id);

    List<Email> findAll();

    List<Email> findRange(int[] range);

    int count();
    
}
