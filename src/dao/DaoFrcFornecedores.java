/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.FrcFornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcSelect;

/**
 *
 * @author FABÍOLA CÁCERES
 */
 public class DaoFrcFornecedores extends DaoAbstract {

    @Override
    public void insert(Object object) {
    FrcFornecedores frcFornecedores = (FrcFornecedores) object;
    try {
   Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://10.7.0.51:33062/db_fabiola_caceres";
     String user = "fabiola_caceres";
     String password = "fabiola_caceres"; 
            
    Connection cnt = DriverManager.getConnection(url, user, password);
            
    String sql = "INSERT INTO frc_fornecedores VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
    pst.setInt(1, frcFornecedores.getFrcIdFornecedores());
    pst.setString(2, frcFornecedores.getFrcFantasia());
    pst.setString(3, frcFornecedores.getFrcRazaoSocial());
    pst.setString(4, frcFornecedores.getFrcCnpj());
    pst.setString(5, frcFornecedores.getFrcTelefone());
    pst.setString(6, frcFornecedores.getFrcEmail());
    pst.setString(7, frcFornecedores.getFrcCep());
    pst.setString(8, frcFornecedores.getFrcEndereco());
    pst.setString(9, frcFornecedores.getFrcBairro());
    pst.setString(10, frcFornecedores.getFrcCidade());
    pst.setString(11, frcFornecedores.getFrcEstado());
    pst.setString(12, frcFornecedores.getFrcNumero());
    pst.setString(13, frcFornecedores.getFrcContatoResponsavel());
    pst.setDate(14, null);  
    pst.setString(15, frcFornecedores.getFrcAtivo());
    pst.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoFrcFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
    FrcFornecedores frcFornecedores = (FrcFornecedores) object;
    }

    @Override
    public void delete(Object object) {
    FrcFornecedores frcFornecedores = (FrcFornecedores) object;
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
