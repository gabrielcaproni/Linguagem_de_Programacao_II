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
public class Onibus extends VeiculoGrande implements Cadastro{  

    private String numeroPlaca;

    public Onibus(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        super(modelo, marca, ano, preco, cor, end);
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
      @Override
    public void registraPlaca(String numeroPlaca) {
        this.setNumeroPlaca(numeroPlaca);
        System.out.println("Placa registrada para onibus.");
    } 

    @Override
    void mover() {
        System.out.println("Onibus movendo.");
    }

    @Override
    void parar() {
        System.out.println("Onibus parado.");
    }   
    
      @Override
    public void dadosVeiculo(){
        System.out.println("*** Relatório da Onibus ***");
        super.dadosVeiculo();
        System.out.println("Placa: " + this.getNumeroPlaca());
        System.out.println("----------------------------------");
          }
}
