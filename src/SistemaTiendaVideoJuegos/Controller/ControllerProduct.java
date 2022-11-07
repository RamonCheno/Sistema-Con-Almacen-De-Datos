/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Controller;

import SistemaTiendaVideoJuegos.Model.Productos;
import SistemaTiendaVideoJuegos.Model.Sql.tablaVideojuegos;
import SistemaTiendaVideoJuegos.View.ProductosForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class ControllerProduct implements ActionListener {

    private final Productos productC;
    private final tablaVideojuegos tb_GamesC;
    private final ProductosForm productF;

    public ControllerProduct(Productos productC, tablaVideojuegos tb_GamesC,
            ProductosForm productF) {
        this.productC = productC;
        this.tb_GamesC = tb_GamesC;
        this.productF = productF;
        this.productF.getSaveBtn().addActionListener(this);
        this.productF.getUpdateBtn().addActionListener(this);
        this.productF.getDeleteBtn().addActionListener(this);
        this.productF.getSearchBtn().addActionListener(this);
        this.productF.getDataMartBtn().addActionListener(this);
    }
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == productF.getSaveBtn()) {
            productC.setNombre(productF.getNameTxt().getText());
            productC.setGeneroVideogame(productF.getGenderTxt().getText());
            try {
                productC.setFechaLanzamiento(formato.parse(productF.getDateTxt().getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControllerProduct.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error: " + ex);
            }
            productC.setVentas(Integer.parseInt(productF.getSalesTxt().getText()));
            productC.setDesarrollador(productF.getDevCompanyTxt().getText());
            productC.setDistribuidor(productF.getDistributionCompanyTxt().getText());
            productC.setPlataforma(productF.getPlatformTxt().getText());

            if (tb_GamesC.registrarProductos(productC)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
        if (e.getSource() == productF.getUpdateBtn()) {
            productC.setId(Integer.parseInt(productF.getIdTxt().getText()));
            productC.setNombre(productF.getNameTxt().getText());
            productC.setGeneroVideogame(productF.getGenderTxt().getText());
            try {
                productC.setFechaLanzamiento(formato.parse(productF.getDateTxt().getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControllerProduct.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error: " + ex);
            }
            productC.setVentas(Integer.parseInt(productF.getSalesTxt().getText()));
            productC.setDesarrollador(productF.getDevCompanyTxt().getText());
            productC.setDistribuidor(productF.getDistributionCompanyTxt().getText());
            productC.setPlataforma(productF.getPlatformTxt().getText());

            if (tb_GamesC.modificar(productC)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }

        if (e.getSource() == productF.getDeleteBtn()) {
            productC.setId(Integer.parseInt(productF.getIdTxt().getText()));

            if (tb_GamesC.eliminar(productC)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        }

        if (e.getSource() == productF.getSearchBtn()) {
            productC.setNombre(productF.getNameTxt().getText());

            if (tb_GamesC.buscar(productC)) {

                productF.getIdTxt().setText(String.valueOf(productC.getId()));
                productF.getNameTxt().setText(productC.getNombre());
                productF.getGenderTxt().setText(productC.getGeneroVideogame());
                productF.getDateTxt().setText(formato.format(productC.getFechaLanzamiento()));
                productF.getSalesTxt().setText(String.valueOf(productC.getVentas()));
                productF.getDevCompanyTxt().setText(productC.getDesarrollador());
                productF.getDistributionCompanyTxt().setText(productC.getDistribuidor());
                productF.getPlatformTxt().setText(productC.getPlataforma());

                JOptionPane.showMessageDialog(null, "Registro Eliminao");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        }

        if (e.getSource() == productF.getDataMartBtn()) {
            //Trabajo en proceso 
        }
    }

    public void limpiar() {
        productF.getIdTxt().setText(null);
        productF.getNameTxt().setText(null);
        productF.getGenderTxt().setText(null);
        productF.getDateTxt().setText("Año/Mes/Dia");
        productF.getSalesTxt().setText(null);
        productF.getDevCompanyTxt().setText(null);
        productF.getDistributionCompanyTxt().setText(null);
        productF.getPlatformTxt().setText(null);
    }

}
