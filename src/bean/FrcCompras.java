/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author FABÍOLA CÁCERES
 */
public class FrcCompras {
    private int frc_idCompras;
    private Date frc_dataCompra;
    private int frc_fornecedores;
    private int frc_usuarios;
    private String frc_formaPagamento;
    private double frc_frete;
    private double frc_total;
    
    public int getFrcIdCompras(){
        return frc_idCompras;
    }
    public void setFrcIdCompras(int frc_idCompras){
        this.frc_idCompras = frc_idCompras;
    }

    public Date getFrcdataCompra(){
        return frc_dataCompra;
    }
    public void setFrcdataCompra(Date frc_dataCompra){
        this.frc_dataCompra = frc_dataCompra;
    }

    public int getFrcfornecedores(){
        return frc_fornecedores;
    }
    public void setFrcfornecedores(int frc_fornecedores){
        this.frc_fornecedores = frc_fornecedores;
    }

    public int getFrcusuarios(){
        return frc_usuarios;
    }
    public void setFrcusuarios(int frc_usuarios){
        this.frc_usuarios = frc_usuarios;
    }

    public String getFrcformaPagamento(){
        return frc_formaPagamento;
    }
    public void setFrcformaPagamento(String frc_formaPagamento){
        this.frc_formaPagamento = frc_formaPagamento;
    }

    public double getFrcfrete(){
        return frc_frete;
    }
    public void setFrcfrete(double frc_frete){
        this.frc_frete = frc_frete;
    }

    public double getFrctotal(){
        return frc_total;
    }
    public void setFrctotal(double frc_total){
        this.frc_total = frc_total;
    }
}
