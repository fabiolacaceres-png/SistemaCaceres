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
     
}
