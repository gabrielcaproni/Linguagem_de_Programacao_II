// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:49:55
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio12.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio12
{

    public static void main(String args[])
    {
        
        Scanner entrada = new Scanner(System.in);
        
        double renda, IRPF;
                
        System.out.println("Entre com a renda do contribuinte: ");
        renda = entrada.nextDouble();
        
        if(renda < 10.800){
            System.out.println("Está isento de pagamento !");
            
        }else if(renda >= 10.800 && renda <= 21.600){
            
            IRPF = renda * 0.15 - 1.620;
            System.out.printf("IRPF a ser pago pelo contribuinte: %.3f",IRPF);
            
        } else if(renda > 21.600){
        
            IRPF = renda * 0.275 - 4.320;
            System.out.printf("IRPF a ser pago pelo contribuinte: %.3f",IRPF);
            
        }
    }
}
