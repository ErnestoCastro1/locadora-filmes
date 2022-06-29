/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;
import java.util.List;
import locadora.dao.ExceptionDAO;
import locadora.dao.FilmDAO;

/**
 *
 * @author Ernesto.Castro
 */
public class Film {
    private Integer codFilm;
    private String title;
    private String gender;
    private String synopsis;
    private Integer duration;
    private List<Item> itens = new ArrayList<Item>();
    private List<Actor> actors = new ArrayList<Actor>();

    public Film() {
    }

    public Film(String title, String gender, String synopsis, Integer duration) {
        this.title = title;
        this.gender = gender;
        this.synopsis = synopsis;
        this.duration = duration;
    }

    
    
    
    
    public Integer getCodFilm() {
        return codFilm;
    }

    public void setCodFilm(Integer codFilm) {
        this.codFilm = codFilm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
    

   public void cadastrarFilme(Film film) throws ExceptionDAO{
       new FilmDAO().cadastrarFilm(film);
    } 
    
   public ArrayList<Film> consultFilm(String name) throws ExceptionDAO{
       return new FilmDAO().listarFilms(name);
   }
   
   public void updateFilm(Film film) throws ExceptionDAO{
       new FilmDAO().updateFilm(film);
   }
   
   
   public void deleteFilm(Film film) throws ExceptionDAO{
       new FilmDAO().deleteFilm(film);
   }
    
    
}
