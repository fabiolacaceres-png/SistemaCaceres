/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcCompras;
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
public class DaoFrcCompras extends DaoAbstract {
    @Override
    public void insert(Object object) {
        FrcCompras frcCompras = (FrcCompras) object;
        try {
    Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres";
            
     Connection cnt = DriverManager.getConnection(url, user, password);
            
     String sql = "INSERT INTO frc_Compras VALUES (?,?,?,?,?,?,?)";
     PreparedStatement pst = cnt.prepareStatement(sql);
            
     pst.setInt(1, frcCompras.getFrcIdCompras());
     pst.setDate(2, null); 
     pst.setInt(3, frcCompras.getFrcfornecedores());
     pst.setInt(4, frcCompras.getFrcusuarios());
     pst.setString(5, frcCompras.getFrcformaPagamento());
     pst.setDouble(6, frcCompras.getFrcfrete());
     pst.setDouble(7, frcCompras.getFrctotal());
            
     pst.executeUpdate(); 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcCompras frcCompras = (FrcCompras) object;
    }

    @Override
    public void delete(Object object) {
        FrcCompras frcCompras = (FrcCompras) object;
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
