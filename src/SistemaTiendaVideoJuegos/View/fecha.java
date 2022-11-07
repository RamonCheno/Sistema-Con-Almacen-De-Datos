/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaTiendaVideoJuegos.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaStr = "23/11/2015";
            Date fecha = formato.parse(fechaStr);
            System.out.println(formato.format(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
