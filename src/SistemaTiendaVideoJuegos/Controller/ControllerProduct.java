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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public final class ControllerProduct implements ActionListener {

    private final Productos productC;
    private tablaVideojuegos tbGameC;
    private final ProductosForm productF;

    public ControllerProduct(Productos productC, tablaVideojuegos tbGameC, ProductosForm productF) {
        this.productC = productC;
        this.tbGameC = tbGameC;
        this.productF = productF;
        botonesEjecutados(this.productF);
        listaEmpresaDev();
        listaEmpresaEdit();
        tablaVideojuegoC();
    }

    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == productF.getSaveBtn()) {
            actionSaveData();
            listaEmpresaDev();
            listaEmpresaEdit();
        }
        if (e.getSource() == productF.getSaveDevBtn()) {
            actionSaveDev();
        }
        if (e.getSource() == productF.getSaveEditBtn()) {
            actionSaveEdit();
        }
        if(e.getSource() == productF.getRefreshCompanyBtn()){
            listaEmpresaDev();
            listaEmpresaEdit();
        }
        if(e.getSource() == productF.getRefreshTableBtn()){
            tablaVideojuegoC();
        }
    }
    
    private void botonesEjecutados(ProductosForm productF){
        productF.getSaveBtn().addActionListener(this);
        productF.getSaveDevBtn().addActionListener(this);
        productF.getUpdateBtn().addActionListener(this);
        productF.getDeleteBtn().addActionListener(this);
        productF.getSearchBtn().addActionListener(this);
        productF.getDataMartBtn().addActionListener(this);
        productF.getSaveEditBtn().addActionListener(this);
        productF.getDevCB().addActionListener(this);
        productF.getRefreshCompanyBtn().addActionListener(this);
        productF.getRefreshTableBtn().addActionListener(this);
    }
    
    public void tablaVideojuegoC(){
        ArrayList<Productos> listaP;
        String[] fila = new String[8];
        DefaultTableModel tablaGameC = new DefaultTableModel();
        tablaGameC.addColumn("Id");
        tablaGameC.addColumn("nombre Videojuego");
        tablaGameC.addColumn("Genero Videojuego");
        tablaGameC.addColumn("Fecha de lanzamiento");
        tablaGameC.addColumn("Plataforma");
        tablaGameC.addColumn("Numero de ventas");
        tablaGameC.addColumn("Empresa Desarrolladora");
        tablaGameC.addColumn("Empresa Editora");
        listaP = tbGameC.mostrarVideojuego();
        for (int i = 0; i < listaP.size(); i++) {
            fila[0] = String.valueOf(listaP.get(i).getIdVideojuego());
            fila[1] = listaP.get(i).getNombreVideojuego();
            fila[2] = listaP.get(i).getGeneroVideojuego();
            fila[3] = formato.format(listaP.get(i).getFechaLanzamiento());
            fila[4] = listaP.get(i).getPlataforma();
            fila[5] = String.valueOf(listaP.get(i).getNumVentas());
            fila[6] = listaP.get(i).getEmpresaDev();;
            fila[7] = listaP.get(i).getEmpresaEditor();
            tablaGameC.addRow(fila);
        }
        
        productF.getVideoGamesJTB().setModel(tablaGameC);
    }

    private void actionSaveEdit() {
        productC.setEmpresaEditor(productF.getEditCB().getSelectedItem().toString());
        if (tbGameC.registrarEmpresaEdit(productC)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            //limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            //limpiar();
        }
    }

    private void listaEmpresaDev() {
        productF.getDevCB().removeAllItems();
        tbGameC = new tablaVideojuegos();
        ArrayList<Productos> listaDev = tbGameC.listaEmpesaDev();
        productF.getDevCB().addItem("");
        for (int i = 0; i < listaDev.size(); i++) {
            productF.getDevCB().addItem(listaDev.get(i).getEmpresaDev());
        }
    }
    
    private void listaEmpresaEdit(){
        productF.getEditCB().removeAllItems();
        tbGameC = new tablaVideojuegos();
        ArrayList<Productos> listEdit = tbGameC.listaEmpresaEdit();
        productF.getEditCB().addItem("");
        for (int i = 0; i < listEdit.size(); i++) {
            productF.getEditCB().addItem(listEdit.get(i).getEmpresaEditor());
        }
    }

    private void actionSaveDev() {
        productC.setEmpresaDev(productF.getDevCB().getSelectedItem().toString());
        if (tbGameC.registrarEmpresaDev(productC)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            //limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            //limpiar();
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
        productC.setIdEmpresaEditor(productF.getEditCB().getSelectedIndex());
        if (tbGameC.registrarProducto(productC)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            limpiar();
        }
        tablaVideojuegoC();
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
