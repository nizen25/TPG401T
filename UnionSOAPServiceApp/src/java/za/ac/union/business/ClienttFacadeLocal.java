/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.union.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.union.entities.Clientt;

/**
 *
 * @author leseg
 */
@Local
public interface ClienttFacadeLocal {

    public void createClient(String clienttXml) throws Exception;

    public void editClient(String clienttXml) throws Exception;

    public void removeClient(Long id) throws Exception;

    public Clientt findClient(Long id) throws Exception;

    public List<Clientt> findAllClients() throws Exception;

    //List<Clientt> findRange(int[] range);

    //int count();
    
}
