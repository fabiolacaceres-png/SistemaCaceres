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
public class FrcClientes {
    private int frc_idClientes;
    private String frc_nome;
    private String frc_cpf;
    private Date frc_dataNacsimento;
    private String frc_email;
    private String frc_telefone;
    private String frc_cep;
    private String frc_endereco;
    private String frc_bairro;
    private String frc_cidade;
    private String frc_estado;
    private String frc_numero;
    private String frc_complemento;
    private Date frc_dataCadastro;
    private String frc_ativo;

    public int getFrcIdClientes(){
        return frc_idClientes;
    }
    public void setFrcIdClientes(int frc_idClientes){
        this.frc_idClientes = frc_idClientes;
    }
    public String getFrcNome(){
        return frc_nome;
    }
    public void setFrcNome(String frc_nome){
        this.frc_nome = frc_nome;
    }
    public String getFrcCpf(){
        return frc_cpf;
    }
    public void setFrcCpf(String frc_cpf){
        this.frc_cpf = frc_cpf;
    }
    public Date getFrcDataNacsimento(){
        return frc_dataNacsimento;
    }
    public void setFrcDataNacsimento(Date frc_dataNacsimento){
        this.frc_dataNacsimento = frc_dataNacsimento;
    }
    public String getFrcEmail(){
        return frc_email;
    }
    public void setFrcEmail(String frc_email){
        this.frc_email = frc_email;
    }
    public String getFrcTelefone(){
        return frc_telefone;
    }
    public void setFrcTelefone(String frc_telefone){
        this.frc_telefone = frc_telefone;
    }
    public String getFrcCep(){
        return frc_cep;
    }
    public void setFrcCep(String frc_cep){
        this.frc_cep = frc_cep;
    }
    public String getFrcEndereco(){
        return frc_endereco;
    }
    public void setFrcEndereco(String frc_endereco){
        this.frc_endereco = frc_endereco;
    }
    public String getFrcBairro(){
        return frc_bairro;
    }
    public void setFrcBairro(String frc_bairro){
        this.frc_bairro = frc_bairro;
    }
    public String getFrcCidade(){
        return frc_cidade;
    }
    public void setFrcCidade(String frc_cidade){
        this.frc_cidade = frc_cidade;
    }
    public String getFrcEstado(){
        return frc_estado;
    }
    public void setFrcEstado(String frc_estado){
        this.frc_estado = frc_estado;
    }
    public String getFrcNumero(){
        return frc_numero;
    }
    public void setFrcNumero(String frc_numero){
        this.frc_numero = frc_numero;
    }
    public String getFrcComplemento(){
        return frc_complemento;
    }
    public void setFrcComplemento(String frc_complemento){
        this.frc_complemento = frc_complemento;
    }
    public Date getFrcDataCadastro(){
        return frc_dataCadastro;
    }
    public void setFrcDataCadastro(Date frc_dataCadastro){
        this.frc_dataCadastro = frc_dataCadastro;
    }
    public String getFrcAtivo(){
        return frc_ativo;
    }
    public void setFrcAtivo(String frc_ativo){
        this.frc_ativo = frc_ativo;
    }
}