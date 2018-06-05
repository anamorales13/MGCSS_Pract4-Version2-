
package com.mycompany.guardarp_final;

import java.awt.Color;
import javax.swing.ImageIcon;


public class Crear_Lista extends javax.swing.JFrame {

    manejaUsuario manejaUser = new manejaUsuario();
    
    public Crear_Lista() {
        initComponents();
         ImageIcon fondo_= new ImageIcon("listar_pantalla.png");
         ImageIcon atras= new ImageIcon("atras.png");
         
         fondo.setIcon(fondo_);
         bAtras.setIcon(atras);
         mostrarLista.setBackground(Color.CYAN);
          
      
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textoarea = new javax.swing.JTextArea();
        mostrarLista = new javax.swing.JButton();
        bAtras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoarea.setColumns(20);
        textoarea.setRows(5);
        jScrollPane1.setViewportView(textoarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 410, 240));

        mostrarLista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mostrarLista.setText("MOSTRAR LISTA");
        mostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarListaActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(bAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 30, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 560));

        setSize(new java.awt.Dimension(636, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarListaActionPerformed
       textoarea.setText(manejaUser.ListarClaves());
    }//GEN-LAST:event_mostrarListaActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
       
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtras;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarLista;
    private javax.swing.JTextArea textoarea;
    // End of variables declaration//GEN-END:variables
}
