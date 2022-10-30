/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Ramon Cheno Ocaño
 */
public class tablaVideojuegos extends ConnectionMySQL{
    
    public boolean registrarProducto(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql;
        
        try {
            sql = "INSERT INTO bd_tienda.videojuegos(Nombre, Genero, Descripcion, fechaLanzamiento ) VALUES(? ? ? ? ? ? )";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getGeneroVideogame());
            ps.setString(3, pro.getDescripcion());
            ps.setString(4, pro.getFechaLanzamiento());
            ps.execute();
            
            sql = "INSERT INTO bd_tienda.Ventas(numVentas) VALUE(?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getVentas());
            
            sql = "INSERT INTO bd_tienda.empresaDev(nombreDeveloper) value(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getDesarrollador());
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
    
}
