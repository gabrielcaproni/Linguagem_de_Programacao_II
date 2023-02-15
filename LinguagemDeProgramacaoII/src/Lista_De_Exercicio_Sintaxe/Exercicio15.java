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
public class Exercicio15 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String numero, teste = "";
        int i, tamanho;
        
        System.out.println("Entre com o numero: ");
        numero = entrada.nextLine();
        tamanho = numero.length();
        
        for(i = 0; i < tamanho; i++){
            teste = teste + numero.charAt(i);
            
        }if(teste.equals(numero)){
            System.out.println("O numero e uma capicua !");
        }else{
            System.out.println("O numero nao e uma capicua !");
        }
        
    }
}
