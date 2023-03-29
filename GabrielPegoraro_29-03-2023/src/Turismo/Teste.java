/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turismo;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String onibus = null;
        
        Motorista m1 = new Motorista("Gabriel Pegoraro", "15.589.589/0001-10", 20.000);
        
        Onibus oni1 = new Onibus();
        System.out.println("Informe o modelo do onibus: ");
        oni1.setModeloOnibus(entrada.nextLine());
        
        
        
        Viagem viagem1 = new Viagem("Belo Horizonte", 3.50, 350.00);
        Cliente c1 = new Cliente("Ryan Mendes", "123.052.789-98", "212.564-25", m1, oni1, viagem1);
        
        viagem1.calcularViagem();
        c1.visualizar();
        
    }
}
