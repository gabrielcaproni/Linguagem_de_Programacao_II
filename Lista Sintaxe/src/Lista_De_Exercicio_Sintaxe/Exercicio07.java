

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio07
{
    
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2, n3, n4;
        double media;
        
        System.out.println("Entre com as quatro notas: ");
        
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        n4 = entrada.nextDouble();
        media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.printf("A média das notas é: %.2f \n ", media);
         
        if(media >= 0 && media <= 3.49){
            System.out.println("Reprovado !");
            
        }else if(media >= 3.5 && media <= 6.49){       
            System.out.println("Recuperação !");
            
        }else if(media > 6.5){      
            System.out.println("Aprovado !");
        }
    }
}
