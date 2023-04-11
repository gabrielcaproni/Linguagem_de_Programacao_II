/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TesteGerente {
    public static void main(String[] args) {
        
        Funcionario objFuncionario = new Gerente();
        
        objFuncionario.setSalario(5000);
        System.out.println("Bonificação Funcionário: " + objFuncionario.getBonifica());
        
        Gerente objGer = new Gerente();
        objGer.setSalario(5000);
        System.out.println("Bonificação Gerente: " + objGer.getBonifica());
        
        objGer.setNome("José");
        objGer.setSenha(123456789);
        objGer.autentica(1234);
        objGer.autentica(123456789);
        objGer.mostra();
    }
}
