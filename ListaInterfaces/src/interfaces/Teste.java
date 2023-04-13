/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Teste {
    
    public static void main(String[] args) {
        
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
        
        AreaCalculavel b = new Circulo(10);
        System.out.println(b.calculaArea());
    }
    
}
