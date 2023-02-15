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
public class Exercicio14 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
        
    String nome, letra;
    int i, tamanho, qtd = 0;
    
        System.out.println("Entre com o nome: ");
        nome = entrada.nextLine();
        
        tamanho = nome.length();
        
        for(i = 0; i < tamanho; i ++ ){
            letra = nome.substring(i, i+1);
            if(letra.equals("a")|| letra.equals("A")){
                qtd++;
            }
        }
           
        System.out.println(" A palavra contem " + qtd + " letra(s) 'a'. ");
        
    }
}
