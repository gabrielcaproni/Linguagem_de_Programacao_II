// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:48:04
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio04.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio04
{

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        double dolar, real;
        
        System.out.println("Insira o valor em dólar:");      
        dolar = entrada.nextDouble();
        real = dolar * 5.10;
        System.out.println("Conversão para reais: " + real);
    }
}
