/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaTiendaVideoJuegos.View;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class ProductosForm extends javax.swing.JPanel {

    /**
     * Creates new form ProductosForm
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

        bgPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        productLB = new javax.swing.JLabel();
        clientLB = new javax.swing.JLabel();
        acercaDeLB = new javax.swing.JLabel();
        inicioPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        devCB = new javax.swing.JComboBox<>();
        distribuidorCB1 = new javax.swing.JComboBox<>();
        nameTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        ventasTxt = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTxta = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();
        guardarBtn1 = new javax.swing.JButton();

        bgPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(0, 0, 204));
        menuPanel.setForeground(new java.awt.Color(0, 0, 0));
        menuPanel.setMinimumSize(new java.awt.Dimension(120, 600));

        productLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        productLB.setForeground(new java.awt.Color(255, 255, 255));
        productLB.setText("Productos");

        clientLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clientLB.setForeground(new java.awt.Color(255, 255, 255));
        clientLB.setText("Clientes");

        acercaDeLB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        acercaDeLB.setForeground(new java.awt.Color(255, 255, 255));
        acercaDeLB.setText("Acerca De...");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acercaDeLB)
                    .addComponent(clientLB)
                    .addComponent(productLB))
                .addGap(26, 26, 26))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(productLB)
                .addGap(78, 78, 78)
                .addComponent(clientLB)
                .addGap(73, 73, 73)
                .addComponent(acercaDeLB)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        bgPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        inicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");
        inicioPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 99, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agregar Productos");
        inicioPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Desarrollador");
        inicioPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Genero del videojuego");
        inicioPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Distribucion");
        inicioPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 143, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ventas");
        inicioPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripcion");
        inicioPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        devCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        inicioPanel.add(devCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 121, -1));

        distribuidorCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        inicioPanel.add(distribuidorCB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 147, 121, -1));
        inicioPanel.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 103, 142, -1));
        inicioPanel.add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 140, -1));
        inicioPanel.add(ventasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 82, -1));
        inicioPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 159, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha De lanzamiento");
        inicioPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 187, -1, -1));

        descriptionTxta.setColumns(20);
        descriptionTxta.setRows(5);
        jScrollPane1.setViewportView(descriptionTxta);

        inicioPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        backBtn.setText("Atras");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        inicioPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, 22));

        guardarBtn1.setText("Guardar");
        guardarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtn1ActionPerformed(evt);
            }
        });
        inicioPanel.add(guardarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, -1));

        bgPanel.add(inicioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 680, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void guardarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acercaDeLB;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel clientLB;
    private javax.swing.JTextArea descriptionTxta;
    private javax.swing.JComboBox<String> devCB;
    private javax.swing.JComboBox<String> distribuidorCB1;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JButton guardarBtn1;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel productLB;
    private javax.swing.JTextField ventasTxt;
    // End of variables declaration//GEN-END:variables
}
