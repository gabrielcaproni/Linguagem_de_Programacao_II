/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trasporto;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Teste {
    public static void main(String[] args) {
        Carreta c1 = new Carreta("cavalo trucado");
        Caminhoneiro cam1 = new Caminhoneiro("Luiz Henrique", "15.589.589/0001-11", "159.256.487-00", 2.000);
        Viagem v1 = new Viagem("Belo Horizonte", 3.50, 350.00);
        Cliente cli1 = new Cliente("Gabriel Caproni Pegoraro", cam1, v1, c1);
        
        v1.calcularViagem();
        cli1.visualizarViagem();
        
        
    }
    
}
