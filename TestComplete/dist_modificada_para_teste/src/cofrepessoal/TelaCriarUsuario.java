/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cofrepessoal;

import com.formdev.flatlaf.FlatDarkLaf;
import conexao.criarUsuarioCON;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public final class TelaCriarUsuario extends javax.swing.JDialog {
           
    public TelaCriarUsuario(){
        initComponents();
    }     

    public static class criarUsuario{
        public static Boolean usuarioExistente;
        public static Boolean disposeTelaCriarUsuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtVoltar = new javax.swing.JToggleButton();
        jbtCadastrar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JFormattedTextField();
        jtxtSenha = new javax.swing.JPasswordField();
        jtxtConfirmaSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CofrePessoal - Criar Usuário");
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        jbtVoltar.setText("Voltar");
        jbtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVoltarActionPerformed(evt);
            }
        });

        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.setEnabled(false);
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("*");

        jLabel4.setText("*");

        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        jtxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jtxtConfirmaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtConfirmaSenhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtConfirmaSenhaKeyTyped(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separator.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(6, 43));
        jLabel5.setMinimumSize(new java.awt.Dimension(6, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtConfirmaSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jtxtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtVoltar)
                    .addComponent(jbtCadastrar))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       ImageIcon icon = new ImageIcon("src/safe.png");
       setIconImage(icon.getImage());       
    }//GEN-LAST:event_formWindowActivated

    private void jtxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyTyped
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();

        if (jtxtUsuario.getText().length()>=10)
        {
            evt.consume();
        }

        if(!Character.isLetter(c) && code!=KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtUsuarioKeyTyped

    private void jtxtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyReleased
        if ((!jtxtUsuario.getText().equals("")) && (!jtxtSenha.getText().equals("")) && (!jtxtConfirmaSenha.getText().equals("")))
        {
            if (jtxtConfirmaSenha.getText().equals(jtxtSenha.getText()))
            {
                jbtCadastrar.setEnabled(true);
            }
            else
            {
                jbtCadastrar.setEnabled(false);
            }
        }
        else
        {
            jbtCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtUsuarioKeyReleased

    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed
        String usu = jtxtUsuario.getText();
        String sen = jtxtSenha.getText();
        criarUsuarioCON criarUsuarioCON = new criarUsuarioCON();
        criarUsuarioCON.criarUsuarioConexao(usu, sen);
        
        if (TelaCriarUsuario.criarUsuario.usuarioExistente == true)
        {
            jtxtUsuario.setText("");
            jtxtSenha.setText("");
            jtxtConfirmaSenha.setText("");
            jbtCadastrar.setEnabled(false);
        }        
        
        if (TelaCriarUsuario.criarUsuario.disposeTelaCriarUsuario == true)
        {
            this.dispose();
            TelaCriarUsuario.criarUsuario.disposeTelaCriarUsuario = false;
        }
    }//GEN-LAST:event_jbtCadastrarActionPerformed

    private void jbtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtVoltarActionPerformed

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jtxtConfirmaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtConfirmaSenhaKeyReleased
        if ((!jtxtUsuario.getText().equals("")) && (!jtxtSenha.getText().equals("")) && (!jtxtConfirmaSenha.getText().equals("")))
        {
            if (jtxtConfirmaSenha.getText().equals(jtxtSenha.getText()))
            {
                jbtCadastrar.setEnabled(true);
            }
            else
            {
                jbtCadastrar.setEnabled(false);
            }
        }
        else
        {
            jbtCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtConfirmaSenhaKeyReleased

    private void jtxtConfirmaSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtConfirmaSenhaKeyTyped
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();

        if (jtxtConfirmaSenha.getText().length()>=10)
        {
            evt.consume();
        }

        if((!Character.isLetter(c) && !Character.isDigit(c)) && code!=KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtConfirmaSenhaKeyTyped

    private void jtxtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyReleased
        if ((!jtxtUsuario.getText().equals("")) && (!jtxtSenha.getText().equals("")) && (!jtxtConfirmaSenha.getText().equals("")))
        {
            if (jtxtConfirmaSenha.getText().equals(jtxtSenha.getText()))
            {
                jbtCadastrar.setEnabled(true);
            }
            else
            {
                jbtCadastrar.setEnabled(false);
            }
        }
        else
        {
            jbtCadastrar.setEnabled(false);
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatDarkLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jbtCadastrar;
    private javax.swing.JToggleButton jbtVoltar;
    private javax.swing.JPasswordField jtxtConfirmaSenha;
    private javax.swing.JPasswordField jtxtSenha;
    private javax.swing.JFormattedTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
