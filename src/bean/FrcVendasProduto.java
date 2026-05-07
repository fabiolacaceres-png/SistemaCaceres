/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author FABÍOLA CÁCERES
 */
public class FrcVendasProduto {
   private int frc_id_Vendas_produto; 
    private int frc_venda;
    private int frc_produtos;
    private int frc_quantidade;
    private double frc_valor_unitario;
    private double frc_subtotal;
    private double frc_desconto;

    public int getFrc_id_Vendas_produto() {
        return frc_id_Vendas_produto;
    }

    public void setFrc_id_Vendas_produto(int frc_id_Vendas_produto) {
        this.frc_id_Vendas_produto = frc_id_Vendas_produto;
    }

    public int getFrc_venda() {
        return frc_venda;
    }

    public void setFrc_venda(int frc_venda) {
        this.frc_venda = frc_venda;
    }

    public int getFrc_produtos() {
        return frc_produtos;
    }

    public void setFrc_produtos(int frc_produtos) {
        this.frc_produtos = frc_produtos;
    }

    public int getFrc_quantidade() {
        return frc_quantidade;
    }

    public void setFrc_quantidade(int frc_quantidade) {
        this.frc_quantidade = frc_quantidade;
    }

    public double getFrc_valor_unitario() {
        return frc_valor_unitario;
    }

    public void setFrc_valor_unitario(double frc_valor_unitario) {
        this.frc_valor_unitario = frc_valor_unitario;
    }

    public double getFrc_subtotal() {
        return frc_subtotal;
    }

    public void setFrc_subtotal(double frc_subtotal) {
        this.frc_subtotal = frc_subtotal;
    }

    public double getFrc_desconto() {
        return frc_desconto;
    }

    public void setFrc_desconto(double frc_desconto) {
        this.frc_desconto = frc_desconto;
    }
}