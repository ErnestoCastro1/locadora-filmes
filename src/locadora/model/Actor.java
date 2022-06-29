/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;
import java.util.List;
import locadora.dao.ActorDAO;
import locadora.dao.ExceptionDAO;

/**
 *
 * @author Ernesto.Castro
 */
public class Actor {
    
    private Integer codctor;
    private String name;
    private String nationality;
    private List<Film> Films = new ArrayList<Film>();

    public Actor() {
    }

    public Actor(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public Integer getCodctor() {
        return codctor;
    }

    public void setCodctor(Integer codctor) {
        this.codctor = codctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Film> getFilms() {
        return Films;
    }

    public void setFilms(List<Film> Films) {
        this.Films = Films;
    }
    
    
    public void cadastarActor(Actor actor) throws ExceptionDAO{
        new ActorDAO().cadastrarActor(actor);
    }
    
    
    public ArrayList<Actor> consultarActor(String name) throws ExceptionDAO {
        return new ActorDAO().consultActor(name);
    }
    public void updateActor(Actor actor) throws ExceptionDAO{
        new ActorDAO().updateActor(actor);
    }
    
    public void deleteActor(Actor actor) throws ExceptionDAO{
        new ActorDAO().deleteActor(actor);
    }
    
}
