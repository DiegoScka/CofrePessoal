/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;


import cofrepessoal.TelaLogin;
import cofrepessoal.TelaPrincipal;
import static cofrepessoal.TelaPrincipal.tabelaLogins.tblModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ifsc
 */
public class listarCON {
    
    Connection con = null;
    PreparedStatement pst; 
    ResultSet rs;   
    
    public void listarConexao(JTable jTable1){
        TelaPrincipal tPrincipal = new TelaPrincipal();
        String user = TelaLogin.LoggedUserClass.LoggedUser;
        String sql = "SELECT c.descricao, c.login, c.senha FROM cofre_cadastro c INNER JOIN cofre_usuarios u ON c.user_id = u.user_id WHERE u.usuario = '"+user+"'";
        TelaPrincipal.tabelaLogins.tblModel = (DefaultTableModel) jTable1.getModel();       
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tblModel.setRowCount(0);
            while (rs.next())
            {
                tblModel.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }
            con.close();
            rs.close();
            pst.close();             
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(tPrincipal, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
        } 
    } 
}
