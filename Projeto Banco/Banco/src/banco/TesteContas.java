/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TesteContas {
    public static void main(String[] args) {
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(2000.00);
        cc.deposita(2000.00);
        cp.deposita(2000.00);
        
        c.atualiza(0.15);
        cc.atualiza(0.15);
        cp.atualiza(0.15);
        
        System.out.println("Conta: " + c.getSaldo());
        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());
    }
}
