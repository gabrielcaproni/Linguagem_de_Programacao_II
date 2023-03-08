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
         
        Cliente objcliente = new Cliente();
        private Cliente objcliente2;
        double saldo = 0;
        private double limite;
        
        public void setCliente1(Cliente cliente1){
            this.objcliente = cliente1;
        }
        
        public void setCliente2(Cliente cliente2){
            this.objcliente2 = cliente2;
        }
        
        public double getSaldo(){
            return this.saldo;
        }
        
        public void setCliente(Cliente cliente){
            this.objcliente = cliente;
        }   
    
        public void deposita(double saldo){ // método 
            this.saldo = this.saldo + saldo;
            System.out.println("Depósito realizado para: " + objcliente.getNome());
            
        }
        
        
        public boolean saca(double saque) {
            
            if(this.saldo < saque){
            return false;
            }
            this.saldo -= saque;
            return true;
            
    }
               public boolean transfere(Conta conta, double valor){
                   
                   if(this.saldo < valor){
                       return false;
                       
                   }else{
                       
                      this.saldo -= valor;
                      conta.saldo += valor;
                      return true;
                      
                   }
                                   
               }
                
              
}
