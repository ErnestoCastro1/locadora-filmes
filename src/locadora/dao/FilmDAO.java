/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import locadora.model.Film;

/**
 *
 * @author Aluno
 */
public class FilmDAO {

    public void cadastrarFilm(Film film) throws ExceptionDAO{

        String sql = "insert into film (title, gender, synopsis, duration) value(?,?,?,?)";
        PreparedStatement pStarement = null;
        Connection connection = null;

        try{
            connection = new ConnectionMVC().getConnection();
            pStarement = connection.prepareStatement(sql);
            pStarement.setString(1, film.getTitle());
            pStarement.setString(2, film.getGender());
            pStarement.setString(3, film.getSynopsis());
            pStarement.setInt(4, film.getDuration());
            pStarement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o filme: " + e);
        }

        finally{
            try{
                if(pStarement != null){pStarement.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statament: " + e);
            }
            try{
                if(connection != null){connection.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connection: " + e);
            }
        }
    }

    public ArrayList<Film> listarFilms(String nome) throws ExceptionDAO{

        String sql = "select * from film where title like '%" + nome + "%' order by title";

        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Film> filmes = null;

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if(rs != null){
                filmes = new ArrayList<>();
                while(rs.next()){
                    Film filme = new Film();
                    filme.setCodFilm(rs.getInt("codFilm"));
                    filme.setTitle(rs.getString("title"));
                    filme.setGender(rs.getString("gender"));
                    filme.setSynopsis(rs.getString("synopsis"));
                    filme.setDuration(rs.getInt("duration"));
                    filmes.add(filme);
                }
            }


        } catch(SQLException e){
            throw new ExceptionDAO("Erro ao consultar filme: " + e);
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
        return filmes;
    }

    public void updateFilm(Film film) throws ExceptionDAO{

        String sql = "Update film set title =?, gender = ?, synopsis = ?, duration = ? where codFilm = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, film.getTitle());
            pStatement.setString(2, film.getGender());
            pStatement.setString(3, film.getSynopsis());
            pStatement.setInt(4, film.getDuration());
            pStatement.setInt(5, film.getCodFilm());
            pStatement.execute();
            
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao atualizar as informções do filme");
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
    
    public void deleteFilm(Film film) throws ExceptionDAO{

        String sql = "delete from film where codFilm = ?";
        PreparedStatement pStarement = null;
        Connection connection = null;

        try{
            connection = new ConnectionMVC().getConnection();
            pStarement = connection.prepareStatement(sql);
            pStarement.setInt(1, film.getCodFilm());
            pStarement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("Erro ao apagar filme: " + e);
        }

        finally{
            try{
                if(pStarement != null){pStarement.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar statament: " + e);
            }
            try{
                if(connection != null){connection.close();}
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar connection: " + e);
            }
        }
    }


}
