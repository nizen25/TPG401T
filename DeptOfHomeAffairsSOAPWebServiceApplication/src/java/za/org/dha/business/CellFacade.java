/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.org.dha.entities.Cell;

/**
 *
 * @author Katlego
 */
@Stateless
public class CellFacade extends AbstractFacade<Cell> implements CellFacadeLocal {
    @PersistenceContext(unitName = "DeptOfHomeAffairsSOAPWebServiceApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CellFacade() {
        super(Cell.class);
    }
    
}
