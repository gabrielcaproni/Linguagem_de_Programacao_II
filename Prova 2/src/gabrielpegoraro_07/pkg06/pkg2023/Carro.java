/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielpegoraro_07.pkg06.pkg2023;

/**
 *
 * @author 12303449693
 */
public class Carro extends VeiculoPequeno{

    public Carro(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        super(modelo, marca, ano, preco, cor, end);
    }
    
     @Override
    public void registraPlaca(String numeroPlaca) {
        this.setNumeroPlaca(numeroPlaca);
        System.out.println("Placa registrada para carro.");
    }

    @Override
    void mover() {
        System.out.println("Carro em movimento.");
    }

    @Override
    void parar() {
        System.out.println("Carro parado.");
    }
    
      @Override
    public void dadosVeiculo(){
        System.out.println("*** Relatório do Carro ***");
        super.dadosVeiculo();
        System.out.println("Placa: " + this.getNumeroPlaca());
        System.out.println("----------------------------------");
          }

   
    
}
