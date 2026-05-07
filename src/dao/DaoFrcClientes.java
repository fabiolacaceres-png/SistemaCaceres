/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcClientes;
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
public class DaoFrcClientes extends DaoAbstract {
    @Override
    public void insert(Object object) {
        FrcClientes frcClientes = (FrcClientes) object;
        try {
  Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres";
            
   Connection cnt = DriverManager.getConnection(url, user, password);
            
   String sql = "INSERT INTO frc_clientes VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   PreparedStatement pst = cnt.prepareStatement(sql);
            
   pst.setInt(1, frcClientes.getFrcIdClientes());
   pst.setString(2, frcClientes.getFrcNome());
   pst.setString(3, frcClientes.getFrcCpf());
   pst.setDate(4, null);
   pst.setString(5, frcClientes.getFrcEmail());
   pst.setString(6, frcClientes.getFrcTelefone());
   pst.setString(7, frcClientes.getFrcCep());
   pst.setString(8, frcClientes.getFrcEndereco());
   pst.setString(9, frcClientes.getFrcBairro());
   pst.setString(10, frcClientes.getFrcCidade());
   pst.setString(11, frcClientes.getFrcEstado());
   pst.setString(12, frcClientes.getFrcNumero());
   pst.setString(13, frcClientes.getFrcComplemento());
   pst.setDate(14, null);
   pst.setString(15, frcClientes.getFrcAtivo());
            
   pst.executeUpdate();
            cnt.close(); 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        FrcClientes frcClientes = (FrcClientes) object;
    }

    @Override
    public void delete(Object object) {
        FrcClientes frcClientes = (FrcClientes) object;
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
