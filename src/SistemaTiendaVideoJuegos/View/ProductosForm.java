/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaTiendaVideoJuegos.View;

import java.util.Date;

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
        jPanel1 = new javax.swing.JPanel();
        saveGuardar = new javax.swing.JButton();
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
        devCompanyTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        distributionCompanyTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTxtA = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        platformTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        dataMartBtn = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(680, 600));
        setPreferredSize(new java.awt.Dimension(680, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanel.setMinimumSize(new java.awt.Dimension(680, 600));
        inicioPanel.setPreferredSize(new java.awt.Dimension(680, 600));

        menuProductos.setBackground(new java.awt.Color(0, 0, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveGuardar.setBackground(new java.awt.Color(0, 0, 255));
        saveGuardar.setForeground(new java.awt.Color(255, 255, 255));
        saveGuardar.setText("Guardar ");
        saveGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(saveGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 514, -1, -1));

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
        dateTxt.setText("dia/mes/año");
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 110, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Numero de ventas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        salesTxt.setBackground(new java.awt.Color(255, 255, 255));
        salesTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(salesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Empresa desarrolladora");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        devCompanyTxt.setBackground(new java.awt.Color(255, 255, 255));
        devCompanyTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(devCompanyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 110, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripcion del videojuego");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        distributionCompanyTxt.setBackground(new java.awt.Color(255, 255, 255));
        distributionCompanyTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(distributionCompanyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 110, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Empresa editora");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        descriptionTxtA.setBackground(new java.awt.Color(255, 255, 255));
        descriptionTxtA.setColumns(20);
        descriptionTxtA.setForeground(new java.awt.Color(0, 0, 0));
        descriptionTxtA.setRows(5);
        jScrollPane2.setViewportView(descriptionTxtA);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Plataforma");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        platformTxt.setBackground(new java.awt.Color(255, 255, 255));
        platformTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(platformTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, -1));

        menuProductos.addTab("Añadir Productos", jPanel1);

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 490));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        dataMartBtn.setBackground(new java.awt.Color(0, 0, 255));
        dataMartBtn.setText("Data Mart");
        dataMartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataMartBtnActionPerformed(evt);
            }
        });
        jPanel2.add(dataMartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        updateBtn1.setBackground(new java.awt.Color(0, 0, 255));
        updateBtn1.setText("Modificar");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        menuProductos.addTab("Tabla productos", jPanel2);

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
    
    String nameVideoGame, genderVideoGame, devCompany, distributionCompany, 
            description, platform;
    Date releaseDate;
    int numberSales;
    
    private void saveGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGuardarActionPerformed
        // TODO add your handling code here:
        nameVideoGame = nameTxt.getText();
        genderVideoGame = genderTxt.getText();
        devCompany = devCompanyTxt.getText();
        platform = platformTxt.getText();
        distributionCompany = distributionCompanyTxt.getText();
        description = descriptionTxtA.getText();
        numberSales = Integer.parseInt(salesTxt.getText());
        
    }//GEN-LAST:event_saveGuardarActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void dataMartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataMartBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataMartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataMartBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea descriptionTxtA;
    private javax.swing.JTextField devCompanyTxt;
    private javax.swing.JTextField distributionCompanyTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane menuProductos;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField platformTxt;
    private javax.swing.JTextField salesTxt;
    private javax.swing.JButton saveGuardar;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
}
