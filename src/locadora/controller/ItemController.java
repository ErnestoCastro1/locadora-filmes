/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import locadora.dao.ExceptionDAO;
import locadora.model.Item;

/**
 *
 * @author Aluno
 */
public class ItemController {
    
    
    public boolean cadastrarItem(Integer codFilm, String type, double price)throws ExceptionDAO{
        
        
            if(codFilm > 0 && type != null && price > 0){
                Item item = new Item(codFilm, type, price);
                item.cadastrarItem(item);
                return true;
            } else {
                    return false;
            }        
    }
}
