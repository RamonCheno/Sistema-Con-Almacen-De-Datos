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
import javax.swing.table.DefaultTableModel;

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
                    + "empresaDev_id_empresaDev, empresaEditora_id_empresaEditora) Values (?,?,?,?,?,?,?);";
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
            sql = "Select nombreDeveloper from bd_tienda.empresadev";
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
    
    public ArrayList listaEmpresaEdit(){
        ArrayList empresaEditList = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql;
        ResultSet result = null;
        try {
            sql = "Select nombreEmpresaEditora from bd_tienda.empresaeditora";
            ps = con.prepareStatement(sql);
            result = ps.executeQuery();
            while(result.next() == true){
                productD = new Productos();
                productD.setEmpresaEditor(result.getString("nombreEmpresaEditora"));
                empresaEditList.add(productD);
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
        return empresaEditList;
    }
    
    public ArrayList<Productos> mostrarVideojuego(){
        /*
            select v.Id_videojuegos, v.Nombre, v.Genero, v.fechaLanzamiento, v.plataforma, v.numVentas, dev.nombreDeveloper, 
            edit.nombreEmpresaEditora
            from videojuegos as v
            inner join empresadev as dev on v.empresaDev_id_empresaDev = dev.id_empresaDev 
            inner join empresaeditora as edit on v.empresaEditora_id_empresaEditora = edit.id_empresaEditora;
        */
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql;
        ResultSet rs = null;
        ArrayList<Productos> lista = new ArrayList<>();
            
        try {
            sql= """
                 select v.Id_videojuegos, v.Nombre, v.Genero, v.fechaLanzamiento, v.plataforma, v.numVentas, dev.nombreDeveloper, 
                    edit.nombreEmpresaEditora
                from videojuegos as v
                inner join empresadev as dev on v.empresaDev_id_empresaDev = dev.id_empresaDev 
                inner join empresaeditora as edit on v.empresaEditora_id_empresaEditora = edit.id_empresaEditora
                order by v.Id_videojuegos asc
                 """;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                productD = new Productos();
                productD.setIdVideojuego(rs.getInt("v.Id_videojuegos"));
                productD.setNombreVideojuego(rs.getString("v.Nombre"));
                productD.setGeneroVideojuego(rs.getString("v.Genero"));
                productD.setFechaLanzamiento(rs.getDate("v.fechaLanzamiento"));
                productD.setPlataforma(rs.getString("v.plataforma"));
                productD.setNumVentas(rs.getInt("v.numVentas"));
                productD.setEmpresaDev(rs.getString("dev.nombreDeveloper"));
                productD.setEmpresaEditor(rs.getString("edit.nombreEmpresaEditora"));
                lista.add(productD);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        finally{
            try {
                con.close();
                ps.close();
                rs.close();
                
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return lista;
    }
}
