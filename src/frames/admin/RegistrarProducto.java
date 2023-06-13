/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames.admin;

import bdmysql.SqlArticulo;
import clases.Producto;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author CRISTHIAN
 */
public class RegistrarProducto extends javax.swing.JFrame {

    File selectedFile;
    File destinationFile;
    private static final String FUENTE1 = "Segoe UI";

    public RegistrarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        javax.swing.JLabel lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        javax.swing.JLabel lblTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblTipo1 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblTalla = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        javax.swing.JLabel lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        javax.swing.JLabel lblImage = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        javax.swing.JButton file = new javax.swing.JButton();
        txtFile = new javax.swing.JTextField();
        javax.swing.JLabel lblStock = new javax.swing.JLabel();
        javax.swing.JButton btnAdd = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 30));

        txtDescripcion.setFont(new java.awt.Font(FUENTE1, 0, 13));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 85, 210, -1));

        lblMarca.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca.setText("Marca:");
        jPanel1.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 30));

        txtMarca.setFont(new java.awt.Font(FUENTE1, 0, 13));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 165, 210, -1));

        lblTipo.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo:");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 30));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisas", "Pantalones", "Poleras", "Polos", "Zapatos", "Zapatillas" }));
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 125, 210, -1));

        lblTipo1.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblTipo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo1.setText("Género:");
        jPanel1.add(lblTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 30));

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballero", "Dama" }));
        jPanel1.add(cbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 205, 210, -1));

        lblTalla.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblTalla.setForeground(new java.awt.Color(0, 0, 0));
        lblTalla.setText("Talla:");
        jPanel1.add(lblTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 30));

        txtTalla.setFont(new java.awt.Font(FUENTE1, 0, 13));
        jPanel1.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 242, 70, -1));

        lblPrecio.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Precio:     S/");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 70, 30));

        txtPrecio.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 242, 70, -1));

        lblImage.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblImage.setForeground(new java.awt.Color(0, 0, 0));
        lblImage.setText("Imagen:");
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, 30));

        txtStock.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 283, 70, -1));

        file.setText("...");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });
        jPanel1.add(file, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 323, -1, -1));
        jPanel1.add(txtFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 323, 180, -1));

        lblStock.setFont(new java.awt.Font(FUENTE1, 0, 13));
        lblStock.setForeground(new java.awt.Color(0, 0, 0));
        lblStock.setText("Stock:");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, 30));

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.JPG", "jpg");
        fc.setFileFilter(filter);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
            // Obtener la ruta del archivo
            String filePath = selectedFile.getAbsolutePath();
            txtFile.setText(filePath);
            String fileName = selectedFile.getName();
            // Copiar la imagen a una ubicación local
            String destinationPath = "src/images/productos"; // Especifica la ruta de destino donde quieres guardar la imagen
            destinationFile = new File(destinationPath, fileName);
        }
        evt.getActionCommand();
    }//GEN-LAST:event_fileActionPerformed

    protected String guardarImagen() {
        try {
            java.nio.file.Files.copy(selectedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return destinationFile.getPath();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar imagen.");
        }
        return null;
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Producto art = new Producto();
        SqlArticulo prod = new SqlArticulo ();
        art.setDescripcion(txtDescripcion.getText());
        art.setMarca(txtMarca.getText());
        art.setTipo((String) cbTipo.getSelectedItem());
        art.setPrecio((float) Double.parseDouble(txtPrecio.getText()));
        art.setStock(Integer.parseInt(txtStock.getText()));
        art.setGenero((String) cbGenero.getSelectedItem());
        art.setTalla(txtTalla.getText());
        if (guardarImagen() != null){
            String ruta = guardarImagen().replace("\\", "/").substring(3);
            art.setImage(ruta);
            prod.registrar(art);
        }
        evt.getActionCommand();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char letra = evt.getKeyChar();

        if (Character.isLetter(letra)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegistrarProducto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
