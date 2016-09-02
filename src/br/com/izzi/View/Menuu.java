/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.izzi.View;

import br.com.izzi.Model.BebeModelll;
import br.com.izzi.controller.Bebe;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Menuu {

    public static void main(String[] args) {
        Bebe bebe = new Bebe();
        Scanner scan = new Scanner(System.in);
        boolean exit = true;

        while (exit) {

            System.out.println("1 - para cadastrar ");
            System.out.println("2- para listar  Bebe ");
            System.out.println("3- Para listar Mãe");
            System.out.println("4- Para listar Médico");
            System.out.println("");
            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome  do bebe");
                    String nomebebe = scan.nextLine();
                    System.out.println("Digite a data de nascimento");
                    String data_de_nascimento = scan.nextLine();
                    System.out.println("Digite o peso de nascimento");
                    Double peso_nascimento = Double.parseDouble(scan.nextLine());
                    System.out.println("Digite a altura");
                    Double altura = Double.parseDouble(scan.nextLine());
                    System.out.println("");
                    System.out.println("Digite o nome  da mãe");
                    String nome_Mae = scan.nextLine();
                    System.out.println("Digite o endereço da mãe");
                    String endereco = scan.nextLine();
                    System.out.println("Digte o telefone da mãe");
                    int telefone_Mae = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite a Data de nascimento");
                    String data_de_nascimentoMae = scan.nextLine();
                    System.out.println("");
                    System.out.println("Digite o crm");
                    int crm = Integer.parseInt(scan.nextLine());
                    System.out.println("Digte o nome do médico");
                    String nomeMedico = scan.nextLine();
                    System.out.println("Digite o telefone do médico");
                    int telefoneMedico = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite o celular do médico");
                    int celularMedico = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite a especialidade do médico");
                    String especialidadeMedico = scan.nextLine();
                    bebe.adicionar(nomebebe, data_de_nascimento, peso_nascimento, altura, nome_Mae, endereco, telefone_Mae, data_de_nascimentoMae, crm, nomeMedico, telefoneMedico, celularMedico, especialidadeMedico);
                    break;

                case "2":
                    System.out.println("-----------");
                    bebe.ListarBebe();
                    System.out.println("-----------");
                    break;

                case "3":
                    System.out.println("-----------");
                    bebe.ListarMae();
                    System.out.println("-----------");
                    break;

                case "4":
                    System.out.println("-----------");
                    bebe.ListarMedico();
                    System.out.println("-----------");
                    break;

                case "6":
                    System.out.println("-----------");
                    System.out.println("Digite o nome do Bebe que deseja remover");
                    if (bebe.excluirBebe(scan.nextLine())) {
                        System.out.println("Bebê removido com sucesso ");
                    } else {
                        System.out.println("Bebe não encontrado");
                        System.out.println("-----------");
                    }

            }
        }

    }

}
