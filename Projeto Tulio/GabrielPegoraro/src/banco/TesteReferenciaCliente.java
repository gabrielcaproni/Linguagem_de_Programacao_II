/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TesteReferenciaCliente {
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Cliente cli = new Cliente();
        c1.setCliente(cli);
        
        cli.setNome("Gabriel Caproni Pegoraro");
        c1.deposita(100000);
        
        System.out.println(c1.getSaldo());
                
    }
}
