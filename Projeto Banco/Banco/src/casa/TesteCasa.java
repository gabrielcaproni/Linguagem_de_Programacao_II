/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TesteCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        
        casa.pinta("Azul");
        
        Porta porta1 = new Porta("Azul", 120, 250, 80);
        Porta porta2 = new Porta("Verde", 300, 200, 80);
        Porta porta3 = new Porta("Vermelha", 150, 80, 30);
        
        casa.setPorta1(porta1);
        casa.setPorta2(porta2);
        casa.setPorta3(porta3);
        
        casa.getPorta1().abre();
        casa.getPorta2().fecha();
        casa.getPorta3().abre();
        
        System.out.println("Cor da casa: " + casa.getCor());
        System.out.println("Qtd de portas abertas: " + casa.quantidadePortasAbertas());
    }
}
