/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cofrepessoal;

import com.formdev.flatlaf.FlatDarkLaf;
import conexao.cadastroCON;
import javax.swing.ImageIcon;
/**
 *
 * @author diego.sicka
 */
public class TelaCadastro extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }
    
    public static class limparCampos {
        public static Boolean limparCampos;
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtLimpar = new javax.swing.JToggleButton();
        jbtCadastrar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtDescricao = new javax.swing.JTextField();
        jtxtLogin = new javax.swing.JTextField();
        jtxtSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CofrePessoal - Cadastro");
        setModal(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jbtLimpar.setText("Limpar");
        jbtLimpar.setEnabled(false);
        jbtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimparActionPerformed(evt);
            }
        });

        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.setEnabled(false);
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        jtxtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDescricaoKeyTyped(evt);
            }
        });

        jtxtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtLoginKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtLoginKeyTyped(evt);
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

        jLabel4.setText("*");

        jLabel5.setText("*");

        jLabel6.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jbtCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCadastrar)
                    .addComponent(jbtLimpar))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jtxtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescricaoKeyReleased
        if (!jtxtDescricao.getText().equals("") && (!jtxtLogin.getText().equals("")) && (!jtxtSenha.getText().equals("")))
        {
            jbtCadastrar.setEnabled(true);
        }
        else
        {
            jbtCadastrar.setEnabled(false);
        }
        
        if (!jtxtDescricao.getText().equals("") || (!jtxtLogin.getText().equals("")) || (!jtxtSenha.getText().equals("")))
        {
            jbtLimpar.setEnabled(true);
        }
        else
        {
            jbtLimpar.setEnabled(false);
        }  
    }//GEN-LAST:event_jtxtDescricaoKeyReleased

    private void jtxtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLoginKeyReleased
        if (!jtxtDescricao.getText().equals("") && (!jtxtLogin.getText().equals("")) && (!jtxtSenha.getText().equals("")))
        {
            jbtCadastrar.setEnabled(true);
        }
        else
        {
            jbtCadastrar.setEnabled(false);
        }
        
        if (!jtxtDescricao.getText().equals("") || (!jtxtLogin.getText().equals("")) || (!jtxtSenha.getText().equals("")))
        {
            jbtLimpar.setEnabled(true);
        }
        else
        {
            jbtLimpar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtLoginKeyReleased

    private void jtxtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyReleased
        if (!jtxtDescricao.getText().equals("") && (!jtxtLogin.getText().equals("")) && (!jtxtSenha.getText().equals("")))
        {
            jbtCadastrar.setEnabled(true);
        }
        else
        {
            jbtCadastrar.setEnabled(false);
        }
        
        if (!jtxtDescricao.getText().equals("") || (!jtxtLogin.getText().equals("")) || (!jtxtSenha.getText().equals("")))
        {
            jbtLimpar.setEnabled(true);
        }
        else
        {
            jbtLimpar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtSenhaKeyReleased

    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        jtxtDescricao.setText("");
        jtxtLogin.setText("");
        jtxtSenha.setText("");
        jbtLimpar.setEnabled(false);
        jbtCadastrar.setEnabled(false);
    }//GEN-LAST:event_jbtLimparActionPerformed

    private void jtxtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescricaoKeyTyped
        if (jtxtDescricao.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDescricaoKeyTyped

    private void jtxtLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLoginKeyTyped
        if (jtxtLogin.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtLoginKeyTyped

    private void jtxtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyTyped
        if (jtxtSenha.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtSenhaKeyTyped

    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed
        String des = jtxtDescricao.getText();
        String log = jtxtLogin.getText();
        String sen = jtxtSenha.getText();
        cadastroCON cadastro = new cadastroCON();
        cadastro.cadastroConexao(des, log, sen);
        
        if (TelaCadastro.limparCampos.limparCampos == true)
        {
            jtxtDescricao.setText("");
            jtxtLogin.setText("");
            jtxtSenha.setText("");
            jbtCadastrar.setEnabled(false);
            jbtLimpar.setEnabled(false);   
        }
    }//GEN-LAST:event_jbtCadastrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("src/safe.png");
        setIconImage(icon.getImage()); 
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatDarkLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jbtCadastrar;
    private javax.swing.JToggleButton jbtLimpar;
    private javax.swing.JTextField jtxtDescricao;
    private javax.swing.JTextField jtxtLogin;
    private javax.swing.JTextField jtxtSenha;
    // End of variables declaration//GEN-END:variables
}
