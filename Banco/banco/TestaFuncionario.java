/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class TestaFuncionario {
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Evangivaldo da Silva" );
        System.out.println(f1.getNome() );
        
        f1.setDepartamento("Contabilidade");
        System.out.println( "Departamento de Atuação: "+ f1.getDepartamento());
        
        f1.setData("12/03/2022");
        System.out.println("Data de Entrada: " + f1.getData());
        
        f1.setRG("MG 12.011.01");
        System.out.println("RG: " + f1.getRG());
        
        f1.setSalario(100);
        f1.bonifica(50);
        
        System.out.println("Salario Atual: R$ " + f1.getSalario());
        
        f1.mostra();
        
        f1.demite();
        
        f1.mostra();
       
    }
}
