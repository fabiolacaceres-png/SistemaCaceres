/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author FABÍOLA CÁCERES
 */
public class JdbcCrud {
    public static void main(String[] args) {
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
            String user = "fabiola_caceres";
            String password = "fabiola_caceres";
            
    Connection cnt = DriverManager.getConnection(url, user, password);
    String sql = "INSERT INTO frc_usuarios (frc_idusuarios, frc_nome, frc_apelido, frc_cpf, frc_dataNacsimento, frc_nivel, frc_senha, frc_ativo) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
    PreparedStatement pst = cnt.prepareStatement(sql);
            
    pst.setInt(1, 101); 
    pst.setString(2, "Fabiola Caceres");
    pst.setString(3, "fabi");
    pst.setString(4, "12345678900");
    pst.setDate(5, null);
    pst.setInt(6, 1);
    pst.setString(7, "123");
    pst.setString(8, "true");
            
    pst.executeUpdate();
                    
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectou!");
    }
}
