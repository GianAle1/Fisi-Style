/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames.admin;

import javax.swing.JOptionPane;

/**
 *
 * @author CRISTHIAN
 */
public class EdicionProducto extends javax.swing.JFrame {
    int i = 0, ind;
    ActualizarProductos frame;
    protected int cantidad;
    public EdicionProducto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void generar(String nombre, int cant, double precio, int ind){
        txtProducto.setText(nombre);
        txtStock.setText(""+cant);
        txtPrecio.setText(""+precio);
        i = cant;
        this.ind = ind;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCantidad1 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblCantidad2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(415, 201));
        setName("Editar"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCantidad1.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad1.setText("Stock");
        jPanel1.add(lblCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 95, 70, -1));

        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStock.setText("0");
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 70, 30));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Precio");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 50, -1));

        lblProducto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblProducto.setText("Producto:");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 70, -1));

        txtProducto.setEditable(false);
        txtProducto.setEnabled(false);
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 230, 30));

        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setText("0");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, -1));

        lblCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCantidad2.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad2.setText("S/");
        jPanel1.add(lblCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 95, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (Integer.parseInt(txtStock.getText())> 0){
            frame.productos.get(ind).setStock(Integer.parseInt(txtStock.getText()));
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
            if (resp == 0)
                frame.sqlProd.eliminarProducto(frame.productos.get(ind).getId()); //Exception

        }
        if (Double.parseDouble(txtPrecio.getText())> 0){
            frame.productos.get(ind).setPrecio((float) Double.parseDouble(txtPrecio.getText()));
        }
        frame.sqlProd.actualizarProducto(frame.productos.get(ind)); //Exception
        frame.llenarTabla();
        this.setVisible(false);
        frame.setEnabled(true);
        frame.toFront();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        frame.setEnabled(true);
        frame.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void setFrame (ActualizarProductos origen){
        this.frame = origen;
        frame.setEnabled(false);
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
            java.util.logging.Logger.getLogger(EdicionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicionProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidad1;
    private javax.swing.JLabel lblCantidad2;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
