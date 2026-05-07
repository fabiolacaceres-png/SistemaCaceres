/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author FABÍOLA CÁCERES
 */
public class FrcComprasProduto {
    private int frc_idComprasProduto;
    private int frc_Compras;
    private int frc_Produtos;
    private int frc_quantidade;
    private double frc_valor_unitario;
    private double frc_subtotal;
    private String frc_lote;

    public int getFrcIdComprasProduto(){
        return frc_idComprasProduto;
    }
    public void setFrcIdComprasProduto(int frc_idComprasProduto){
        this.frc_idComprasProduto = frc_idComprasProduto;
    }

    public int getFrcCompras(){
        return frc_Compras;
    }
    public void setFrcCompras(int frc_Compras){
        this.frc_Compras = frc_Compras;
    }

    public int getFrcProdutos(){
        return frc_Produtos;
    }
    public void setFrcProdutos(int frc_Produtos){
        this.frc_Produtos = frc_Produtos;
    }

    public int getFrcQuantidade(){
        return frc_quantidade;
    }
    public void setFrcQuantidade(int frc_quantidade){
        this.frc_quantidade = frc_quantidade;
    }

    public double getFrcValorUnitario(){
        return frc_valor_unitario;
    }
    public void setFrcValorUnitario(double frc_valor_unitario){
        this.frc_valor_unitario = frc_valor_unitario;
    }

    public double getFrcSubtotal(){
        return frc_subtotal;
    }
    public void setFrcSubtotal(double frc_subtotal){
        this.frc_subtotal = frc_subtotal;
    }

    public String getFrcLote(){
        return frc_lote;
    }
    public void setFrcLote(String frc_lote){
        this.frc_lote = frc_lote;
    }
}
    
