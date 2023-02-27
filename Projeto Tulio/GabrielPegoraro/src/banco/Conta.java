/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Conta {
         
        Cliente objcliente;
        double saldo = 0;
        double limite;
    
        public void deposita(double saldo){ // método 
            this.saldo = this.saldo + saldo;
            System.out.println("Depósito efetuado com sucesso !");
            
        }
        
        
        public boolean saca(double saldo) {
            
            if(this.saldo >= saldo){
            this.saldo = this.saldo - saldo;
            
            System.out.println("Saque efetuado com sucesso !");
            return true;
            
            }else{
                System.out.println("Saldo Insuficiente para saque !");
                return false;
            }
            
    }
               public boolean transfere(Conta conta, double valor){
                   
                   if(this.saldo < valor){
                       return false;
                       
                   }else{
                       
                      this.saca(valor);
                      conta.deposita(valor);
                      return true;
                   }
                                   
               }
                
              
}
