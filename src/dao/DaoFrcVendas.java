/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcVendas;
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
public class DaoFrcVendas extends DaoAbstract {

    @Override
    public void insert(Object object) {
        FrcVendas frcVendas = (FrcVendas) object;
        try {
   Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres"; 
            
    Connection cnt = DriverManager.getConnection(url, user, password);
    String sql = "INSERT INTO frc_vendas VALUES (?,?,?,?,?,?,?)";
    PreparedStatement pst = cnt.prepareStatement(sql);
            
    pst.setInt(1, frcVendas.getFrcIdVendas());
    pst.setDate(2, null);//frc_dataVenda
    pst.setInt(3, frcVendas.getFrcCliente());
    pst.setInt(4, frcVendas.getFrcUsuario());
    pst.setString(5, frcVendas.getFrcFormaPagamento());
    pst.setDouble(6, frcVendas.getFrcDesconto());
    pst.setDouble(7, frcVendas.getFrcTotal());
            
    pst.executeUpdate(); 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcVendas frcVendas = (FrcVendas) object;
    }

    @Override
    public void delete(Object object) {
        FrcVendas frcVendas = (FrcVendas) object;
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
