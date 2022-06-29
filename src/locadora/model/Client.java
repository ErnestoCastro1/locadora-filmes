/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import locadora.dao.ClientDAO;
import locadora.dao.ExceptionDAO;

/**
 *
 * @author Aluno
 */

public class Client {

    private Integer codClient;
    private String name;
    private String nif;
    private String email;
    private String address;
    private Date dtBirth;
    private List<Item> itens = new ArrayList<Item>();

    public Client() {
    }

    public Client(String name, String nif, String email, String endereco, Date dtBirth) {
        this.name = name;
        this.nif = nif;
        this.email = email;
        this.address = endereco;
        this.dtBirth = dtBirth;
    }

    public Integer getCodClient() {
        return codClient;
    }

    public void setCodClient(Integer codClient) {
        this.codClient = codClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDtBirth() {
        return dtBirth;
    }

    public void setDtBirth(Date dtBirth) {
        this.dtBirth = dtBirth;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void cadastrarClient(Client clint) throws ExceptionDAO{
        new ClientDAO().cadastrarClient(clint);
    }
    
    public ArrayList<Client> consultClient(String name) throws ExceptionDAO{
        return new ClientDAO().consutClient(name);
    }
    public void updateClient(Client client) throws ExceptionDAO{
        new ClientDAO().updateClient(client);
    }
    
    public void deleteClient(Client client) throws ExceptionDAO{
        new ClientDAO().deleteClient(client);
    }
    
}
