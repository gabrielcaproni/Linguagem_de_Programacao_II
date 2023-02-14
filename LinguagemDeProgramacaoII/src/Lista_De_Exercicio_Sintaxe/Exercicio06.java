// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:49:01
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio06.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio06
{

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        double comprimento, largura, area, perimetro;
        System.out.println("Informe o comprimento do retângulo: ");
        comprimento = entrada.nextDouble();
        
        System.out.println("Informe a largura do retângulo: ");
        largura = entrada.nextDouble();
        
        area = comprimento * largura;
        System.out.println("A área do retângulo é: " + area);
        
        perimetro = (2 * comprimento) + (2 * largura);
        System.out.println("O perimetro do retângulo é: " + perimetro);
    }
}
