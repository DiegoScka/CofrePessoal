/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cofrepessoal;

import javax.swing.ImageIcon;
import com.formdev.flatlaf.FlatDarkLaf;
import conexao.editarCON;
/**
 *
 * @author diego.sicka
 */
public class TelaEditar extends javax.swing.JDialog {

    /**
     * Creates new form TelaEditar
     */
    public TelaEditar() {
        initComponents();
    }
    
    public static class alterarLogins{
        public static String validarLogin;
        public static String alterarDescricao;
        public static String alterarLogin;
        public static String alterarSenha;
        public static Boolean informacaoAlterada;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtLogin = new javax.swing.JTextField();
        jtxtSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtSalvar = new javax.swing.JToggleButton();
        lblDescricao = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jtxtDescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CofrePessoal - Editar");
        setModal(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        lblDescricao.setText("Descrição");

        lblLogin.setText("Login");

        lblSenha.setText("Senha");

        jtxtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDescricaoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtDescricao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(jtxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblSenha))
                .addGap(12, 12, 12)
                .addComponent(jbtSalvar)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLoginKeyReleased
        if (!jtxtDescricao.getText().equals("") && (!jtxtLogin.getText().equals("")) && (!jtxtSenha.getText().equals("")))
        {
            jbtSalvar.setEnabled(true);
        }
        else
        {
            jbtSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtLoginKeyReleased

    private void jtxtLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLoginKeyTyped
        if (jtxtLogin.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtLoginKeyTyped

    private void jtxtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyReleased
        if (!jtxtDescricao.getText().equals("") && (!jtxtLogin.getText().equals("")) && (!jtxtSenha.getText().equals("")))
        {
            jbtSalvar.setEnabled(true);
        }
        else
        {
            jbtSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtSenhaKeyReleased

    private void jtxtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSenhaKeyTyped
        if (jtxtSenha.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtSenhaKeyTyped

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        String des = jtxtDescricao.getText();
        String log = jtxtLogin.getText();
        String sen = jtxtSenha.getText();
        editarCON editarCON = new editarCON();
        editarCON.editarConexao(des, log, sen);
        if (TelaEditar.alterarLogins.informacaoAlterada == true)
        {
            this.dispose();
        }
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jtxtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescricaoKeyReleased
        if (!jtxtDescricao.getText().equals("") && (!jtxtLogin.getText().equals("")) && (!jtxtSenha.getText().equals("")))
        {
            jbtSalvar.setEnabled(true);
        }
        else
        {
            jbtSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxtDescricaoKeyReleased

    private void jtxtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescricaoKeyTyped
        if (jtxtDescricao.getText().length()>=25)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDescricaoKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       ImageIcon icon = new ImageIcon("src/safe.png");
       setIconImage(icon.getImage());               
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jtxtDescricao.setText(alterarLogins.alterarDescricao);
       jtxtLogin.setText(alterarLogins.alterarLogin);
       jtxtSenha.setText(alterarLogins.alterarSenha);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatDarkLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jbtSalvar;
    private javax.swing.JTextField jtxtDescricao;
    private javax.swing.JTextField jtxtLogin;
    private javax.swing.JTextField jtxtSenha;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}