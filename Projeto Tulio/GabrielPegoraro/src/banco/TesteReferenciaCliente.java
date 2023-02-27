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
        Conta cl = new Conta();
        Cliente clil = new Cliente();
        cl.objcliente = clil;
        cl.objcliente.nome = "Paola Dias";
        System.out.println("Nome: " + cl.objcliente.nome);
                
    }
}
