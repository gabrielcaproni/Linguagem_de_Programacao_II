/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TestePorta {
    public static void main(String[] args) {
        Porta porta = new Porta("Vermelho", 120, 250, 50);
        
        porta.fecha();
        porta.abre();
        porta.fecha();
        
        porta.getCor();
        porta.setCor("Vermelho");
        porta.getCor();
        porta.setCor("Azul");
        
        System.out.println("Dimensao X: " + porta.getDimensaoX());
        porta.setDimensaoX(300);
        System.out.println("Dimensao Y: " + porta.getDimensaoY());
        porta.setDimensaoY(2.00);
        System.out.println("Dimensao Z: " + porta.getDimensaoZ());
        porta.setDimensaoZ(0.25);
        
        porta.estaAberta();
    }
}
