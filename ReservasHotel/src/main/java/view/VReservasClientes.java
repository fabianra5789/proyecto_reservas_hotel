/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import biz.Reserva;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import util.Util;

/**
 *
 * @author fabianra5789
 */
public class VReservasClientes extends javax.swing.JFrame {
final String NOM_ARCHIVO = "reserva.dat";
    //Gestionar los objetos dentro del formulario
    ArrayList<Object> objetos = new ArrayList<>();
    //Realizar la serialización y des-serialización de objetos
    //También llevar el listado
    Util util = new Util();

    //Gestionar el objeto actual
    //SE DEBE CAMBIAR EL TIPO DE OBJETO, en este caso es PUNTO.
    Reserva objeto;
    /**
     * Creates new form NewJFrame
     */
    public VReservasClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false) ;
        getObjetos(false, true, false);
                        setResizable(false);
                        txCerrar.setIcon(new javax.swing.ImageIcon(("/Users/fabianra5789/Documents/torrents/salida.png")));
        this.setLocationRelativeTo(null);
        logo.setIcon(new javax.swing.ImageIcon(("/Users/fabianra5789/Documents/torrents/logo.jpg")));
    }
private void getObjetos(boolean estNuevo, boolean estGuardar, boolean estBorrar) {

        //// SE DEBE MODIFICAR
       
        

        //SE MODIFCA CON LA CLASE QUE SE ESTÉ TRABAJANDO, cambiar Punto() por dicha clase
        objeto = new Reserva();
        //Maquillaje NO MODIFICAR
      

        //NO SE MODIFICA
        if (util.desSerializar(NOM_ARCHIVO) != null) {
            objetos = (ArrayList) util.desSerializar(NOM_ARCHIVO);
            // Modifica el título Puntos por el que corresponda
            String[] t = {"Listado de Reservas"};
            this.listado.setModel(new DefaultTableModel(util.setJTable(objetos), t));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        txCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(listado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 967, 330));

        jPanel1.setBackground(new java.awt.Color(191, 217, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas Hotel Manantial"));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel1.setText("Reservas");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txCerrar.setText("Salir");
        txCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 882, Short.MAX_VALUE))
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txCerrar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                .addComponent(txCerrar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_txCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(VReservasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VReservasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VReservasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VReservasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VReservasClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado;
    private javax.swing.JLabel logo;
    private javax.swing.JButton txCerrar;
    // End of variables declaration//GEN-END:variables
}