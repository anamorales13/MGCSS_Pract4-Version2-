
package com.mycompany.guardarp_final;

import javax.swing.ImageIcon;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
        ImageIcon fondo_= new ImageIcon("Menu.png");
        ImageIcon Listar= new ImageIcon("listar.jpg");
        ImageIcon crear= new ImageIcon("password.jpg");
        ImageIcon atras= new ImageIcon("salir.jpg");
        
        fondo.setIcon(fondo_);
        bCrearClave.setIcon(crear);
        bListar.setIcon(Listar);
        bSalir.setIcon(atras);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCrearClave = new javax.swing.JButton();
        bListar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCrearClave.setBorder(null);
        bCrearClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearClaveActionPerformed(evt);
            }
        });
        getContentPane().add(bCrearClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 100, 110));

        bListar.setBorder(null);
        bListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarActionPerformed(evt);
            }
        });
        getContentPane().add(bListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, 90));

        bSalir.setBorder(null);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 40, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("CREAR CLAVE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("LISTAR CLAVES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        setSize(new java.awt.Dimension(634, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarActionPerformed
        Crear_Lista crearlista = new Crear_Lista();
        crearlista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bListarActionPerformed

    private void bCrearClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearClaveActionPerformed
        
        Crear_Clave crearclave = new Crear_Clave();
        crearclave.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bCrearClaveActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearClave;
    private javax.swing.JButton bListar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
