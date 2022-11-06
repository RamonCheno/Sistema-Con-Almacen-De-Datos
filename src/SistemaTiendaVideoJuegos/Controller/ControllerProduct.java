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
import java.util.Date;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class ControllerProduct implements ActionListener{
    private Productos productC;
    private tablaVideojuegos tb_GamesC;
    private ProductosForm productF;

    public ControllerProduct(Productos productC, tablaVideojuegos tb_GamesC,
            ProductosForm productF) {
        this.productC = productC;
        this.tb_GamesC = tb_GamesC;
        this.productF = productF;
        this.productF.saveGuardar.addActionListener(this);
        this.productF.updateBtn.addActionListener(this);
        this.productF.deleteBtn.addActionListener(this);
        this.productF.searchBtn.addActionListener(this);
        this.productF.dataMartBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == productF.saveGuardar){
            productC.setNombre(productF.nameTxt.getText());
        }
    }
    
    
    
    
    
}
