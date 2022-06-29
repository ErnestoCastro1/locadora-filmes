/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import locadora.dao.ExceptionDAO;
import locadora.model.Client;

/**
 *
 * @author Ernesto.Castro
 */
public class ClientController {
    
    public boolean cadastrarClient(String name, String nif, String email, String address, String dtBirth) throws ParseException, ExceptionDAO{
        
        if(name != null && name.length()>0 && validNif(nif) && email != null && email.length()>0 && address != null 
                && address.length()>0 && validBirth(dtBirth)){
       
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formato.parse(dtBirth);
            Client client = new Client(name, nif, email, address, date);
            client.cadastrarClient(client);
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Client> consultClient(String name) throws ExceptionDAO{
        return new Client().consultClient(name);
    }
    
    public boolean validNif(String nif){
        for(int i=0;i< nif.length();i++){
            if(!Character.isDigit(nif.charAt(i))){
                if (! (i == 3 || i == 7 || i == 11)){
                    return false;
                }
            }
        }
    return true;
    }
    
    
    public boolean validBirth(String dtbirth){
        for(int i=0;i< dtbirth.length();i++){
            if(!Character.isDigit(dtbirth.charAt(i))){
                if (!(i == 2 || i == 5)){
                    return false;
                }
            }
        }
    return true;
    }
    
    
    public boolean updateClient(int codClient, String name, String nif, String email, String address, String dtBirth) throws ParseException, ExceptionDAO{
        
        if(name != null && name.length()>0 && validNif(nif) && email != null && email.length()>0 && address != null 
                && address.length()>0 && validBirth(dtBirth)){
       
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formato.parse(dtBirth);
            Client client = new Client(name, nif, email, address, date);
            client.setCodClient(codClient);
            client.updateClient(client);
            return true;
        }
        
        return false;
    }
    
    
    public boolean deleteClient(int CodClient) throws ExceptionDAO{
        if(CodClient == 0){
            return false;
        } else {
            Client client = new Client();
            client.setCodClient(CodClient);
            client.deleteClient(client);
            return true;
        }
    } 
}
