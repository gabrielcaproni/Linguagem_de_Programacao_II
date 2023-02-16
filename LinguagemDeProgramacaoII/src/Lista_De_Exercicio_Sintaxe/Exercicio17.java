/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int i;
        int numero;
        String letra;
        
        System.out.println("Entre com um numero: ");
        numero = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Entre com a letra a ser repetida: ");
        letra = entrada.nextLine();
        
        for(i = 0; i < numero; i++){
            System.out.println(letra);
        }
    }
}
