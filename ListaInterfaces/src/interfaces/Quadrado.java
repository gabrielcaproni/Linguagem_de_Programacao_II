/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Gabriel Pegoraro
 */
 public class Quadrado implements AreaCalculavel{
    private int lado;
    
    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    public double calculaArea() {
        return this.lado * this.lado;
    }
}
