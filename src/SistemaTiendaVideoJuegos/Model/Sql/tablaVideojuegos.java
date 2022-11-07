/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model.Sql;

import SistemaTiendaVideoJuegos.Model.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class tablaVideojuegos extends ConnectionMySQL{
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    public boolean registrarProductos(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql;
        
        try {
            sql = "INSERT INTO bd_tienda.videojuegos(Nombre, Genero,"
                    + "fechaLanzamiento, plataforma, numVentas) VALUES(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getGeneroVideogame());
            ps.setString(3, formato.format(pro.getFechaLanzamiento()));
            ps.setString(4, pro.getPlataforma());
            ps.setInt(5, pro.getVentas());
            ps.executeUpdate();
            
            sql = "INSERT INTO bd_tienda.empresaDev(nombreDeveloper) value(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDesarrollador());
            
            ps.executeUpdate();
            
            sql = "INSERT INTO bd_tienda.empresaeditora(nombreEmpresaEditora) value(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDistribuidor());
            ps.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    
    public boolean registroEmpresaDesarrolladora(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql;
        
        try {
            sql = "INSERT INTO bd_tienda.empresaDev(nombreDeveloper) value(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDesarrollador());
            ps.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    
    public boolean registrarEmpresaEditora(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql;
        
        try {
            
            sql = "INSERT INTO bd_tienda.empresaeditora(nombreEmpresaEditora) value(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDistribuidor());
            ps.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    
    public boolean modificar(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql;
        
        try {
            sql = "UPDATE bd_tienda.videojuegos set Nombre=?, Genero=?,"
                    +"fechaLanzamiento=?, plataforma=? Where Id_videojuego";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getGeneroVideogame());
            ps.setString(3, pro.getFechaLanzamiento().toString());
            ps.setString(4, pro.getPlataforma());
            ps.setInt(5, pro.getId());
            ps.execute();
            
            
            sql = "UPDATE bd_tienda.ventas set numVentas=? where id_Ventas=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getVentas());
            
            ps.executeUpdate(); 
            
            sql = "UPDATE bd_tienda.empresadev set nombreDeveloper=? where id_empresaDev=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDesarrollador());
            
            ps.executeUpdate();
            
            sql = "UPDATE bd_tienda.empresaeditora set nombreEmpresaEditoraa=? where id_empresaEditora=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDistribuidor());
            ps.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    public boolean eliminar(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Delete From bd_tienda.videojuego Where id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        
    }
    public boolean buscar(Productos pro){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "Select * from bd_tienda.videojuegos where Nombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.executeQuery();
            
            if(rs.next())
            {
                pro.setId(Integer.parseInt(rs.getString("Id_videojuego")));
                pro.setNombre(rs.getString("Nombre"));
                pro.setGeneroVideogame(rs.getString("Genero"));
                try {
                    pro.setFechaLanzamiento(formato.parse(rs.getString("fechaLanzamiento")));
                } catch (ParseException ex) {
                    Logger.getLogger(tablaVideojuegos.class.getName()).log(Level.SEVERE, null, ex);
                }
                pro.setPlataforma(rs.getString("plataforma"));
                pro.setVentas(Integer.parseInt(rs.getString("numVentas")));
                pro.setDesarrollador(rs.getString("nombreDeveloper"));
                pro.setDistribuidor(rs.getString("nombreEmpresaEditora"));
                return true;
            }
            
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
