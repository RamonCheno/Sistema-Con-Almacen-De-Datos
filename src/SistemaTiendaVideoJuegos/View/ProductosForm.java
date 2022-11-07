/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaTiendaVideoJuegos.View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class ProductosForm extends javax.swing.JPanel {

    /**
     * Creates new form Productos
     */
    public ProductosForm() {
        initComponents();
        idTxt.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioPanel = new javax.swing.JPanel();
        menuProductos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        dataMartBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        saveEditBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genderTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salesTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        platformTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        editCB = new javax.swing.JComboBox<>();
        devCB = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        saveDevBtn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(680, 600));
        setPreferredSize(new java.awt.Dimension(680, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanel.setMinimumSize(new java.awt.Dimension(680, 600));
        inicioPanel.setPreferredSize(new java.awt.Dimension(680, 600));

        menuProductos.setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(51, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, 480));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Eliminar");
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        searchBtn.setBackground(new java.awt.Color(0, 0, 255));
        searchBtn.setText("Buscar");
        jPanel2.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        updateBtn.setBackground(new java.awt.Color(0, 0, 255));
        updateBtn.setText("Modificar");
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        dataMartBtn.setBackground(new java.awt.Color(0, 0, 255));
        dataMartBtn.setText("Data Mart");
        jPanel2.add(dataMartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        menuProductos.addTab("Tabla productos", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveEditBtn.setBackground(new java.awt.Color(0, 0, 255));
        saveEditBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveEditBtn.setText("Guardar empresa Editora");
        jPanel1.add(saveEditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del videojuego");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Añadir Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        nameTxt.setBackground(new java.awt.Color(255, 255, 255));
        nameTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 110, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Genero del videojuego");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        genderTxt.setBackground(new java.awt.Color(255, 255, 255));
        genderTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de lanzamiento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        dateTxt.setBackground(new java.awt.Color(255, 255, 255));
        dateTxt.setForeground(new java.awt.Color(102, 102, 102));
        dateTxt.setText("Año/Mes/Dia");
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Numero de ventas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        salesTxt.setBackground(new java.awt.Color(255, 255, 255));
        salesTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(salesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Empresa desarrolladora");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Empresa editora");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Plataforma");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        platformTxt.setBackground(new java.awt.Color(255, 255, 255));
        platformTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(platformTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, -1));

        idTxt.setBackground(new java.awt.Color(255, 255, 255));
        idTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 100, -1));

        editCB.setBackground(new java.awt.Color(255, 255, 255));
        editCB.setEditable(true);
        editCB.setForeground(new java.awt.Color(0, 0, 0));
        editCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(editCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, -1));

        devCB.setBackground(new java.awt.Color(255, 255, 255));
        devCB.setEditable(true);
        devCB.setForeground(new java.awt.Color(0, 0, 0));
        devCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(devCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, -1));

        saveBtn.setBackground(new java.awt.Color(0, 0, 255));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText(" Guardar Videojuego");
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        saveDevBtn.setBackground(new java.awt.Color(0, 0, 255));
        saveDevBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveDevBtn.setText("Guardar empresa Desarrolladora");
        jPanel1.add(saveDevBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        menuProductos.addTab("Añadir Productos", jPanel1);

        javax.swing.GroupLayout inicioPanelLayout = new javax.swing.GroupLayout(inicioPanel);
        inicioPanel.setLayout(inicioPanelLayout);
        inicioPanelLayout.setHorizontalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuProductos, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        inicioPanelLayout.setVerticalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        add(inicioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 600));
    }// </editor-fold>//GEN-END:initComponents

    public JButton getSaveDevBtn() {
        return saveDevBtn;
    }

    public JButton getSaveEditBtn() {
        return saveEditBtn;
    }

    public JButton getDataMartBtn() {
        return dataMartBtn;
    }

    public JTextField getDateTxt() {
        return dateTxt;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    public JComboBox<String> getDevCB() {
        return devCB;
    }

    public JComboBox<String> getEditCB() {
        return editCB;
    }

    public JTextField getGenderTxt() {
        return genderTxt;
    }

    public JTextField getIdTxt() {
        return idTxt;
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public JTextField getPlatformTxt() {
        return platformTxt;
    }

    public JTextField getSalesTxt() {
        return salesTxt;
    }

    public JButton getSaveBtn() {
        return saveBtn;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public JButton getUpdateBtn() {
        return updateBtn;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataMartBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> devCB;
    private javax.swing.JComboBox<String> editCB;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane menuProductos;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField platformTxt;
    private javax.swing.JTextField salesTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveDevBtn;
    private javax.swing.JButton saveEditBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
