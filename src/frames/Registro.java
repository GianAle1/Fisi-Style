package frames;

import clases.Usuario;
import bdmysql.Hash;
import bdmysql.SqlUsers;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 6
 */
public class Registro extends javax.swing.JFrame {
    private static final String FUENTE1 = "Segoe UI";
    int coordX;
    int coordY; //Para mover el form
    
    //Creación de objetos
    Login log = new Login();
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel contenedor = new javax.swing.JPanel();
        images.PanelRound1 btnRegistrar = new images.PanelRound1();
        javax.swing.JLabel lblRegistrar = new javax.swing.JLabel();
        images.PanelRound1 panelCorreo = new images.PanelRound1();
        javax.swing.JLabel lblCorreo = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgCorreo = new org.edisoncor.gui.panel.PanelImage();
        txtCorreo = new javax.swing.JTextField();
        images.PanelRound1 namePanel = new images.PanelRound1();
        javax.swing.JLabel lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        org.edisoncor.gui.panel.PanelImage imgUser = new org.edisoncor.gui.panel.PanelImage();
        images.PanelRound1 apellidoPanel = new images.PanelRound1();
        javax.swing.JLabel lblA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        org.edisoncor.gui.panel.PanelImage imgUser1 = new org.edisoncor.gui.panel.PanelImage();
        images.PanelRound1 panelDNI = new images.PanelRound1();
        javax.swing.JLabel lblDNI = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        org.edisoncor.gui.panel.PanelImage imgDNI = new org.edisoncor.gui.panel.PanelImage();
        images.PanelRound1 panelTel = new images.PanelRound1();
        org.edisoncor.gui.panel.PanelImage imgTel = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel lblD1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        images.PanelRound1 panelPass = new images.PanelRound1();
        javax.swing.JLabel lblPass = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgPass = new org.edisoncor.gui.panel.PanelImage();
        txtPass = new javax.swing.JPasswordField();
        images.PanelRound1 panelPass2 = new images.PanelRound1();
        javax.swing.JLabel lblPass1 = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage imgPass1 = new org.edisoncor.gui.panel.PanelImage();
        txtPass2 = new javax.swing.JPasswordField();
        javax.swing.JLabel tittle = new javax.swing.JLabel();
        org.edisoncor.gui.panel.PanelImage panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        images.PanelRound1 btnCancelar = new images.PanelRound1();
        javax.swing.JLabel lblCancelar = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(720, 562));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                contenedorMouseDragged(evt);
            }
        });
        contenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contenedorMousePressed(evt);
            }
        });
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setBackground(new java.awt.Color(86, 105, 204));
        btnRegistrar.setRoundBottomLeft(35);
        btnRegistrar.setRoundBottomRight(35);
        btnRegistrar.setRoundTopLeft(35);
        btnRegistrar.setRoundTopRight(35);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrar.setFont(new java.awt.Font(FUENTE1, 1, 16));
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("REGISTRAR");
        btnRegistrar.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, 90, -1));

        contenedor.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 240, 45));

        panelCorreo.setBackground(new java.awt.Color(243, 246, 251));
        panelCorreo.setRoundBottomLeft(15);
        panelCorreo.setRoundBottomRight(15);
        panelCorreo.setRoundTopLeft(15);
        panelCorreo.setRoundTopRight(15);
        panelCorreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblCorreo.setForeground(new java.awt.Color(90, 90, 90));
        lblCorreo.setText("Correo electrónico");
        panelCorreo.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        imgCorreo.setBackground(new java.awt.Color(255, 255, 255));
        imgCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/correoE.png"))); // NOI18N
        panelCorreo.add(imgCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 10, 40, 40));

        txtCorreo.setBackground(new java.awt.Color(243, 246, 251));
        txtCorreo.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelCorreo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 290, 60));

        namePanel.setBackground(new java.awt.Color(243, 246, 251));
        namePanel.setRoundBottomLeft(15);
        namePanel.setRoundBottomRight(15);
        namePanel.setRoundTopLeft(15);
        namePanel.setRoundTopRight(15);
        namePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblN.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblN.setForeground(new java.awt.Color(90, 90, 90));
        lblN.setText("Nombre");
        namePanel.add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtN.setBackground(new java.awt.Color(243, 246, 251));
        txtN.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        namePanel.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        imgUser.setBackground(new java.awt.Color(255, 255, 255));
        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombreApellido.jpg"))); // NOI18N
        namePanel.add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 30, 30));

        contenedor.add(namePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 290, 60));

        apellidoPanel.setBackground(new java.awt.Color(243, 246, 251));
        apellidoPanel.setRoundBottomLeft(15);
        apellidoPanel.setRoundBottomRight(15);
        apellidoPanel.setRoundTopLeft(15);
        apellidoPanel.setRoundTopRight(15);
        apellidoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblA.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblA.setForeground(new java.awt.Color(90, 90, 90));
        lblA.setText("Apellido");
        apellidoPanel.add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtA.setBackground(new java.awt.Color(243, 246, 251));
        txtA.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        apellidoPanel.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        imgUser1.setBackground(new java.awt.Color(255, 255, 255));
        imgUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombreApellido.jpg"))); // NOI18N
        apellidoPanel.add(imgUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 30, 30));

        contenedor.add(apellidoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 280, 60));

        panelDNI.setBackground(new java.awt.Color(243, 246, 251));
        panelDNI.setRoundBottomLeft(15);
        panelDNI.setRoundBottomRight(15);
        panelDNI.setRoundTopLeft(15);
        panelDNI.setRoundTopRight(15);
        panelDNI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDNI.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblDNI.setForeground(new java.awt.Color(90, 90, 90));
        lblDNI.setText("DNI");
        panelDNI.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtD.setBackground(new java.awt.Color(243, 246, 251));
        txtD.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelDNI.add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        imgDNI.setBackground(new java.awt.Color(255, 255, 255));
        imgDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dni.jpg"))); // NOI18N
        panelDNI.add(imgDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 30, 30));

        contenedor.add(panelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 290, 60));

        panelTel.setBackground(new java.awt.Color(243, 246, 251));
        panelTel.setRoundBottomLeft(15);
        panelTel.setRoundBottomRight(15);
        panelTel.setRoundTopLeft(15);
        panelTel.setRoundTopRight(15);
        panelTel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgTel.setBackground(new java.awt.Color(255, 255, 255));
        imgTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telefono.png"))); // NOI18N
        panelTel.add(imgTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 35, 35));

        lblD1.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblD1.setForeground(new java.awt.Color(90, 90, 90));
        lblD1.setText("Telefono");
        panelTel.add(lblD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtTelefono.setBackground(new java.awt.Color(243, 246, 251));
        txtTelefono.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelTel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 290, 60));

        panelPass.setBackground(new java.awt.Color(243, 246, 251));
        panelPass.setRoundBottomLeft(15);
        panelPass.setRoundBottomRight(15);
        panelPass.setRoundTopLeft(15);
        panelPass.setRoundTopRight(15);
        panelPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPass.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblPass.setForeground(new java.awt.Color(90, 90, 90));
        lblPass.setText("Contraseña");
        panelPass.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        imgPass.setBackground(new java.awt.Color(255, 255, 255));
        imgPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contraseña.png"))); // NOI18N
        panelPass.add(imgPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 12, 35, 35));

        txtPass.setBackground(new java.awt.Color(243, 246, 251));
        txtPass.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelPass.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 290, 60));

        panelPass2.setBackground(new java.awt.Color(243, 246, 251));
        panelPass2.setRoundBottomLeft(15);
        panelPass2.setRoundBottomRight(15);
        panelPass2.setRoundTopLeft(15);
        panelPass2.setRoundTopRight(15);
        panelPass2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPass1.setFont(new java.awt.Font(FUENTE1, 0, 12));
        lblPass1.setForeground(new java.awt.Color(90, 90, 90));
        lblPass1.setText("Confirmar contraseña");
        panelPass2.add(lblPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

        imgPass1.setBackground(new java.awt.Color(255, 255, 255));
        imgPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contraseña.png"))); // NOI18N
        panelPass2.add(imgPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 12, 35, 35));

        txtPass2.setBackground(new java.awt.Color(243, 246, 251));
        txtPass2.setFont(new java.awt.Font(FUENTE1, 0, 13));
        txtPass2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelPass2.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 290, 60));

        tittle.setBackground(new java.awt.Color(0, 0, 0));
        tittle.setFont(new java.awt.Font(FUENTE1, 1, 30));
        tittle.setForeground(new java.awt.Color(51, 51, 51));
        tittle.setText("Empecemos...");
        contenedor.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 540, 50));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconFisiStyle.png"))); // NOI18N
        contenedor.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 120, 100));

        btnCancelar.setBackground(new java.awt.Color(221, 230, 237));
        btnCancelar.setRoundBottomLeft(35);
        btnCancelar.setRoundBottomRight(35);
        btnCancelar.setRoundTopLeft(35);
        btnCancelar.setRoundTopRight(35);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCancelar.setFont(new java.awt.Font(FUENTE1, 1, 16));
        lblCancelar.setForeground(new java.awt.Color(153, 153, 153));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("CANCELAR");
        btnCancelar.add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        contenedor.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 200, 45));

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setFrame(Login log){
        this.log = log;
        this.log.setEnabled(false);
    }
    
    private String crearCorreo(String nombre, String apellido){
        String [] nom;
        String [] apell;
        String correo;
        nom = nombre.split("\\s+"); //Separa los nombres por fragmentos en base a los espacios
        apell = apellido.split("\\s+");//Separa los apellidos por fragmentos en base a los espacios
        correo = (nom[0] + "." + apell[0] + "@fstyle.com"); //Concatena el primer nombre y primer apellido.
        correo = correo.toLowerCase();
        return correo; //Retorna el correo
    }
    
    private boolean camposVacios(String txt1, String txt2,String txt3,String txt4,String txt5) {
    return txt1.isEmpty() || txt2.isEmpty() || txt3.isEmpty() || txt4.isEmpty() || txt5.isEmpty();
}

    private boolean passEquals(String pass) {
        return pass.equals(new String(txtPass2.getPassword()));
}

    
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        SqlUsers sqlUsers = new SqlUsers();
        String nombre = txtN.getText();
        String apellido = txtA.getText();
        String dni = txtD.getText();
        String tel = txtTelefono.getText();
        String correoE = txtCorreo.getText();
        String correo;
        String pass = new String(txtPass.getPassword());

        if (camposVacios(nombre, apellido, dni, tel, correoE)) {
            JOptionPane.showMessageDialog(null, "Rellene todos los datos.");
        } else if (!passEquals(pass)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas son distintas.");
        } else {
            correo = crearCorreo(nombre, apellido); // Genera un correo en base a su nombre y apellido
            pass = Hash.getSHA256(pass); // Encripta la contraseña usando SHA256
            Usuario u = new Usuario(); // Instancia un objeto en base a la clase Usuario
            u.setNombre(nombre); // Llenamos datos
            u.setApellido(apellido);
            u.setDni(dni);
            u.setTelefono(tel);
            u.setCorreoE(correoE);
            u.setCorreo(correo);
            u.setPass(pass);
            if (sqlUsers.registrar(u)) {
                log.txtC.setText(correo);
                JOptionPane.showMessageDialog(null, "Ha sido registrado correctamente.");
                this.setVisible(false);
                log.setEnabled(true);
                log.toFront();
            }
        }
        evt.consume();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.setVisible(false);
        log.setEnabled(true);
        log.toFront();
        evt.consume();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void contenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMousePressed
        coordX = evt.getX();
        coordY = evt.getY();
    }//GEN-LAST:event_contenedorMousePressed

    private void contenedorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - coordX, this.getLocation().y + evt.getY() - coordY);
    }//GEN-LAST:event_contenedorMouseDragged

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Registro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtN;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
