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
public class Caminhao extends VeiculoGrande implements Cadastro{

    private String numeroPlaca;

    public Caminhao(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        super(modelo, marca, ano, preco, cor, end);
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
    @Override
    void mover() {
        System.out.println("Caminhao movendo.");
    }

    @Override
    void parar() {
        System.out.println("Caminhao parado.");
    }
    
    @Override
    public void registraPlaca(String numeroPlaca) {
        this.setNumeroPlaca(numeroPlaca);
        System.out.println("Placa registrada para caminhao.");
    } 
    
      @Override
    public void dadosVeiculo(){
        System.out.println("*** Relatório da Caminhao ***");
        super.dadosVeiculo();
        System.out.println("Placa: " + this.getNumeroPlaca());
        System.out.println("----------------------------------");
          }
}
