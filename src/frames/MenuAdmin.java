/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import frames.admin.Inventario;
import frames.admin.Promociones;
import javax.swing.JPanel;

/**
 *
 * @author CRISTHIAN
 */
public class MenuAdmin extends javax.swing.JFrame {
    private static final String FUENTE1 = "Trebuchet MS";
    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
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

        contenedor = new javax.swing.JPanel();
        javax.swing.JPanel panelHerramientas = new javax.swing.JPanel();
        javax.swing.JPanel pnlInventario = new javax.swing.JPanel();
        javax.swing.JLabel lblActualizar = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgInventario = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JPanel pnlPromocion = new javax.swing.JPanel();
        javax.swing.JLabel lblCrearP = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgPromocion = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JPanel pnlReportes = new javax.swing.JPanel();
        javax.swing.JLabel lblReporte = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgReporte = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JPanel pnlCerrarSesion = new javax.swing.JPanel();
        javax.swing.JLabel lblCerrarS = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgCerrar = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel lblAdmin = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgIcono = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(768, 721));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(219, 220, 225));
        contenedor.setMinimumSize(new java.awt.Dimension(768, 721));
        contenedor.setPreferredSize(new java.awt.Dimension(768, 721));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 500, 721));

        panelHerramientas.setBackground(new java.awt.Color(86, 105, 204));
        panelHerramientas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInventario.setBackground(new java.awt.Color(86, 105, 204));
        pnlInventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlInventarioMouseClicked(evt);
            }
        });
        pnlInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblActualizar.setFont(new java.awt.Font(FUENTE1, 1, 18));
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setText("<html>Actualizar <br>inventario<html>");
        pnlInventario.add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 50));

        imgInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        pnlInventario.add(imgInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, 40, 40));

        panelHerramientas.add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 80));

        pnlPromocion.setBackground(new java.awt.Color(86, 105, 204));
        pnlPromocion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlPromocion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPromocionMouseClicked(evt);
            }
        });
        pnlPromocion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearP.setFont(new java.awt.Font(FUENTE1, 1, 18));
        lblCrearP.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearP.setText("Crear promoción");
        pnlPromocion.add(lblCrearP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 25, 150, 30));

        imgPromocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/promocion.png"))); // NOI18N
        pnlPromocion.add(imgPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        panelHerramientas.add(pnlPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 80));

        pnlReportes.setBackground(new java.awt.Color(86, 105, 204));
        pnlReportes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReporte.setFont(new java.awt.Font(FUENTE1, 1, 18));
        lblReporte.setForeground(new java.awt.Color(255, 255, 255));
        lblReporte.setText("Reportes");
        pnlReportes.add(lblReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, 25));

        imgReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reporte.png"))); // NOI18N
        pnlReportes.add(imgReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        panelHerramientas.add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 270, 80));

        pnlCerrarSesion.setBackground(new java.awt.Color(86, 105, 204));
        pnlCerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlCerrarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrarS.setFont(new java.awt.Font(FUENTE1, 1, 18));
        lblCerrarS.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarS.setText("Cerrar Sesión");
        pnlCerrarSesion.add(lblCerrarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, 25));

        imgCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrarSesion.png"))); // NOI18N
        pnlCerrarSesion.add(imgCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 40));

        panelHerramientas.add(pnlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 270, 80));

        lblAdmin.setFont(new java.awt.Font(FUENTE1, 1, 18));
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("Administrador");
        panelHerramientas.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, 40));

        imgIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconFisiStyle.png"))); // NOI18N
        panelHerramientas.add(imgIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 170));

        lblWelcome.setFont(new java.awt.Font(FUENTE1, 1, 18));
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("¡Bienvenido!");
        panelHerramientas.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 110, 40));

        getContentPane().add(panelHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void showPanel(JPanel p){
        p.setSize(768, 721);
        p.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contenedor.revalidate();
        contenedor.repaint();
    }
    
    private void pnlInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInventarioMouseClicked
        Inventario inv = new Inventario();
        showPanel(inv);
        evt.consume();
    }//GEN-LAST:event_pnlInventarioMouseClicked

    private void pnlPromocionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPromocionMouseClicked
        Promociones prom = new Promociones();
        showPanel(prom);
        evt.consume();
    }//GEN-LAST:event_pnlPromocionMouseClicked

    
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuAdmin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    // End of variables declaration//GEN-END:variables
}
