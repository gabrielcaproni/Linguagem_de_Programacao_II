// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:49:28
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio09.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio09
{

    public static void main(String args[])
    {
        
        Scanner entrada = new Scanner(System.in);
        
        double areaTotal, areaConstruida;
        double valorNaoConstruido, valorConstruido, valorTotal;
        
        System.out.println("Entre com a área total do terreno (m2): ");
        areaTotal = entrada.nextDouble();
        System.out.println("Entre com a área construida (m2): ");
        
        areaConstruida = entrada.nextDouble();
        valorNaoConstruido = areaTotal * 3.8;
        valorConstruido = areaConstruida * 5;
        
        valorTotal = valorNaoConstruido + valorConstruido;
        System.out.printf("O valor total do terreno é: R$%.2f \n", valorTotal);
         
    }
}
