/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.union.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.common.Utility;
import za.ac.union.entities.Clientt;

/**
 *
 * @author leseg
 */
@Stateless
public class ClienttFacade extends AbstractFacade<Clientt> implements ClienttFacadeLocal {
    @PersistenceContext(unitName = "UnionSOAPServiceAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienttFacade() {
        super(Clientt.class);
    }

    @Override
    public void createClient(String clienttXml) throws Exception {
        String clienttXsdFile = "C:\\Users\\leseg\\Documents\\java\\javaClient.xsd";
        
        System.out.println("Checking!!");
        
        
        if(Utility.validate(clienttXml, clienttXsdFile))
        {
            
            Clientt clientt = (Clientt) Utility.unmarshal(clienttXml, Clientt.class);
            create(clientt);
        }
        else
        {
           throw new Exception("This XSD File is not valid");
        }
    }

    @Override
    public void editClient(String clienttXml) throws Exception {
        String clienttXsdFile = "C:\\Users\\leseg\\Documents\\java\\clientXsdFile.xsd";
        if(Utility.validate(clienttXml, clienttXsdFile))
        {
            Clientt clientt = (Clientt)Utility.unmarshal(clienttXml, Clientt.class);
            edit(clientt);
        }
        else
        {
           throw new Exception("This XSD File is not valid");
        }
    }

    @Override
    public void removeClient(Long id) throws Exception {
        Clientt c = find(id);
        remove(c);
        
    }

    @Override
    public Clientt findClient(Long id) throws Exception {
         Clientt c = find(id);
         
         return c;
    }

    @Override
    public List<Clientt> findAllClients() throws Exception {
        List<Clientt> clientts = findAll();
        return clientts;
    }
    
}
