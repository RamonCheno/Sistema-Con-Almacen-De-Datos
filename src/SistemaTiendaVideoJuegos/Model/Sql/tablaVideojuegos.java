/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model.Sql;

import SistemaTiendaVideoJuegos.Model.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class tablaVideojuegos extends ConnectionMySQL {

    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    public boolean registrarProducto(Productos pro) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql;
        try {
            sql = "Insert into bd_tienda.videojuegos(Nombre, Genero,"
                    + "fechaLanzamiento, plataforma, numVentas, "
                    + "empresaDev_id_empresaDev) Values (?,?,?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombreVideojuego());
            ps.setString(2, pro.getGeneroVideojuego());
            ps.setString(3, formato.format(pro.getFechaLanzamiento()));
            ps.setString(4, pro.getPlataforma());
            ps.setInt(5, pro.getNumVentas());
            ps.setInt(6, pro.getIdeEmpresaDev());
            ps.setInt(7, pro.getIdEmpresaEditor());

            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    
    public boolean registrarEmpresaDev(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Insert into bd_tienda.empresadev(nombreDeveloper) Value(?);";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getEmpresaDev());
            
            ps.execute();
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
    
    public boolean registrarEmpresaEdit(Productos pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Insert into bd_tienda.empresaeditora(nombreEmpresaEditora) Value(?);";
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, pro.getEmpresaEditor());
            ps.execute();
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
    
    Productos productD;
    public ArrayList listaEmpesaDev(){
        ArrayList empresaDevList = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql;
        ResultSet result = null;
        
        try {
            sql = "Select nombreDeveloper from bd_tienda.empresadev order by nombreDeveloper ASC";
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            while(result.next()==true){
                productD = new Productos();
                productD.setEmpresaDev(result.getString("nombreDeveloper"));
                empresaDevList.add(productD);
            }
         } catch (SQLException e) {
            System.err.println(e);
        }
        finally{
            try {
                con.close();
                
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return empresaDevList;
    }
    
}
