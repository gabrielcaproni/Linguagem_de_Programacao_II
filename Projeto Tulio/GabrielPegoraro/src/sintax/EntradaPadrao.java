/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class EntradaPadrao {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite seu nome:");
       String nome = entrada .nextLine();
       System.out.println("Digite sua idade:");
       int idade = entrada.nextInt();
       System.out.println("Nome:" +nome);
       System.out.println("Idade:" +idade);
    }
}
