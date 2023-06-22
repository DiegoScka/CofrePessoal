/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import cofrepessoal.TelaCadastro;
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
 * @author Diego
 */
public class cadastroCON {
    
        Connection con = null;
        PreparedStatement pst;     
    
    public void cadastroConexao(String descricao, String login, String senha){    
        TelaCadastro tCadastro = new TelaCadastro();  
        String user = TelaLogin.LoggedUserClass.LoggedUser;
        String sql = "SELECT c.descricao, c.login, c.senha FROM cofre_cadastro c INNER JOIN cofre_usuarios u ON c.user_id = u.user_id WHERE u.usuario=?";   
        int ID;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
            pst = con.prepareStatement("SELECT * FROM cofre_usuarios");
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                ID = rs.getInt("user_id");
                String user2 = rs.getString("usuario");
                if (TelaLogin.LoggedUserClass.LoggedUser.equals(user2))
                {
                    try 
                    {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
                        pst = con.prepareStatement("INSERT INTO cofre_cadastro (descricao, login, senha, user_id) VALUES (?,?,?,?)");
                        pst.setString(1, descricao);
                        pst.setString(2,login);
                        pst.setString(3, senha);
                        pst.setInt(4, ID);
                        pst.executeUpdate();
                        pst = con.prepareStatement(sql);
                        pst.setString(1, user);
                        rs = pst.executeQuery();
                        JOptionPane.showMessageDialog(tCadastro, "Login cadastrado com sucesso!", "CofrePessoal - Cadastro", 1);   
                        tblModel.setRowCount(0);
                        while (rs.next())
                        {
                            tblModel.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                        }
                        TelaCadastro.limparCampos.limparCampos = true;
                    } 
                    catch (ClassNotFoundException | SQLException ex)
                    { 
                        JOptionPane.showMessageDialog(tCadastro, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
                        System.out.println(ex.getMessage());
                    }       
                }
            }
            con.close();
            rs.close();
            pst.close();
        } catch (ClassNotFoundException | SQLException ex){ 
            //JOptionPane.showMessageDialog(this, "Não foi possível comunicar-se com o bando de dados");
        } 
    }
}
