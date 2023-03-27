/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Programa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new Conta(); //criando um objeto      
        
        minhaConta.deposita(1000);
        System.out.println("Saldo da Conta: R$ " + minhaConta.getSaldo());
        
        System.out.println("Digite um valor para depósito:  ");  
        minhaConta.deposita(entrada.nextDouble());
        System.out.println("Saldo da Conta: R$ " + minhaConta.getSaldo());
        
        System.out.println("Insira um valor para saque: ");
        Boolean saque = minhaConta.saca(entrada.nextDouble());
        
       if(saque) {
            System.out.println("Saldo na conta: R$" + minhaConta.getSaldo());
        }else {
            System.out.println("Valor de saque maior que o de saldo na conta. Saque nao efetuado.");
        }
       
                Conta outraConta = new Conta();
                
        System.out.println("Informe um valor para transferir: ");
        boolean transfere = minhaConta.transfere(outraConta, entrada.nextDouble());
        
        if(transfere){
            
            System.out.println("Tranferencia realizada com sucesso !");
            System.out.println("Saldo da conta debitada: R$ " + minhaConta.getSaldo());
            System.out.println("Saldo da conta creditada: R$ " + outraConta.getSaldo());
            
        }else{
            System.out.println("Nao foi possivel realizar a transferencia, pois o saldo e insuficiente !");
        }
    }
}
