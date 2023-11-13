package com.login.igu;

import com.login.Encriptacion.contrasenaEncrip;
import com.login.logica.Usuario;
import com.login.persistencia.ControladoraPersistencia;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    private contrasenaEncrip kriptonita;
    private String contrasenaEncriptada;

    public registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        txtNombreLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        cbMostrar = new javax.swing.JCheckBox();
        cbMostrarConfirm = new javax.swing.JCheckBox();
        txtConfirmarContrasena = new javax.swing.JPasswordField();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/email-envelope-outline-shape-with-rounded-corners_icon-icons.com_56530.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/account_avatar_face_man_people_profile_user_icon_123197.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock-outlined-padlock-symbol-for-security-interface_icon-icons.com_57803.png"))); // NOI18N

        txtRegistro.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtRegistro.setText("Registro");

        txt.setText("Nombre Usuario");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock-outlined-padlock-symbol-for-security-interface_icon-icons.com_57803.png"))); // NOI18N

        jLabel5.setText("Contraseña");

        jLabel6.setText("Confirmar Contraseña");

        jLabel7.setText("Correo");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/person_user_account_avatar_profile_confirm_users_icon_218735.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        btnConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarKeyPressed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/population_return_people_icon_148408.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarActionPerformed(evt);
            }
        });

        cbMostrarConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarConfirmActionPerformed(evt);
            }
        });

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMostrar))
                            .addComponent(txtNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMostrarConfirm))
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(txtRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtRegistro)
                .addGap(33, 33, 33)
                .addComponent(txt)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMostrar)))
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMostrarConfirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        iniciarSesion frm = new iniciarSesion();
        frm.setVisible(true);
        this.dispose(); // Cierra la ventana de registro
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void cbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarActionPerformed
        if (cbMostrar.isSelected()) {
            txtContrasena.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txtContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarActionPerformed

    private void cbMostrarConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarConfirmActionPerformed
        if (cbMostrarConfirm.isSelected()) {
            txtConfirmarContrasena.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txtConfirmarContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarConfirmActionPerformed

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        String nombreUsuario = txtNombreLogin.getText();
        String contrasena = new String(txtContrasena.getPassword());
        String confirmarContrasena = new String(txtConfirmarContrasena.getPassword());
        String correo = txtCorreo.getText();
        Usuario usuario = new Usuario();

        // Verifica si los campos están vacíos
        if (nombreUsuario.isEmpty() || contrasena.isEmpty() || confirmarContrasena.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica que la contraseña y la confirmación coincidan
        if (!contrasena.equals(confirmarContrasena)) {
            JOptionPane.showMessageDialog(null, "La contraseña y la confirmación no coinciden", "Error de Confirmación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica si el usuario ya existe en la base de datos
        if (usuarioExistente(nombreUsuario, contrasenaEncriptada)) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe en la base de datos", "Usuario Existente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Encripta la contraseña antes de almacenarla
        contrasenaEncrip encriptador = new contrasenaEncrip();
        String contrasenaEncriptada = encriptador.Encriptar(contrasena);

        // Crea un nuevo objeto Usuario con los valores obtenidos
        Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasenaEncriptada, correo);

        // Llama al método de la ControladoraPersistencia para registrar el nuevo usuario
        controladoraPersistencia.registrarUsuario(nuevoUsuario);

        // Limpia los campos después de registrar el usuario
        txtNombreLogin.setText("");
        txtContrasena.setText("");
        txtConfirmarContrasena.setText("");
        txtCorreo.setText("");

        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        iniciarSesion frm = new iniciarSesion();
        frm.setVisible(true);
        this.dispose(); // Cierra la ventana de registro
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        //Se asegura de capturar la tecla ENTER y descartar todas las demás
        char cTeclaPresionada = evt.getKeyChar();

        //Da clicl al boton de Confirmar al detectar la tecla de ENTER
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            btnConfirmar.doClick();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Llama al método para confirmar aquí
            btnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Llama al método para confirmar aquí
            btnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private boolean usuarioExistente(String nombreUsuario, String contrasenaEncriptada) {
        // Lógica para verificar si el usuario ya existe en la base de datos
        List<Usuario> listaUsuarios = controladoraPersistencia.traerUsuarios();

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)
                    && usuario.getContrasena().equals(contrasenaEncriptada)) {
                return true; // Usuario encontrado
            }
        }

        return false; // Usuario no encontrado
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox cbMostrar;
    private javax.swing.JCheckBox cbMostrarConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt;
    private javax.swing.JPasswordField txtConfirmarContrasena;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreLogin;
    private javax.swing.JLabel txtRegistro;
    // End of variables declaration//GEN-END:variables

    private static class cbMostrarConfirm {

        private static boolean isSelected() {
            return false;
        }

        public cbMostrarConfirm() {
        }
    }
}
