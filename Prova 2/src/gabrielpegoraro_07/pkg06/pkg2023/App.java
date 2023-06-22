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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endereco end = new Endereco();
        end.setRua("Rua Oliveira");
        end.setNumero(20);
        end.setBairro("Bairro da serra");
        Moto moto = new Moto("Xr", "Honda", 2002, 2500, "Branca", end);
        moto.mover();
        moto.parar();
        moto.registraPlaca("yyy-1234");
        moto.dadosVeiculo();
        
        Endereco end2 = new Endereco();
        end2.setRua("Rua dos Bobos ");
        end2.setNumero(0);
        end2.setBairro("Bairro Palhaço");
        Carro carro = new Carro("Gol 1.0", "Vw", 1980, 10000, "Preto", end2);
        carro.mover();
        carro.parar();
        carro.registraPlaca("HES-4511");
        carro.dadosVeiculo();
        
        Endereco end3 = new Endereco();
        end3.setRua("Rua dos Bobos ");
        end3.setNumero(0);
        end3.setBairro("Bairro Palhaço");
        Van van = new Van("Sprinter", "Mercedez", 2018, 500000, "Prata", end3);
        carro.mover();
        carro.parar();
        carro.registraPlaca("AAA-1A11");
        carro.dadosVeiculo();
        
        Endereco end5 = new Endereco();
        end5.setRua("Rua Palmeiras ");
        end5.setNumero(40);
        end5.setBairro("Bairro dos porcos");
        Trem trem = new Trem("Xp500", "Vw", 1800, 5000000, "Preto", end5);
        trem.mover();
        trem.parar();
        trem.dadosVeiculo();
        
    }
    
    
}
