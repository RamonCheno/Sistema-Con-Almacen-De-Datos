/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Model.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class ConnectionMySQL {
    public static final String URL = "jdbc:mysql://localhost:3306/bd_tienda";
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, USER);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}
