/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaTiendaVideoJuegos.Controller;

//Paquetes importadas
import SistemaTiendaVideoJuegos.Model.Productos;
import SistemaTiendaVideoJuegos.Model.Sql.tablaVideojuegos;
import SistemaTiendaVideoJuegos.View.ProductosForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class ControllerProduct implements ActionListener {

    private Productos productC;
    private tablaVideojuegos tbGameC;
    private ProductosForm productF;

    public ControllerProduct(Productos productC, tablaVideojuegos tbGameC, ProductosForm productF) {
        this.productC = productC;
        this.tbGameC = tbGameC;
        this.productF = productF;
        this.productF.getSaveBtn().addActionListener(this);
        this.productF.getSaveDevBtn().addActionListener(this);
        this.productF.getUpdateBtn().addActionListener(this);
        this.productF.getDeleteBtn().addActionListener(this);
        this.productF.getSearchBtn().addActionListener(this);
        this.productF.getDataMartBtn().addActionListener(this);
        this.productF.getSaveEditBtn().addActionListener(this);
        listaEmpresaDev();
    }

    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == productF.getSaveBtn()) {
            actionSaveData();
        }
        if (e.getSource() == productF.getSaveDevBtn()) {
            actionSaveDev();
        }
        if (e.getSource() == productF.getSaveEditBtn()) {
            actionSaveEdit();
        }
    }

    private void actionSaveEdit() {
        productC.setEmpresaEditor(productF.getEditCB().getSelectedItem().toString());
        if (tbGameC.registrarEmpresaEdit(productC)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            limpiar();
        }
    }

    private void listaEmpresaDev() {
        productF.getDevCB().removeAllItems();
        tbGameC = new tablaVideojuegos();
        ArrayList<Productos> listaDev = tbGameC.listaEmpesaDev();
        productF.getDevCB().addItem("Seleccione la empresa de desarrollador del videojuego");
        for (int i = 0; i < listaDev.size(); i++) {
            productF.getDevCB().addItem(listaDev.get(i).getEmpresaDev());
        }
    }

    private void actionSaveDev() {
        productC.setEmpresaDev(productF.getDevCB().getSelectedItem().toString());
        if (tbGameC.registrarEmpresaDev(productC)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            limpiar();
        }
    }

    private void actionSaveData() {
        productC.setNombreVideojuego(productF.getNameTxt().getText());
        productC.setGeneroVideojuego(productF.getGenderTxt().getText());
        try {
            productC.setFechaLanzamiento(formato.parse(productF.getDateTxt().getText()));
        } catch (ParseException ex) {
            Logger.getLogger(ControllerProduct.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }
        productC.setNumVentas(Integer.parseInt(productF.getSalesTxt().getText()));
        productC.setPlataforma(productF.getPlatformTxt().getText());
        productC.setIdeEmpresaDev(productF.getDevCB().getSelectedIndex());
        //productC.setIdEmpresaEditor(productF.getEditCB().getSelectedIndex());
        if (tbGameC.registrarProducto(productC)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            limpiar();
        }
    }

    public void limpiar() {
        productF.getIdTxt().setText(null);
        productF.getNameTxt().setText(null);
        productF.getGenderTxt().setText(null);
        productF.getDateTxt().setText("Año/Mes/Dia");
        productF.getSalesTxt().setText(null);
        productF.getPlatformTxt().setText(null);
    }

}
