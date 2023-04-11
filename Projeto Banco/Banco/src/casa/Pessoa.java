/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author Gabriel Caproni Pegoraro
 */
public class Pessoa {
    
     private final String nome;
     private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
     
    public void fazAniversario(){
        this.idade++;
    } 
    
    public void imprimirNomeIdade(){
        System.out.println("Nome: " + this.nome + ", idade: " + this.idade);
    }
}
