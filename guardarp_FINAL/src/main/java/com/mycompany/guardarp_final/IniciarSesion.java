
package com.mycompany.guardarp_final;

import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class IniciarSesion extends javax.swing.JFrame {

    
    boolean comprobado = false;
    manejaUsuario manejaUser = new manejaUsuario();
    Usuario u = new Usuario();
    
    public IniciarSesion() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        nombre_2.setVisible(false);
        clave_nueva.setVisible(false);
        bCambiarContraseña.setBorderPainted(false);
        fondo.setForeground(Color.white);
        ImageIcon fondo_= new ImageIcon("inicio_sesion.png");
        ImageIcon boton_salir= new ImageIcon("salir.jpg");
        
        fondo.setIcon(fondo_);
        salir.setIcon(boton_salir);
        actualizar.setVisible(false);
        bIniciar.setBackground(Color.blue);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bIniciar = new javax.swing.JButton();
        bCambiarContraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre_2 = new javax.swing.JTextField();
        clave_nueva = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bIniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bIniciar.setForeground(new java.awt.Color(255, 255, 255));
        bIniciar.setText("INICIAR");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(bIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 100, -1));

        bCambiarContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bCambiarContraseña.setForeground(new java.awt.Color(0, 0, 204));
        bCambiarContraseña.setText("CAMBIAR CONTRASEÑA");
        bCambiarContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(bCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 120, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Nombre: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Clave Nueva: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));
        getContentPane().add(nombre_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 120, -1));
        getContentPane().add(clave_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 120, -1));

        actualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLabel6.setText("¿Desea cambiar la contraseña?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 40, -1, 30));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 620, 480));

        setSize(new java.awt.Dimension(634, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        
        
        MessageDigest mD = null;
        try{
            mD = MessageDigest.getInstance("MD5");
                        
        } catch(NoSuchAlgorithmException ex)
        {
            Logger.getLogger(password.getName()).log(Level.SEVERE, null, ex);
        }
                   
        mD.update(password.getText().getBytes());
        byte[] digestP = mD.digest();
        StringBuilder sB = new StringBuilder();
                    
        for(byte b: digestP)
        {
            sB.append(String.format("%02x", b & 0xff));
        }
                    
        String pasword_diggest = sB.toString();
        
        
        comprobado = manejaUser.ComprobarUsuario(nombre.getText(), /*password.getText()*/pasword_diggest);
       
       if(comprobado)
       {
        
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
        
       }
        
    }//GEN-LAST:event_bIniciarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        
    }//GEN-LAST:event_passwordActionPerformed

    private void bCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarContraseñaActionPerformed
        
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        nombre_2.setVisible(true);
        clave_nueva.setVisible(true);
        actualizar.setVisible(true);
        
              
       
       
        
        
    }//GEN-LAST:event_bCambiarContraseñaActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        manejaUser.actualizarPassword(nombre_2.getText(), clave_nueva.getText());
    }//GEN-LAST:event_actualizarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton bCambiarContraseña;
    private javax.swing.JButton bIniciar;
    private javax.swing.JTextField clave_nueva;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre_2;
    private javax.swing.JTextField password;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
