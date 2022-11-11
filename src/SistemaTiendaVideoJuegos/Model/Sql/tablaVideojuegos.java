/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model.Sql;

import SistemaTiendaVideoJuegos.Model.Productos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.util.ArrayList;

public class tablaVideojuegos extends ConnectionMySQL {

    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    public boolean registrarProducto(Productos pro) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql;
        CallableStatement sp = null;
        try {
            sql = "call agregarVideojuego(?,?,?,?,?,?,?)";
            sp = con.prepareCall(sql);
            sp.setString(1, pro.getNombreVideojuego());
            sp.setString(2, pro.getGeneroVideojuego());
            sp.setString(3, formato.format(pro.getFechaLanzamiento()));
            sp.setString(4, pro.getPlataforma());
            sp.setInt(5, pro.getNumVentas());
            sp.setInt(6, pro.getIdeEmpresaDev());
            sp.setInt(7, pro.getIdEmpresaEditor());

            sp.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
                sp.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean registrarEmpresaDev(Productos pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "call agregarNombreEmpresaDev(?)";
        CallableStatement sp = null;
        try {
            sp = con.prepareCall(sql);
            sp.setString(1, pro.getEmpresaDev());

            sp.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean registrarEmpresaEdit(Productos pro) {
        //PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "call agregarNombreEmpresarEditora(?)";
        CallableStatement sp = null;

        try {
            sp = con.prepareCall(sql);
            //ps = con.prepareStatement(sql);

            sp.setString(1, pro.getEmpresaEditor());
            sp.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    Productos productD;

    public ArrayList listaEmpesaDev() {
        ArrayList empresaDevList = new ArrayList<>();
        Connection con = getConexion();
        String sql;
        ResultSet result = null;
        CallableStatement sp = null;
        sql = "call mostrarListaEmpresasDev()";
        try {
            sp = con.prepareCall(sql);
            result = sp.executeQuery();
            while (result.next() == true) {
                productD = new Productos();
                productD.setEmpresaDev(result.getString("nombreDeveloper"));
                empresaDevList.add(productD);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return empresaDevList;
    }

    public ArrayList listaEmpresaEdit() {
        ArrayList empresaEditList = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = getConexion();
        CallableStatement sp = null;
        String sql;
        ResultSet result = null;
        sql = "call mostrarListaEmpresaEditora()";
        try {
            sp = con.prepareCall(sql);
            //sql = "Select nombreEmpresaEditora from bd_tienda.empresaeditora";
            //ps = con.prepareStatement(sql);
            result = sp.executeQuery();
            while (result.next() == true) {
                productD = new Productos();
                productD.setEmpresaEditor(result.getString("nombreEmpresaEditora"));
                empresaEditList.add(productD);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return empresaEditList;
    }

    public ArrayList<Productos> mostrarVideojuego() {

        PreparedStatement ps = null;
        Connection con = getConexion();;
        String sql;
        ResultSet rs = null;
        CallableStatement sp = null;
        ArrayList<Productos> lista = new ArrayList<>();
        sql = "call tablaVideojuegosCompleto()";
        try {
            sp = con.prepareCall(sql);

            /*sql= """
                 select v.Id_videojuegos, v.Nombre, v.Genero, v.fechaLanzamiento, v.plataforma, v.numVentas, dev.nombreDeveloper, 
                    edit.nombreEmpresaEditora
                from videojuegos as v
                inner join empresadev as dev on v.empresaDev_id_empresaDev = dev.id_empresaDev 
                inner join empresaeditora as edit on v.empresaEditora_id_empresaEditora = edit.id_empresaEditora
                order by v.Id_videojuegos asc
                 """;
            ps = con.prepareStatement(sql);*/
            rs = sp.executeQuery();
            while (rs.next()) {
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
        } finally {
            try {
                con.close();
                sp.close();
                rs.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return lista;
    }

    public boolean eliminarProducto(Productos pro) {

        Connection con = getConexion();
        String sql;
        PreparedStatement ps = null;
        try {
            sql = "delete from videojuegos where Nombre = ?";

            ps = con.prepareStatement(sql);

            ps.setString(1, pro.getNombreVideojuego());

            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean modificarProductos(Productos pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql;
        CallableStatement sp = null;
        try {
            sql = """
                  update videojuegos set Nombre = ?, Genero = ?, fechaLanzamiento = ?, plataforma = ?, 
                  numVentas = ?, empresaDev_id_empresaDev = ?, empresaEditora_id_empresaEditora = ? where Id_videojuegos = ?;""";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombreVideojuego());
            ps.setString(2, pro.getGeneroVideojuego());
            ps.setString(3, formato.format(pro.getFechaLanzamiento()));
            ps.setString(4, pro.getPlataforma());
            ps.setInt(5, pro.getNumVentas());
            ps.setInt(6, pro.getIdeEmpresaDev());
            ps.setInt(7, pro.getIdEmpresaEditor());
            ps.setInt(8, pro.getIdVideojuego());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean buscarProducto(Productos pro) {
        Connection con = getConexion();
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            sql = """
                  select v.Id_videojuegos, v.Nombre, v.Genero, v.fechaLanzamiento, v.plataforma, v.numVentas, dev.nombreDeveloper, 
                  \t\tedit.nombreEmpresaEditora
                    from videojuegos as v
                    join empresadev as dev on v.empresaDev_id_empresaDev = dev.id_empresaDev 
                    inner join empresaeditora as edit on v.empresaEditora_id_empresaEditora = edit.id_empresaEditora
                    where v.Nombre = ?;""";
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombreVideojuego());
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setIdVideojuego(rs.getInt("v.Id_videojuegos"));
                pro.setNombreVideojuego(rs.getString("v.Nombre"));
                pro.setGeneroVideojuego(rs.getString("v.Genero"));
                pro.setFechaLanzamiento(rs.getDate("v.fechaLanzamiento"));
                pro.setPlataforma(rs.getString("v.plataforma"));
                pro.setNumVentas(rs.getInt("v.numVentas"));
                pro.setEmpresaDev(rs.getString("dev.nombreDeveloper"));
                pro.setEmpresaEditor(rs.getString("edit.nombreEmpresaEditora"));
            }
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
}
