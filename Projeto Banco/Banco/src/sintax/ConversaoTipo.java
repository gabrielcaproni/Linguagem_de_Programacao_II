/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax;

/**
 *
 * @author Gabriel Pegoraro
 */
public class ConversaoTipo {
    public static void main(String[] args) {
        String nome = "Gabriel Caproni Pegoraro"; //entrada usuário 
        String idade = "19";
        String salario = "5000";
        
        int idade2 = Integer.parseInt(idade);
        idade2 = idade2 +1;
        double salario2 = Double.parseDouble(salario);
        System.out.println("Idade convertida:" +idade2);
        System.out.println("Salário convertido:" +salario2);
    }
}
