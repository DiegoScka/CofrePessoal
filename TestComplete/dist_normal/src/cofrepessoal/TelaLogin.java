/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cofrepessoal;

import conexao.loginCON;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class TelaLogin extends javax.swing.JFrame{

    public TelaLogin() {
        initComponents();
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jlblUsuario = new javax.swing.JLabel();
        jlblSenha = new javax.swing.JLabel();
        jbtLogin = new javax.swing.JToggleButton();
        jbtCriarUsuario = new javax.swing.JToggleButton();
        jtxtUsuario = new javax.swing.JFormattedTextField();
        jtxtSenha = new javax.swing.JPasswordField();
        jbtShowPassword = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CofrePessoal - Login");
        setModalExclusionType(null);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jlblUsuario.setText("Usuário");

        jlblSenha.setText("Senha");

        jbtLogin.setText("Login");
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });

        jbtCriarUsuario.setText("Criar Usuário");
        jbtCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCriarUsuarioActionPerformed(evt);
            }
        });

        jtxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyTyped(evt);
            }
        });

        jtxtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtSenhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSenhaKeyTyped(evt);
            }
        });

        jbtShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/show_password.png"))); // NOI18N
        jbtShowPassword.setToolTipText("Mostrar senha");
        jbtShowPassword.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/hide_password.png"))); // NOI18N
        jbtShowPassword.setEnabled(false);
        jbtShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtShowPasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtShowPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtShowPasswordMouseReleased(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jlblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtSenha)
                        .addGap(2, 2, 2)
                        .addComponent(jbtShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlblUsuario))
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblSenha)
                        .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtLogin)
                    .addComponent(jbtCriarUsuario))
                .addGap(7, 7, 7)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    public static class LoggedUserClass {
        public static String LoggedUser;
        public static Boolean loginDispose;
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("src/safe.png");
        setIconImage(icon.getImage());   
    }//GEN-LAST:event_formWindowActivated

    private void jbtCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCriarUsuarioActionPerformed
        jtxtUsuario.setText("");
        jtxtSenha.setText("");
        jbtShowPassword.setEnabled(false);
        TelaCriarUsuario tCriarUsuario = new TelaCriarUsuario();
        tCriarUsuario.setVisible(true);
    }//GEN-LAST:event_jbtCriarUsuarioActionPerformed

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        String usu = jtxtUsuario.getText();
        String sen = jtxtSenha.getText();
        loginCON login = new loginCON();
        login.loginConexao(usu, sen);
        
        if (TelaLogin.LoggedUserClass.loginDispose == true)
        {
            this.dispose();
        }
    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jtxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyTyped
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();

        if (jtxtUsuario.getText().length()>=10)
        {
            evt.consume();
        }

        if(!Character.isLetter(c) && code!=KeyEvent.VK_BACK_SPACE) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtUsuarioKeyTyped
    
    private void jtxtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyReleased
        if (!jtxtUsuario.getText().equals("") && (!jtxtSenha.getText().equals("")))
        {
            jbtLogin.setEnabled(true);
        }
        else
        {
            jbtLogin.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtUsuarioKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jtxtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyReleased
        if (!jtxtSenha.getText().equals(""))
        {
            jbtShowPassword.setEnabled(true);
        }
        else
        {
            jbtShowPassword.setEnabled(false);
        }
        
        if (!jtxtUsuario.getText().equals("") && (!jtxtSenha.getText().equals("")))
        {
            jbtLogin.setEnabled(true);
        }
        else
        {
            jbtLogin.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtSenhaKeyReleased

    private void jtxtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyTyped
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();

        if (jtxtSenha.getText().length()>=10)
        {
            evt.consume();
        }

        if((!Character.isLetter(c) && !Character.isDigit(c)) && code!=KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtSenhaKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
              
    }//GEN-LAST:event_formWindowGainedFocus

    private void jtxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyPressed

    }//GEN-LAST:event_jtxtUsuarioKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jbtShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtShowPasswordMouseClicked

    }//GEN-LAST:event_jbtShowPasswordMouseClicked

    private void jbtShowPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtShowPasswordMousePressed
        jtxtSenha.setEchoChar((char)0);
    }//GEN-LAST:event_jbtShowPasswordMousePressed

    private void jbtShowPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtShowPasswordMouseReleased
        jtxtSenha.setEchoChar('\u2022');
    }//GEN-LAST:event_jbtShowPasswordMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        FlatDarkLaf.setup();
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JToggleButton jbtCriarUsuario;
    private javax.swing.JToggleButton jbtLogin;
    private javax.swing.JButton jbtShowPassword;
    private javax.swing.JLabel jlblSenha;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPasswordField jtxtSenha;
    private javax.swing.JFormattedTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
