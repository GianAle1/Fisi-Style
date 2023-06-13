
package frames;
    
import clases.Usuario;
import bdmysql.Hash;
import bdmysql.SqlUsers;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    int coordX;
    int coordY;
    private static final String FUENTE1 = "Segoe UI";
    private static final String CLAVE = "123456";
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel contenedor = new javax.swing.JPanel();
        org.edisoncor.gui.panel.PanelImage panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        exit = new javax.swing.JPanel();
        javax.swing.JLabel lblExit = new javax.swing.JLabel();
        images.PanelRound1 loginPanel = new images.PanelRound1();
        javax.swing.JLabel lblContrasena = new javax.swing.JLabel();
        txtP = new javax.swing.JPasswordField();
        lu = new javax.swing.JPanel();
        javax.swing.JLabel lblCorreo = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        lc = new javax.swing.JPanel();
        imgUser = new org.edisoncor.gui.panel.PanelImage();
        imgPass = new org.edisoncor.gui.panel.PanelImage();
        images.PanelRound1 btnIngresar = new images.PanelRound1();
        javax.swing.JLabel lblIngresar = new javax.swing.JLabel();
        javax.swing.JLabel lblBienvenido = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        images.PanelRound1 btnRegistrar = new images.PanelRound1();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(86, 105, 204));
        contenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                contenedorMouseDragged(evt);
            }
        });
        contenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contenedorMousePressed(evt);
            }
        });
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconFisiStyle.png"))); // NOI18N
        contenedor.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 170));

        exit.setBackground(new java.awt.Color(86, 105, 204));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExit.setFont(new java.awt.Font(FUENTE1, 1, 24));
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("×");
        exit.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, -1));

        contenedor.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setRoundBottomLeft(50);
        loginPanel.setRoundBottomRight(50);
        loginPanel.setRoundTopLeft(50);
        loginPanel.setRoundTopRight(50);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContrasena.setBackground(new java.awt.Color(25, 55, 109));
        lblContrasena.setFont(new java.awt.Font(FUENTE1, 1, 14));
        lblContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasena.setText("Contraseña");
        loginPanel.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 90, -1));

        txtP.setBackground(new java.awt.Color(255, 255, 255));
        txtP.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtP.setForeground(new java.awt.Color(153, 153, 153));
        txtP.setText(CLAVE);
        txtP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPFocusLost(evt);
            }
        });
        loginPanel.add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 243, 200, 25));

        lu.setBackground(new java.awt.Color(86, 105, 204));
        lu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginPanel.add(lu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 240, 2));

        lblCorreo.setBackground(new java.awt.Color(25, 55, 109));
        lblCorreo.setFont(new java.awt.Font(FUENTE1, 1, 14));
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo");
        loginPanel.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 135, -1, -1));

        txtC.setBackground(new java.awt.Color(255, 255, 255));
        txtC.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCFocusLost(evt);
            }
        });
        loginPanel.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 162, 200, 25));

        lc.setBackground(new java.awt.Color(204, 204, 204));
        lc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginPanel.add(lc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 240, 2));

        imgUser.setBackground(new java.awt.Color(255, 255, 255));
        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userON.jpg"))); // NOI18N
        loginPanel.add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 157, 30, 30));

        imgPass.setBackground(new java.awt.Color(255, 255, 255));
        imgPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.jpg"))); // NOI18N
        loginPanel.add(imgPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 237, 30, 30));

        btnIngresar.setBackground(new java.awt.Color(86, 105, 204));
        btnIngresar.setRoundBottomLeft(35);
        btnIngresar.setRoundBottomRight(35);
        btnIngresar.setRoundTopLeft(35);
        btnIngresar.setRoundTopRight(35);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresar.setFont(new java.awt.Font(FUENTE1, 1, 16));
        lblIngresar.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("INGRESAR");
        btnIngresar.add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, 90, -1));

        loginPanel.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 240, 35));

        lblBienvenido.setFont(new java.awt.Font(FUENTE1, 1, 24));
        lblBienvenido.setForeground(new java.awt.Color(86, 105, 204));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("BIENVENIDO");
        loginPanel.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, 30));

        contenedor.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 370, 420));

        jLabel4.setFont(new java.awt.Font(FUENTE1, 1, 18));
        jLabel4.setForeground(new java.awt.Color(234, 234, 234));
        jLabel4.setText("Regístrate para ingresar a la plataforma.");
        contenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 350, 50));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setRoundBottomLeft(35);
        btnRegistrar.setRoundBottomRight(35);
        btnRegistrar.setRoundTopLeft(35);
        btnRegistrar.setRoundTopRight(35);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font(FUENTE1, 1, 16));
        jLabel5.setForeground(new java.awt.Color(86, 105, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRARSE");
        btnRegistrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        contenedor.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 200, 45));

        jLabel6.setFont(new java.awt.Font(FUENTE1, 1, 30));
        jLabel6.setForeground(new java.awt.Color(234, 234, 234));
        jLabel6.setText("¿Aún no tienes una cuenta?");
        contenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 400, 50));

        jLabel1.setForeground(new java.awt.Color(158, 172, 242));
        jLabel1.setText("Powered by Grupo8");
        contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 130, -1));

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMousePressed
        coordX = evt.getX();
        coordY = evt.getY();
    }//GEN-LAST:event_contenedorMousePressed

    private void contenedorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - coordX, this.getLocation().y + evt.getY() - coordY);
    }//GEN-LAST:event_contenedorMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
        evt.consume();
    }//GEN-LAST:event_exitMouseClicked

    private void txtCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCFocusGained
        if (txtC.getText().equals("Ingrese su nombre de usuario")){
            txtC.setText("");
        }
        imgUser.setIcon(new javax.swing.ImageIcon (getClass().getResource("/images/userON.jpg")));
        txtC.setForeground(Color.BLACK);
        lu.setBackground(new Color (86,105,204)); 
        imgUser.repaint();
        evt.getComponent();
    }//GEN-LAST:event_txtCFocusGained

    private void txtPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPFocusGained
        if (new String(txtP.getPassword()).equals(CLAVE)){
            txtP.setText("");
        }
        imgPass.setIcon(new ImageIcon (getClass().getResource("/images/passwordON.jpg")));
        txtP.setForeground(Color.BLACK);
        lc.setBackground(new Color (86,105,204));
        imgPass.repaint();
        evt.getComponent();
    }//GEN-LAST:event_txtPFocusGained

    private void txtCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCFocusLost
        //Desactivando textField, line e image.
        if (txtC.getText().equals("")) 
            txtC.setText("Ingrese su nombre de usuario"); //Text por defecto
        txtC.setForeground(new Color (153,153,153));
        lu.setBackground(new Color (204,204,204));
        imgUser.setIcon(new ImageIcon (getClass().getResource("/images/user.jpg")));
        imgUser.repaint();
        evt.getComponent();
    }//GEN-LAST:event_txtCFocusLost

    private void txtPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPFocusLost
        
        if (new String(txtP.getPassword()).equals(""))
            txtP.setText(CLAVE);
        txtP.setForeground(new Color (153,153,153));
        lc.setBackground(new Color (204,204,204));
        imgPass.setIcon(new javax.swing.ImageIcon (getClass().getResource("/images/password.jpg")));
        imgPass.repaint();
        evt.getComponent();
    }//GEN-LAST:event_txtPFocusLost

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        SqlUsers mod = new SqlUsers ();
        Usuario usr = new Usuario();
        
        String pass = new String (txtP.getPassword());
        
        pass = Hash.getSHA256(pass);
        if (txtC.getText().equals("admin") && txtP.getText().equals("admin")){
            MenuAdmin menu = new MenuAdmin ();
            JOptionPane.showMessageDialog(null, "Bienvenido administrador.");
            menu.setVisible(true);
            this.setVisible (false);
        }else{
            
                usr.setCorreo(txtC.getText());
                usr.setPass(pass);
            if (mod.ingresar(usr)) {
                Catalogo cat = new Catalogo();
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido " + usr.getNombre() + " " + usr.getApellido());
                cat.setVisible(true);
                cat.lblNombre.setText(usr.getNombre().toUpperCase() + " " + usr.getApellido().toUpperCase());
            }
        }
        evt.consume();
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        Registro registro = new Registro ();
        registro.setFrame(this);
        registro.setVisible (true);
        evt.consume();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.RED);
        evt.consume();
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(new Color (86,105,204));
        evt.consume();
    }//GEN-LAST:event_exitMouseExited
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exit;
    private org.edisoncor.gui.panel.PanelImage imgPass;
    private org.edisoncor.gui.panel.PanelImage imgUser;
    private javax.swing.JPanel lc;
    private javax.swing.JPanel lu;
    public javax.swing.JTextField txtC;
    private javax.swing.JPasswordField txtP;
    // End of variables declaration//GEN-END:variables
}
