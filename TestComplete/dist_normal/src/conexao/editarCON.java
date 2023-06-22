/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package conexao;

import cofrepessoal.TelaEditar;
import cofrepessoal.TelaLogin;
import static cofrepessoal.TelaPrincipal.tabelaLogins.tblModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego.sicka
 */
public class editarCON {

    Connection con = null;
    PreparedStatement pst; 
    ResultSet rs;
    
    public void editarConexao(String descricao, String login, String senha){
        TelaEditar tEditar = new TelaEditar();
        String user = TelaLogin.LoggedUserClass.LoggedUser;
        String sql = "SELECT c.descricao, c.login, c.senha FROM cofre_cadastro c INNER JOIN cofre_usuarios u ON c.user_id = u.user_id WHERE u.usuario = '"+user+"'";
        String sqlUpdate = "UPDATE cofre_cadastro SET descricao=?, login=?, senha=? WHERE login=?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
            pst = con.prepareStatement("SELECT * FROM cofre_usuarios u, cofre_cadastro c");
            rs = pst.executeQuery();
            while (rs.next())
            {
                String user2 = rs.getString("usuario");
                if (TelaLogin.LoggedUserClass.LoggedUser.equals(user2))
                {
                    try
                    {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
                        pst = con.prepareStatement(sqlUpdate);
                        pst.setString(1, descricao);
                        pst.setString(2, login);
                        pst.setString(3, senha);
                        pst.setString(4, TelaEditar.alterarLogins.validarLogin);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(tEditar, "Login alterado com sucesso!", "CofrePessoal - Editar", 1);
                        rs = pst.executeQuery(sql);
                        tblModel.setRowCount(0);
                        TelaEditar.alterarLogins.informacaoAlterada = true;
                        while (rs.next())
                        {
                            tblModel.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                        }   
                    }
                    catch (ClassNotFoundException | SQLException ex)
                    {
                        JOptionPane.showMessageDialog(tEditar, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
                        System.out.println(ex.getMessage());
                    }
                }
            }
            //con.close();
            //rs.close();
            //pst.close();
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(tEditar, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
