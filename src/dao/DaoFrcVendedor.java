/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcVendedor;
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
public class DaoFrcVendedor extends DaoAbstract {

    @Override
    public void insert(Object object) {
    FrcVendedor frcVendedor = (FrcVendedor) object;
        try {
     Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres";
            
    Connection cnt = DriverManager.getConnection(url, user, password);
    String sql = "INSERT INTO frc_vendedor VALUES (?,?,?,?,?,?,?,?)";
    PreparedStatement pst = cnt.prepareStatement(sql);
            
    pst.setInt(1, frcVendedor.getFrcIdVendedor());
    pst.setString(2, frcVendedor.getFrcNome());
    pst.setString(3, frcVendedor.getFrcCpf());
    pst.setString(4, frcVendedor.getFrcTelefone());
    pst.setString(5, frcVendedor.getFrcEmail());
    pst.setDate(6, null);//frc_dataAdmissao
    pst.setDouble(7, frcVendedor.getFrcSalario());
    pst.setDouble(8, frcVendedor.getFrcComissao());
            
    pst.executeUpdate(); 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcVendedor frcVendedor = (FrcVendedor) object;
    }

    @Override
    public void delete(Object object) {
        FrcVendedor frcVendedor = (FrcVendedor) object;
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
