/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import grafosstructure.Lista;
import grafosstructure.MatrizAdy;
import grafosstructure.Nodo;
import grafosstructure.Funciones;
import grafosstructure.Vertice;
import javax.swing.JSpinner;

/**
 *
 * @author Liz
 */
public class VPedido extends javax.swing.JFrame {

    /**
     * Creates new form VPedido
     */
    public VPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public MatrizAdy gatMatrizAdy() {
        Funciones fun = new Funciones();
        MatrizAdy matriz = fun.readTxt();
        return matriz;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void modificarInventario(int cantidad, Nodo producto, int opcion) {
        if (opcion == 1) {
            producto.setExistencias(producto.getExistencias() + cantidad);
        } else {
            producto.setExistencias(producto.getExistencias() - cantidad);
        }
    }

//    public Nodo Comparar(Lista productos, String producto) {
//        Nodo aux = productos.getpFirst();
//        for (aux; aux != null; aux.getNext()){
//            if (producto.equals(aux.getNombre())) {
//                return aux;
//            }
//        }
//        return null;
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RegresarMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ialmacen = new javax.swing.JTextField();
        iproducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icantidad = new javax.swing.JSpinner();
        Pedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 32, 58));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("Pedidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        RegresarMenu.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        RegresarMenu.setText("Regresar al menú");
        jPanel1.add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setText("Seleccione almacén:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        ialmacen.setBackground(new java.awt.Color(204, 204, 204));
        ialmacen.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        ialmacen.setForeground(new java.awt.Color(0, 0, 0));
        ialmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ialmacenActionPerformed(evt);
            }
        });
        jPanel1.add(ialmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, -1));

        iproducto.setBackground(new java.awt.Color(204, 204, 204));
        iproducto.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        iproducto.setForeground(new java.awt.Color(0, 0, 0));
        iproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iproductoActionPerformed(evt);
            }
        });
        jPanel1.add(iproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setText("Indique producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(icantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        Pedido.setText("Hacer pedido");
        Pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedidoMouseClicked(evt);
            }
        });
        Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidoActionPerformed(evt);
            }
        });
        jPanel1.add(Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ialmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ialmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ialmacenActionPerformed

    private void iproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iproductoActionPerformed

    private void PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedidoActionPerformed

    private void PedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidoMouseClicked
        // TODO add your handling code here:
        MatrizAdy matriz = this.gatMatrizAdy();

        String Producto = this.iproducto.getText().toLowerCase();
        int almacen = matriz.numVertice(this.ialmacen.getText().toUpperCase());
        JSpinner cantidad = icantidad;
        
    }//GEN-LAST:event_PedidoMouseClicked

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
            java.util.logging.Logger.getLogger(VPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pedido;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JTextField ialmacen;
    private javax.swing.JSpinner icantidad;
    private javax.swing.JTextField iproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
