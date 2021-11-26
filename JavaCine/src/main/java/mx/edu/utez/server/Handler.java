package mx.edu.utez.server;

import com.example.JavaCine.database.ConnectionMySQL;

import java.sql.*;

public class Handler {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public boolean createPelicula(String titulo, String descripcion, String sinopsis, int rating, String fecha_registro, String fecha_actualizacion, int estado, int id_categoria){

        boolean state = false;
        try{
            con = ConnectionMySQL.getConnection();
            String query = "INSERT INTO pelicula (titulo, descripcion, sinopsis, rating, fecha_registro, fecha_actualizacion, estado, id_categoria) VALUES(?,?,?,?,?,?,?,?);";
            pstm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1,titulo);
            pstm.setString(2,descripcion);
            pstm.setString(3,sinopsis);
            pstm.setInt(4,rating);
            pstm.setString(5,fecha_registro);
            pstm.setString(6,fecha_actualizacion);
            pstm.setInt(7,estado);
            pstm.setInt(8,id_categoria);
            state = pstm.executeUpdate() == 1;
            rs = pstm.getGeneratedKeys();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally {
            closeConnection();
        }
        return state;
    }

    public boolean updatePelicula(String titulo, String descripcion, String sinopsis, int rating, String fecha_registro, String fecha_actualizacion, int estado, int id_categoria){

        boolean state = false;
        try{
            con = ConnectionMySQL.getConnection();
            String query = "UPDATE pelicula SET pelicula.titulo = ?, pelicula.descripcion = ?, pelicula.sinopsis = ?, pelicula.rating = ?, pelicula.fecha_registro = ?, pelicula.fecha_actualizacion = ?, pelicula.estado = ?, pelicula.id_categoria = ?  WHERE pelicula.id = ?;";
            pstm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1,titulo);
            pstm.setString(2,descripcion);
            pstm.setString(3,sinopsis);
            pstm.setInt(4,rating);
            pstm.setString(5,fecha_registro);
            pstm.setString(6,fecha_actualizacion);
            pstm.setInt(7,estado);
            pstm.setInt(8,id_categoria);
            state = pstm.executeUpdate() == 1;
            rs = pstm.getGeneratedKeys();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally {
            closeConnection();
        }
        return state;
    }

    public boolean deletePelicula(int id){

        boolean state = false;
        try{
            con = ConnectionMySQL.getConnection();
            String query = "DELETE FROM pelicula WHERE pelicula.id = ?;";
            pstm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstm.setInt(1,id);
            state = pstm.executeUpdate() == 1;
            rs = pstm.getGeneratedKeys();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally {
            closeConnection();
        }
        return state;
    }

    public boolean readPelicula(int id){

        boolean state = false;
        try{
            con = ConnectionMySQL.getConnection();
            String query = "SELECT FROM pelicula WHERE pelicula.id = ?;";
            pstm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstm.setInt(1,id);
            state = pstm.executeUpdate() == 1;
            rs = pstm.getGeneratedKeys();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally {
            closeConnection();
        }
        return state;
    }


    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}