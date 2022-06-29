/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Client;

/**
 *
 * @author Aluno
 */
public class ClientDAO {
    
    public void cadastrarClient(Client client) throws ExceptionDAO{
        
        String sql = "insert into client(name, nif, email, address, dtBirth) value(?,?,?,?,?)";
    
        PreparedStatement pStatement = null;
        Connection connection = null;
    
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, client.getName());
            pStatement.setString(2, client.getNif());
            pStatement.setString(3, client.getEmail());
            pStatement.setString(4, client.getAddress());
            pStatement.setDate(5, new Date(client.getDtBirth().getTime()));
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar cliente: " + e);
        }
        
        finally{
            
            try{
                if(pStatement != null){pStatement.close();}
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statement: " + e);
            }
            
            try {
                if(connection != null){connection.close();}
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connections: " + e);
            }
        }
    
    }
    
    public ArrayList<Client> consutClient(String name) throws ExceptionDAO{
        
        String sql = "select * from client where name like '%" + name + "%' order by name";
        
        PreparedStatement pStatement = null;
        Connection connection = null;
        ArrayList<Client> clients = null;
        
        try{
            
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if(rs != null){
                clients = new ArrayList<Client>();
                while(rs.next()){
                    Client client = new Client();
                    client.setCodClient(rs.getInt("codClient"));
                    client.setName(rs.getString("name"));
                    client.setNif(rs.getString("nif"));
                    client.setEmail(rs.getString("email"));
                    client.setAddress(rs.getString("address"));
                    client.setDtBirth(rs.getDate("dtBirth"));
                    clients.add(client);
                }
            }
        }catch(SQLException e){
            throw new ExceptionDAO("Falha ao consultar client: " + e);
        }
        
        finally {
            try{
                if(pStatement != null){pStatement.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Falha ao fechar statemnt: " + e);
            }
            
            try{
                if(connection != null){connection.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Falha ao fechar connetion: " + e);
            }
        }
        
        
        
        return clients;
    }
    
    public void updateClient(Client client) throws ExceptionDAO{
        
        String sql = "Update client set name = ?, nif = ?, email = ?, address = ?, dtBirth = ? where codClient = ?";
    
        PreparedStatement pStatement = null;
        Connection connection = null;
    
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, client.getName());
            pStatement.setString(2, client.getNif());
            pStatement.setString(3, client.getEmail());
            pStatement.setString(4, client.getAddress());
            pStatement.setDate(5, new Date(client.getDtBirth().getTime()));
            pStatement.setInt(6, client.getCodClient());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao atualizar cliente: " + e);
        }
        
        finally{
            
            try{
                if(pStatement != null){pStatement.close();}
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statement: " + e);
            }
            
            try {
                if(connection != null){connection.close();}
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connections: " + e);
            }
        }
    
    }
    
    
    public void deleteClient(Client client) throws ExceptionDAO {
        
        String sql = "delete from client where codClient = ?";
        
        PreparedStatement pStatement = null;
        Connection connection = null;
    
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, client.getCodClient());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao atualizar cliente: " + e);
        }
        
        finally{
            
            try{
                if(pStatement != null){pStatement.close();}
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statement: " + e);
            }
            
            try {
                if(connection != null){connection.close();}
                
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connections: " + e);
            }
        }
    
    
        
        
    }
    
    
    
   
}
