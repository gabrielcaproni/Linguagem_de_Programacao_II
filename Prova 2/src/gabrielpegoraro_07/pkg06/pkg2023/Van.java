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
public class Van extends VeiculoPequeno{

    public Van(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        super(modelo, marca, ano, preco, cor, end);
    }
    
     @Override
    public void registraPlaca(String numeroPlaca) {
        this.setNumeroPlaca(numeroPlaca);
        System.out.println("Placa registrada para van.");
    }

    @Override
    void mover() {
        System.out.println("Van movendo.");
    }

    @Override
    void parar() {
        System.out.println("Van parada.");
    }
    
      @Override
    public void dadosVeiculo(){
        System.out.println("*** Relatório da Van ***");
        super.dadosVeiculo();
        System.out.println("Placa: " + this.getNumeroPlaca());
        System.out.println("----------------------------------");
          }
    
}
