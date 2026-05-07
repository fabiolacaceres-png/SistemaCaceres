/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcVendasProduto;
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
public class DaoFrcVendasProduto extends DaoAbstract {

    @Override
    public void insert(Object object) {
        FrcVendasProduto frcVendasProduto = (FrcVendasProduto) object;
        try {
     Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres";
    Connection cnt = DriverManager.getConnection(url, user, password);
          
    String sql = "INSERT INTO frc_Vendas_produto VALUES (?,?,?,?,?,?,?)";
    PreparedStatement pst = cnt.prepareStatement(sql);
            
    pst.setInt(1, frcVendasProduto.getFrc_id_Vendas_produto());
    pst.setInt(2, frcVendasProduto.getFrc_venda());
    pst.setInt(3, frcVendasProduto.getFrc_produtos());
    pst.setInt(4, frcVendasProduto.getFrc_quantidade());
    pst.setDouble(5, frcVendasProduto.getFrc_valor_unitario());
    pst.setDouble(6, frcVendasProduto.getFrc_subtotal());
    pst.setDouble(7, frcVendasProduto.getFrc_desconto());
            
    pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcVendasProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcVendasProduto frcVendasProduto = (FrcVendasProduto) object;
    }

    @Override
    public void delete(Object object) {
        FrcVendasProduto frcVendasProduto = (FrcVendasProduto) object;
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
