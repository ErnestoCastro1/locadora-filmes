/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import locadora.model.Actor;
import locadora.model.Film;


/**
 *
 * @author Ernesto.Castro
 */
public class ActorDAO {
    
public void cadastrarActor(Actor actor) throws ExceptionDAO{
    
    String sql = "insert into actor(name, nationality) value(?,?)";
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try{
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, actor.getName());
        pStatement.setString(2, actor.getNationality());
        pStatement.execute();
    }catch(SQLException e){
     throw new ExceptionDAO("Erro ao cadastrar actor : " + e);
    }
    finally {
        try{
            if(pStatement != null){
                pStatement.close();
            }
        } catch(SQLException e){
            throw new ExceptionDAO("Erro ao fechar statement: " + e);
        }
        
        try{
            if(connection != null){
                connection.close();
            }
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao fechar connection: " + e);
           }
    }
    
}    
 public ArrayList<Actor> consultActor(String name) throws ExceptionDAO{
     
     String sql ="select * from actor where name like '%" + name + "%' order by name";
     
     PreparedStatement pStatement = null;
     Connection connection = null;
     ArrayList<Actor> actors = null;
     
     try{
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        ResultSet rs = pStatement.executeQuery(sql);
        if(rs != null){
           actors = new ArrayList<Actor>();
           while(rs.next()){
               Actor actor = new Actor();
               actor.setCodctor(rs.getInt("codActor"));
               actor.setName(rs.getString("name"));
               actor.setNationality(rs.getString("nationality"));
               actors.add(actor);
           }
        }
     }catch(SQLException e){
         throw new ExceptionDAO("Falha ao consultar actor: " + e);
     }
     finally {
        try {
            if(pStatement != null){pStatement.close();}
        }catch(SQLException e){
            throw new ExceptionDAO("Falha ao fechar statement: " + e);
        }
        try{
            if(connection != null){connection.close();}
        }catch(SQLException e){
            throw new ExceptionDAO("Falha ao fechar connetion: " + e);
        }
        
     }
     return actors;
 }
 public void updateActor(Actor actor) throws ExceptionDAO{

        String sql = "Update actor set name =?, nationality = ? where codActor = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, actor.getName());
            pStatement.setString(2, actor.getNationality());
            pStatement.setInt(3, actor.getCodctor());
            pStatement.execute();
            
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao atualizar as informções do actor");
        }
        
        finally{

            try{
                if(pStatement != null){pStatement.close();}

            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statement: " + e);
            }

            try{
                if(connection != null){connection.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connetion:" + e);
            }
        }

    }
 
    public void deleteActor(Actor actor) throws ExceptionDAO{
        
        String sql = "delete from actor where codActor = ?";
        
          PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, actor.getCodctor());
            pStatement.execute();
            
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao apagar actor");
        }
        
        finally{

            try{
                if(pStatement != null){pStatement.close();}

            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statement: " + e);
            }

            try{
                if(connection != null){connection.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connetion:" + e);
            }
        }

   }
      
}
