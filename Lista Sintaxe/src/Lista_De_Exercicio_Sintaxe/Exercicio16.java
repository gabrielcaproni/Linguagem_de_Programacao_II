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
public class Exercicio16 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String palavra;
        int tamanho, qtd = 0, i = 0;
        
        System.out.println("Entre com a palavra: ");
        palavra = entrada.nextLine();
        
        tamanho = palavra.length();
        
        while(i < palavra.length()){
            if(palavra.substring(i, i + 1).equalsIgnoreCase("a")){
                qtd++;
            }
            i++;
        }
        System.out.println("A palavra " + palavra + " possui " + qtd + " letras 'a'.");
    }
}
 