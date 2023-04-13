/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Circulo implements AreaCalculavel{
    private double diametro;
    private double raio;
    
    public Circulo(double diametro){
        this.diametro = diametro;
    }
    
    @Override
    public double calculaArea() {
        return this.raio = diametro /2;
    }
    
}
