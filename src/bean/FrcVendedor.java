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
public class FrcVendedor {
    private int frc_idVendedor;
    private String frc_nome;
    private String frc_cpf;
    private String frc_telefone;
    private String frc_email;
    private Date frc_dataAddmissao;
    private double frc_salario;
    private double frc_comissao;

    public int getFrcIdVendedor() {
        return frc_idVendedor;
    }

    public void setFrcIdVendedor(int frc_idVendedor) {
        this.frc_idVendedor = frc_idVendedor;
    }

    public String getFrcNome() {
        return frc_nome;
    }

    public void setFrcNome(String frc_nome) {
        this.frc_nome = frc_nome;
    }

    public String getFrcCpf() {
        return frc_cpf;
    }

    public void setFrcCpf(String frc_cpf) {
        this.frc_cpf = frc_cpf;
    }

    public String getFrcTelefone() {
        return frc_telefone;
    }

    public void setFrcTelefone(String frc_telefone) {
        this.frc_telefone = frc_telefone;
    }

    public String getFrcEmail() {
        return frc_email;
    }

    public void setFrcEmail(String frc_email) {
        this.frc_email = frc_email;
    }

    public Date getFrcDataAddmissao() {
        return frc_dataAddmissao;
    }

    public void setFrcDataAddmissao(Date frc_dataAddmissao) {
        this.frc_dataAddmissao = frc_dataAddmissao;
    }

    public double getFrcSalario() {
        return frc_salario;
    }

    public void setFrcSalario(double frc_salario) {
        this.frc_salario = frc_salario;
    }

    public double getFrcComissao() {
        return frc_comissao;
    }

    public void setFrcComissao(double frc_comissao) {
        this.frc_comissao = frc_comissao;
    }
}
