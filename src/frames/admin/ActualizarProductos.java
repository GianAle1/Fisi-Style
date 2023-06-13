/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames.admin;

import bdmysql.SqlArticulo;
import clases.Producto;
import frames.MenuAdmin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author usuario
 */
public class ActualizarProductos extends javax.swing.JFrame{
    SqlArticulo sqlProd = new SqlArticulo();
    protected double total = 0.0;
    MenuAdmin admin;
    List<Producto> productos = new ArrayList<>(); ;
    
    public ActualizarProductos(){
        initComponents();
        setLocationRelativeTo(null);   
        setResizable(false);
        llenarTabla();   
    }
    
    public void setFrame(MenuAdmin menu){
        this.admin = menu;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaProductos = new javax.swing.JTable(){
            public boolean isCellEditable (int row, int col){
                return false;
            }
        };
        tablaProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Tipo", "Stock", "Precio Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setSelectionBackground(new java.awt.Color(255, 204, 51));
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(220);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(86, 105, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(253, 253, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Opciones:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setOpaque(false);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar_1.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar_2.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(37, 37, 37)
                .addComponent(btnActualizar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(btnVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -100, 680, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (admin == null)
            admin = new MenuAdmin();
        admin.setVisible(true);   
        this.setVisible(false);
        evt.getActionCommand();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selected = tablaProductos.getSelectedRow();
        if (selected == -1)
            JOptionPane.showMessageDialog(null, "Seleccione el producto a eliminar.","Error de eliminación", JOptionPane.WARNING_MESSAGE);
        else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
            if (resp == 0){
                sqlProd.eliminarProducto(productos.get(selected).getId());
                llenarTabla();
            }
        }
        evt.getActionCommand();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selected = tablaProductos.getSelectedRow();
        System.out.println("" + selected);
        if (selected == -1)
            JOptionPane.showMessageDialog(null, "Seleccione el producto a editar.","Error de edición", JOptionPane.WARNING_MESSAGE);
        else{
            EdicionProducto edit = new EdicionProducto();
            edit.generar(tablaProductos.getValueAt(selected, 0).toString(), Integer.parseInt(tablaProductos.getValueAt(selected, 2).toString()),
            Double.parseDouble(tablaProductos.getValueAt(selected, 3).toString()),selected);
            edit.setVisible(true);
            edit.setFrame(this);
            edit.toFront();
        }
        evt.getActionCommand();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        llenarTabla();
        evt.getActionCommand();
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    public void llenarTabla(){
        productos.clear();
        sqlProd.obtenerProducto(productos);
        DefaultTableModel modeloDefault = new DefaultTableModel(new String []{"Producto", "Tipo", "Stock", "Precio unitario"}, productos.size());
        tablaProductos.setModel(modeloDefault);
        TableModel modelDatos = tablaProductos.getModel();
        if (productos != null){
            for (int i = 0; i < productos.size(); i++){
                Producto art = productos.get(i);
                modelDatos.setValueAt(art.getDescripcion(), i, 0);
                modelDatos.setValueAt(art.getTipo(), i, 1);
                modelDatos.setValueAt(art.getStock(), i, 2);
                modelDatos.setValueAt(art.getPrecio(), i, 3);
            }
        }
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
