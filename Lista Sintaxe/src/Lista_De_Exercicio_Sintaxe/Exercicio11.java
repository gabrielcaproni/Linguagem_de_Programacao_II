// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:49:50
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio11.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio11
{

    public static void main(String args[])
    {
        
        Scanner entrada = new Scanner(System.in);
  
        double qtdKm , custoFixo, custoKM, custoTotal;
        
        System.out.println("Informe a quantidade de dias o usuario ficou com o carro: ");
        double dias = entrada.nextDouble();
        
        System.out.println("Informe a quilometragem rodada: ");
        qtdKm = entrada.nextDouble();
        
        custoFixo = dias * 45;
        custoKM = (qtdKm - dias * 60) * 0.5;
        custoTotal = custoFixo + custoKM;
        
        System.out.println("A quantidade a ser paga \351: R$" + custoTotal);
    }
}
