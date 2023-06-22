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
public class Trem extends VeiculoGrande{

    public Trem(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        super(modelo, marca, ano, preco, cor, end);
    }

    @Override
    void mover() {
        System.out.println("Trem movendo.");
    }

    @Override
    void parar() {
        System.out.println("Trem parado.");
    }
    
    @Override
    public void dadosVeiculo(){
        System.out.println("*** Relatório do Trem ***");
        super.dadosVeiculo();
        System.out.println("----------------------------------");
          }
    
}
