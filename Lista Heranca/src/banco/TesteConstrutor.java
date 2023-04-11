/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TesteConstrutor {
    public static void main(String[] args) {
        
        Conta x = new Conta();
        
        Conta y = new Conta(6000, 3398);
        System.out.println("Saldo conta Y = " + y.getSaldo());
        System.out.println("Número conta Y = " + y.getNumero());
        
        Conta z = new Conta(10000, 3399);
        System.out.println("Saldo conta Z = " + z.getSaldo());
        System.out.println("Número conta Z = " + z.getNumero());
        
        System.out.println("Número total de contas = " + Conta.getTotalDeContas());
    }
}
