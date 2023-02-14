// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:50:02
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio13.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio13
{

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        double precoPorPessoa = 0 ;
        int qtdPessoas, qtdDias;
        
        System.out.println("Informe a quantidade de pessoas: ");
        qtdPessoas = entrada.nextInt();
        
        System.out.println("Informe a quantidade de dias: ");
        qtdDias = entrada.nextInt();
        
        if(qtdPessoas <= 4)
            precoPorPessoa = 160;
        else
        if(qtdPessoas >= 5 && qtdPessoas <= 8)
            precoPorPessoa = 120;
        else
        if(qtdPessoas > 8)
            precoPorPessoa = 80;
        
        double valorTotal = precoPorPessoa * qtdPessoas * qtdDias;
        System.out.println("O valor a ser pago pelo grupo é: R$" + valorTotal);
    }
}
