/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package conexao;

import cofrepessoal.TelaPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego.sicka
 */
public class excluirCON {

    Connection con = null;
    PreparedStatement pst; 
    
    public void excluirConexao(JTable jTable1){
        int dialogResult = JOptionPane.showConfirmDialog (null, "Realmente deseja excluir este Login?","CofrePessoal - Exclusão",JOptionPane.YES_NO_OPTION);
        String sqlDelete = "DELETE FROM cofre_cadastro WHERE login=?";
        TelaPrincipal tPrincipal = new TelaPrincipal();
        
        if(dialogResult == JOptionPane.YES_OPTION)  
        {
            TelaPrincipal.tabelaLogins.tblModel = (DefaultTableModel) jTable1.getModel();    
            int row = jTable1.getSelectedRow();
            String login = jTable1.getModel().getValueAt(row, 1).toString(); 
            try
            {  
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
                pst = con.prepareStatement(sqlDelete);
                pst.setString(1, login);
                pst.execute(); 
                TelaPrincipal.tabelaLogins.tblModel.removeRow(row);
                TelaPrincipal.tabelaLogins.confirmaExclusao = true;
                con.close();
                pst.close();
            }
            catch (SQLException ex)
            {  
                JOptionPane.showMessageDialog(tPrincipal, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
                System.out.println(ex.getMessage());
            }     
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
