/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcUsuarios;
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
public class DaoFrcUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        FrcUsuarios frcUsuarios = (FrcUsuarios) object;
        try {
    Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres";
            
    Connection cnt = DriverManager.getConnection(url, user, password);
    String sql = "INSERT INTO frc_usuarios VALUES (?,?,?,?,?,?,?,?)";
    PreparedStatement pst = cnt.prepareStatement(sql);
            
    pst.setInt(1, frcUsuarios.getFrcIdUsuarios());
    pst.setString(2, frcUsuarios.getFrcNome());
    pst.setString(3, frcUsuarios.getFrcApelido());
    pst.setString(4, frcUsuarios.getFrcCpf());
    pst.setDate(5, null);                       
    pst.setInt(6, frcUsuarios.getFrcNivel());
    pst.setString(7, frcUsuarios.getFrcSenha());
    pst.setString(8, frcUsuarios.getFrcAtivo());
            
    pst.executeUpdate(); 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcUsuarios frcUsuarios = (FrcUsuarios) object;
    }

    @Override
    public void delete(Object object) {
        FrcUsuarios frcUsuarios = (FrcUsuarios) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}
