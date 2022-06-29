/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.util.ArrayList;
import locadora.dao.ExceptionDAO;
import locadora.model.Film;

/**
 *
 * @author Ernesto.Castro
 */
public class FilmController {
    
    
    public boolean cadastrarFilm(String title, String gender, String synopsis , Integer duration) throws ExceptionDAO{
        
        if(title != null && title.length() >0 && gender != null && gender.length() > 0 && synopsis != null && synopsis.length() > 0 && duration != null && duration > 0){
           Film film = new Film(title, gender, synopsis, duration);
           film.cadastrarFilme(film);
           return true;
        }
           return false;
    }
    
    public ArrayList<Film> consultFilm(String name) throws ExceptionDAO {
        return new Film().consultFilm(name);
        
    }
    
    
    public boolean updateFilm(int codFilm, String title, String gender, String synopsis , Integer duration) throws ExceptionDAO{
        
        if(title != null && title.length() >0 && gender != null && gender.length() > 0 && synopsis != null && synopsis.length() > 0 && duration != null && duration > 0){
           Film film = new Film(title, gender, synopsis, duration);
           film.setCodFilm(codFilm);
           film.updateFilm(film);
           return true;
        }
           return false;
    }
    
    public boolean deleteFilm(int codFilm) throws ExceptionDAO {
        if(codFilm == 0){
            return false;
        } else {
            Film film = new Film();
            film.setCodFilm(codFilm);
            film.deleteFilm(film);
            return true;
        }
    }
    
}
