
package com.mycompany.guardarp_final;

import java.awt.Color;
import javax.swing.ImageIcon;


public class Crear_Clave extends javax.swing.JFrame {

    manejaUsuario manejauser = new manejaUsuario();
    
    public Crear_Clave() {
        initComponents();
         ImageIcon fondo_= new ImageIcon("listar_pantalla.png");
         ImageIcon atras= new ImageIcon("atras.png");
         bCrearClave.setBackground(Color.green);
         fondo.setIcon(fondo_);
         bAtras.setIcon(atras);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCrearClave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        bAtras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCrearClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCrearClave.setText("CREAR");
        bCrearClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearClaveActionPerformed(evt);
            }
        });
        getContentPane().add(bCrearClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Descripción:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 90, 30));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 90, 30));

        bAtras.setBorder(null);
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(bAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 30, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        setSize(new java.awt.Dimension(636, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearClaveActionPerformed
       
          Cuentas cuenta = new Cuentas(descripcion.getText(), password.getText());
          manejauser.crearClave(cuenta);
        
        
    }//GEN-LAST:event_bCrearClaveActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bAtrasActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_Clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Clave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bCrearClave;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
