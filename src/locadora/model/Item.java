/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Item {
    
    private Integer codItem;
    private String title;
    private double price;
    private String type;
    private Date dateRental;
    private Date dateReturn;
    private Film film;
    private Client client;

    public Item() {
    }

    public Item(Integer codFilme,String type, double price) {
        
        this.type = type;
        this.price = price;
        Film filme = new Film();
        film.setCodFilm(codFilme);
        this.film = filme;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateRental() {
        return dateRental;
    }

    public void setDateRental(Date dateRental) {
        this.dateRental = dateRental;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   public void cadastrarItem(Item item){
       
   }
    
}
