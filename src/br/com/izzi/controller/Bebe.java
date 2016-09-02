/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.izzi.controller;

import java.util.ArrayList;
import java.util.List;
import br.com.izzi.Model.BebeModelll;
import br.com.izzi.Model.MaeModelll;
import br.com.izzi.Model.MedicoModelll;

/**
 *
 * @author Aluno
 */
public class Bebe {

    List<BebeModelll> bebezinho = new ArrayList<BebeModelll>();

    public void adicionar(String nomeBebe, String data_de_nascimento, Double peso_nascimento, Double altura, String nome_Mae, String endreco_Mae, int telefone_Mae,
            String data_de_nascimentoMae,int crm, String nomeMedico, int telefoneMedico, int  celularMedico, String especialidadeMedico) {

        BebeModelll bebezim = new BebeModelll();
        MaeModelll maezinha = new MaeModelll();
        MedicoModelll medicu = new MedicoModelll();

        maezinha.setNome_Mae(nome_Mae);
        maezinha.setData_de_nascimentoMae(data_de_nascimentoMae);
        maezinha.setEndreco_Mae(endreco_Mae);
        maezinha.setTelefone_Mae(telefone_Mae);
        bebezim.setMae(maezinha);

        medicu.setNomeMedico(nomeMedico);
        medicu.setEspecialidadeMedico(especialidadeMedico);
        medicu.setCrm(crm);
        medicu.setTelefoneMedico(telefoneMedico);
        medicu.setCelularMedico(celularMedico);
        bebezim.setMedico(medicu);

        bebezim.setAltura(altura);
        bebezim.setData_de_nascimento(data_de_nascimento);
        bebezim.setNomebebe(nomeBebe);
        bebezim.setPeso_nascimento(peso_nascimento);
        bebezinho.add(bebezim);
    }
    public void ListarMae(){
     for (BebeModelll maee : bebezinho){        
        System.out.println("Nome Mãe " +maee.getMae().getNome_Mae());
         System.out.println("Endereço Mãe" +maee.getMae().getEndreco_Mae());
         System.out.println("Telefone Mãe "+ maee.getMae().getTelefone_Mae());
         System.out.println("Data de nascimento Mãe " +maee.getMae().getData_de_nascimentoMae());
    }
    }
    public void ListarMedico(){
        for (BebeModelll medicooo : bebezinho) {
            System.out.println("Nome "+ medicooo.getMedico().getNomeMedico());
            System.out.println("Celular do Medico "+ medicooo.getMedico().getCelularMedico());
            System.out.println("CRM "+ medicooo.getMedico().getCrm());
            System.out.println("Especialidade do Médico " + medicooo.getMedico().getEspecialidadeMedico());
            System.out.println("Telefone Médico" + medicooo.getMedico().getTelefoneMedico());
        }
    }
    
    public void ListarBebe(){
        for (BebeModelll bebezinho1 : bebezinho) {
            System.out.println("Nome"+ bebezinho1.getNomebebe());
            System.out.println("Data de nascimento"+ bebezinho1.getData_de_nascimento());
            System.out.println("Altura Bebe"+ bebezinho1.getAltura());
            System.out.println("Peso de nascimento" + bebezinho1.getPeso_nascimento());
        }
    }
    public boolean excluirBebe(String nome){
        boolean ok = false;
        for (BebeModelll bebeModelll : bebezinho) {
            if(nome.equalsIgnoreCase(bebeModelll.getNomebebe())){
                bebezinho.remove(nome);
                ok = true;
                break;
            }
        }return ok;
    } 
}
