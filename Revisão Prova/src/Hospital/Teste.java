/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Paciente paciente = new Paciente();
        Paciente paciente2 = new Paciente();
        Medico medico = new Medico();
        Medico medico2 = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        Enfermeiro enfermeiro2 = new Enfermeiro();
        List<Internacao> listaInternacao = new ArrayList<>();
        
        System.out.println("Entre com o nome do paciente 1: ");
        paciente.setNome(entrada.nextLine());
        System.out.println("Entre com o nome do paciente 2: ");
        paciente2.setNome(entrada.next());
        System.out.println("Entre com o nome do medico 1: ");
        medico.setNome(entrada.next());
        System.out.println("Entre com o nome do médico 2: ");
        medico2.setNome(entrada.next());
        System.out.println("Entre com o nome do enfermeiro 1: ");
        enfermeiro.setNome(entrada.next());
        System.out.println("Entre com o nome do enfermeiro 2: ");
        enfermeiro2.setNome(entrada.next());
         System.out.println("");
         
        Internacao internacao = new Internacao(paciente, enfermeiro, medico, "Perna", 1, 200);
        Internacao internacao2 = new Internacao(paciente2, enfermeiro, medico2 , "Ombro", 5, 150);
        Internacao internacao3 = new Internacao(paciente, enfermeiro2, medico ,"Cabeça", 4, 50);
        Internacao internacao4 = new Internacao(paciente2, enfermeiro, medico2,"Olhos", 7, 200);
        Internacao internacao5 = new Internacao(paciente, enfermeiro, medico, "Mão", 8, 100);
        Internacao internacao6 = new Internacao(paciente2, enfermeiro, medico2, "Dente", 2, 50);
        
        
        System.out.println("Insira o motivo da internação: ");
        internacao.setMotivo(entrada.next());
        System.out.println("Insira o custo por dia: ");
        internacao.setValorDia(entrada.nextDouble());
        System.out.println("Insira a quantidade de dias: ");
        internacao.setDias(entrada.nextInt());
        listaInternacao.add(internacao);
        listaInternacao.add(internacao2);
        listaInternacao.add(internacao3);
        listaInternacao.add(internacao4);
        listaInternacao.add(internacao5);
        listaInternacao.add(internacao6);
        
        Internacao.internacaoPaciente(paciente, listaInternacao);
        
        Internacao.relatorioInternacao(listaInternacao);
    }
    
}
