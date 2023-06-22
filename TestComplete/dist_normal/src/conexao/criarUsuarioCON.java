/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package conexao;

import cofrepessoal.TelaCriarUsuario;
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
public class criarUsuarioCON {

     Connection con = null;
     PreparedStatement pst; 
     ResultSet rs;
    
    public void criarUsuarioConexao (String usuario, String senha) { 
        TelaCriarUsuario tCriarUsuario = new TelaCriarUsuario();
        try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
             pst = con.prepareStatement("SELECT * FROM cofre_usuarios WHERE usuario=?");
             pst.setString(1, usuario);
             rs = pst.executeQuery();

             if (rs.next())
             {
                 JOptionPane.showMessageDialog(tCriarUsuario, "Usuário já cadastrado!", "CofrePessoal - Usuário", 1);
                 TelaCriarUsuario.criarUsuario.usuarioExistente = true;
             }
             else
             {
                 pst = con.prepareStatement("INSERT INTO cofre_usuarios (usuario, senha) VALUES (?,?)");
                 pst.setString(1, usuario);
                 pst.setString(2, senha);
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog(tCriarUsuario, "Usuário cadastrado com sucesso!", "CofrePessoal - Usuário", 1);
                 TelaCriarUsuario.criarUsuario.usuarioExistente = true;
                 TelaCriarUsuario.criarUsuario.disposeTelaCriarUsuario = true;
             }
             con.close();
             rs.close();
             pst.close();
         }
         catch (ClassNotFoundException | SQLException ex)
         {
             JOptionPane.showMessageDialog(tCriarUsuario, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
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
