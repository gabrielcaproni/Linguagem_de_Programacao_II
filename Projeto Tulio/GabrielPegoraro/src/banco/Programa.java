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
        
        minhaConta.cliente = "Gabriel Caproni Pegoraro";
        System.out.println(minhaConta); 
        
        System.out.println("Digite um valor para depósito: ");
        minhaConta.deposita(entrada.nextDouble());
        System.out.println("Saldo minha conta: " + minhaConta.saldo);
       
        System.out.println("Digite um valor para saque: ");  
        minhaConta.saca(entrada.nextDouble());
        
        System.out.println("Nome do cliente: " + minhaConta.cliente);
        System.out.println("Saldo após saque: " + minhaConta.saldo);
        
        Conta outraConta = new Conta(); //criando um objeto
                
        System.out.println(outraConta);
        System.out.println("Informe um valor para transferir: ");
        boolean transfere = minhaConta.transfere(outraConta, entrada.nextDouble());
        
        if(transfere){
            
            System.out.println("Tranferencia realizada com sucesso !");
            System.out.println("Saldo da conta debitada: R$ " + minhaConta.saldo);
            System.out.println("Saldo da conta creditada: R$ " + outraConta.saldo);
            
        }else{
            System.out.println("Nao foi possivel realizar a transferencia, pois o saldo e insuficiente !");
        }
    }
}
