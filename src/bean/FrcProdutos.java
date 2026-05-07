/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author FABÍOLA CÁCERES
 */
public class FrcProdutos {
    private int frc_idProdutos;
    private String frc_nome;
    private String frc_marca;
    private String frc_categoria;
    private String frc_cor;
    private double frc_preco;
    private String frc_textura;

    public int getFrcIdProdutos(){
        return frc_idProdutos;
    }
    public void setFrcIdProdutos(int frc_idProdutos){
        this.frc_idProdutos = frc_idProdutos;
    }

    public String getFrcNome(){
        return frc_nome;
    }
    public void setFrcNome(String frc_nome){
        this.frc_nome = frc_nome;
    }

    public String getFrcMarca(){
        return frc_marca;
    }
    public void setFrcMarca(String frc_marca){
        this.frc_marca = frc_marca;
    }

    public String getFrcCategoria(){
        return frc_categoria;
    }
    public void setFrcCategoria(String frc_categoria){
        this.frc_categoria = frc_categoria;
    }

    public String getFrcCor(){
        return frc_cor;
    }
    public void setFrcCor(String frc_cor){
        this.frc_cor = frc_cor;
    }

    public double getFrcPreco(){
        return frc_preco;
    }
    public void setFrcPreco(double frc_preco){
        this.frc_preco = frc_preco;
    }

    public String getFrcTextura(){
        return frc_textura;
    }
    public void setFrcTextura(String frc_textura){
        this.frc_textura = frc_textura;
    }
}
