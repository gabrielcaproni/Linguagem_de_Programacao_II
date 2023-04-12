/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TesteAtualizadorDeContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
