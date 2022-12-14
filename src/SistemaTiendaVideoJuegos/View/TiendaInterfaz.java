/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SistemaTiendaVideoJuegos.View;

import SistemaTiendaVideoJuegos.Controller.ControllerProduct;
import SistemaTiendaVideoJuegos.Model.Productos;
import SistemaTiendaVideoJuegos.Model.Sql.tablaVideojuegos;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class TiendaInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form TiendaInterfaz
     */
    public TiendaInterfaz() {
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
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        clientesBtn = new javax.swing.JButton();
        productosBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda De Videojuego Virtual");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        bgPanel.setBackground(new java.awt.Color(153, 255, 255));
        bgPanel.setForeground(new java.awt.Color(0, 0, 0));
        bgPanel.setMinimumSize(new java.awt.Dimension(900, 600));
        bgPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(780, 600));
        content.setPreferredSize(new java.awt.Dimension(780, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EPIC GAMES");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BIENVENIDOS");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        bgPanel.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        menuPanel.setBackground(new java.awt.Color(0, 0, 204));
        menuPanel.setForeground(new java.awt.Color(0, 0, 0));
        menuPanel.setMinimumSize(new java.awt.Dimension(120, 600));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientesBtn.setBackground(new java.awt.Color(0, 0, 204));
        clientesBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clientesBtn.setForeground(new java.awt.Color(255, 255, 255));
        clientesBtn.setText("Clientes");
        clientesBtn.setBorder(null);
        clientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesBtnActionPerformed(evt);
            }
        });
        menuPanel.add(clientesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

        productosBtn.setBackground(new java.awt.Color(0, 0, 204));
        productosBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productosBtn.setForeground(new java.awt.Color(255, 255, 255));
        productosBtn.setText("Productos");
        productosBtn.setBorder(null);
        productosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosBtnActionPerformed(evt);
            }
        });
        menuPanel.add(productosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 120, -1));

        bgPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosBtnActionPerformed
        // TODO add your handling code here:
        ProductosForm productoform = new ProductosForm();
        mostrarPanel(productoform);
        Productos productC = new Productos();
        tablaVideojuegos tb_GamesC = new tablaVideojuegos();
        ControllerProduct ctrl = new ControllerProduct(productC, tb_GamesC, productoform);
    }//GEN-LAST:event_productosBtnActionPerformed

    private void clientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_clientesBtnActionPerformed

    void mostrarPanel(JPanel p) {
        p.setSize(780, 600);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TiendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiendaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiendaInterfaz().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton clientesBtn;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton productosBtn;
    // End of variables declaration//GEN-END:variables
}
