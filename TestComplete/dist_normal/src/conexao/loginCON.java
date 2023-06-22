/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import cofrepessoal.TelaLogin;
import cofrepessoal.TelaPrincipal;
import java.awt.HeadlessException;
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

public class loginCON {
    
    Connection con = null;
    PreparedStatement pst; 
    ResultSet rs;
    
    public void loginConexao(String usuario, String senha){  
        TelaLogin tLogin = new TelaLogin();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cofre", "root", "");
            pst = con.prepareStatement("SELECT usuario, senha FROM cofre_usuarios WHERE usuario=?");
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            String user = "";
            String password = "";
            while (rs.next())
            {
                user = rs.getString("usuario");
                password = rs.getString("senha");
            }
            if (usuario.equals(user) && senha.equals(password))
            {
                TelaLogin.LoggedUserClass.LoggedUser = usuario;
                TelaPrincipal.tabelaLogins.usuarioAtual = TelaLogin.LoggedUserClass.LoggedUser;
                TelaPrincipal tPrincipal = new TelaPrincipal();
                tPrincipal.setVisible(true);
                TelaLogin.LoggedUserClass.loginDispose = true;
            }else{
                JOptionPane.showMessageDialog(tLogin, "Usuário ou senha incorretos!", "CofrePessoal - Login", 0);
            }
            con.close();
            rs.close();
            pst.close();
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(tLogin, "Não foi possível comunicar-se com o bando de dados", "CofrePessoal - Alerta!", 0);
                System.out.println(ex.getMessage());
            }
        }
    }
