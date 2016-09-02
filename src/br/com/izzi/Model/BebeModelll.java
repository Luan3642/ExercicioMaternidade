/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.izzi.Model;

/**
 *
 * @author Aluno
 */
public class BebeModelll {

    private String nomebebe;
    private String data_de_nascimento;
    private double peso_nascimento;
    private double altura;
    private MaeModelll mae;
    private MedicoModelll medico;

    public String getNomebebe() {
        return nomebebe;
    }

    public void setNomebebe(String nomebebe) {
        this.nomebebe = nomebebe;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public double getPeso_nascimento() {
        return peso_nascimento;
    }

    public void setPeso_nascimento(double peso_nascimento) {
        this.peso_nascimento = peso_nascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public MaeModelll getMae() {
        return mae;
    }

    public void setMae(MaeModelll mae) {
        this.mae = mae;
    }

    public MedicoModelll getMedico() {
        return medico;
    }

    public void setMedico(MedicoModelll medico) {
        this.medico = medico;
    }

}
