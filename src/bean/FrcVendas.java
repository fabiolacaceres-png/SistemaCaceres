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
public class FrcVendas {
   private int frc_idVendas;
    private Date frc_dataVenda;
    private int frc_cliente;
    private int frc_usuario;
    private String frc_formaPagamento;
    private double frc_desconto;
    private double frc_total;

    public int getFrcIdVendas(){
        return frc_idVendas;
    }
    public void setFrcIdVendas(int frc_idVendas){
        this.frc_idVendas = frc_idVendas;
    }

    public Date getFrcDataVenda(){
        return frc_dataVenda;
    }
    public void setFrcDataVenda(Date frc_dataVenda){
        this.frc_dataVenda = frc_dataVenda;
    }

    public int getFrcCliente(){
        return frc_cliente;
    }
    public void setFrcCliente(int frc_cliente){
        this.frc_cliente = frc_cliente;
    }

    public int getFrcUsuario(){
        return frc_usuario;
    }
    public void setFrcUsuario(int frc_usuario){
        this.frc_usuario = frc_usuario;
    }

    public String getFrcFormaPagamento(){
        return frc_formaPagamento;
    }
    public void setFrcFormaPagamento(String frc_formaPagamento){
        this.frc_formaPagamento = frc_formaPagamento;
    }

    public double getFrcDesconto(){
        return frc_desconto;
    }
    public void setFrcDesconto(double frc_desconto){
        this.frc_desconto = frc_desconto;
    }

    public double getFrcTotal(){
        return frc_total;
    }
    public void setFrcTotal(double frc_total){
        this.frc_total = frc_total;
    }
}
