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
public class Moto extends VeiculoPequeno{

    public Moto(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        super(modelo, marca, ano, preco, cor, end);
    }

    @Override
    void mover() {
        System.out.println("Moto movendo.");
    }

    @Override
    void parar() {
        System.out.println("Moto parada.");
    }

    @Override
    public void registraPlaca(String numeroPlaca) {
        this.setNumeroPlaca(numeroPlaca);
        System.out.println("Placa registrada para moto.");
    }
    
    @Override
    public void dadosVeiculo(){
        System.out.println("*** Relatório da moto ***");
        super.dadosVeiculo();
        System.out.println("Placa: " + this.getNumeroPlaca());
        System.out.println("----------------------------------");
          }

    
}
