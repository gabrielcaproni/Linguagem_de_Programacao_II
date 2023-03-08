/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Porta {
    
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    public Porta(){
        this.aberta = true;
        this.cor = "Azul";
        this.dimensaoX = 0.2;
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.04;
    }
    
    public void abre(){
        this.aberta = true;
    }
    
    public void fecha(){
        this.aberta = false;
    }
    
    public void pinta(String s){
        this.cor = s;
    }
    
    public void alteraDimensoes(double X, double Y, double Z){
        this.dimensaoX = X;
        this.dimensaoY = Y;
        this.dimensaoZ = Z;
    }
    public void ImprimirPorta(){
        System.out.println("Porta: cor " + this.cor + "Dimensao X " + this.dimensaoX + "Dimensao Y "
                                         + this.dimensaoY + "Dimensao Z " + this.dimensaoZ + ", Aberta = " + this.aberta);
    }
}
