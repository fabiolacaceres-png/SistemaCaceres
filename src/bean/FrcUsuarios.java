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
public class FrcUsuarios {
    private int frc_idusuarios;
    private String frc_nome;
    private String frc_apelido;
    private String frc_cpf;
    private Date frc_dataNascimento;
    private int frc_nivel;
    private String frc_senha;
    private String frc_ativo;

    public int getFrcIdUsuarios(){
        return frc_idusuarios;
    }
    public void setFrcIdusuarios(int frc_idusuarios){
        this.frc_idusuarios = frc_idusuarios;
    }

    public String getFrcNome(){
        return frc_nome;
    }
    public void setFrcNome(String frc_nome){
        this.frc_nome = frc_nome;
    }

    public String getFrcApelido(){
        return frc_apelido;
    }
    public void setFrcApelido(String frc_apelido){
        this.frc_apelido = frc_apelido;
    }

    public String getFrcCpf(){
        return frc_cpf;
    }
    public void setFrcCpf(String frc_cpf){
        this.frc_cpf = frc_cpf;
    }

    public Date getFrcDataNacsimento(){
        return frc_dataNascimento;
    }
    public void setFrcDataNacsimento(Date frc_dataNacsimento){
        this.frc_dataNascimento = frc_dataNacsimento;
    }

    public int getFrcNivel(){
        return frc_nivel;
    }
    public void setFrcNivel(int frc_nivel){
        this.frc_nivel = frc_nivel;
    }

    public String getFrcSenha(){
        return frc_senha;
    }
    public void setFrcSenha(String frc_senha){
        this.frc_senha = frc_senha;
    }

    public String getFrcAtivo(){
        return frc_ativo;
    }
    public void setFrcAtivo(String frc_ativo){
        this.frc_ativo = frc_ativo;
    }
}