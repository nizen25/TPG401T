/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.business;

import java.util.List;
import javax.ejb.Local;
import za.org.dha.entities.Cell;

/**
 *
 * @author Katlego
 */
@Local
public interface CellFacadeLocal {

    void create(Cell cell);

    void edit(Cell cell);

    void remove(Cell cell);

    Cell find(Object id);

    List<Cell> findAll();

    List<Cell> findRange(int[] range);

    int count();
    
}
