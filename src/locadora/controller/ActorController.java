/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Actor;

/**
 *
 * @author Ernesto.Castro
 */
public class ActorController {
    
    public boolean cadastrarActor(String name, String nationality) throws ExceptionDAO{
        
        if(name != null && name.length() > 0 && nationality != null && nationality.length()> 0){
           Actor actor = new Actor(name, nationality);
           actor.cadastarActor(actor);
           return true;
        }
        return false;
    }
    
    public ArrayList<Actor> consultActor(String name) throws ExceptionDAO{
        return new Actor().consultarActor(name);
    }
    
    
    public boolean updateActor(int codActor, String name, String nationality) throws ExceptionDAO{
        
        if(name != null && name.length() > 0 && nationality != null && nationality.length()> 0){
           Actor actor = new Actor(name, nationality);
           actor.setCodctor(codActor);
           actor.updateActor(actor);
           return true;
        }
        return false;
    }
    
    public boolean deleteActor(int codActor) throws ExceptionDAO{
        if(codActor == 0){
            return false;
        } else {
            Actor actor = new Actor();
            actor.setCodctor(codActor);
            actor.deleteActor(actor);
            return true;
        }
    }
    
}
