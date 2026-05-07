/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcComprasProduto;
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

public class DaoFrcComprasProduto extends DaoAbstract {

    @Override
    public void insert(Object object) {
        FrcComprasProduto frcComprasProduto = (FrcComprasProduto) object;
        try {
   Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres";
            
    Connection cnt = DriverManager.getConnection(url, user, password);
    String sql = "INSERT INTO frc_Compras_produto VALUES (?,?,?,?,?,?,?)";
    PreparedStatement pst = cnt.prepareStatement(sql);
            
    pst.setInt(1, frcComprasProduto.getFrcIdComprasProduto());
    pst.setInt(2, frcComprasProduto.getFrcCompras());
    pst.setInt(3, frcComprasProduto.getFrcProdutos());
    pst.setInt(4, frcComprasProduto.getFrcQuantidade());
    pst.setDouble(5, frcComprasProduto.getFrcValorUnitario());
    pst.setDouble(6, frcComprasProduto.getFrcSubtotal());
    pst.setString(7, frcComprasProduto.getFrcLote());
            
    pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcComprasProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcComprasProduto frcComprasProduto = (FrcComprasProduto) object;
    }

    @Override
    public void delete(Object object) {
        FrcComprasProduto frcComprasProduto = (FrcComprasProduto) object;
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