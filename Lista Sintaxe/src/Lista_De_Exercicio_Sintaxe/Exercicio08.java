// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:49:17
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio08.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio08
{

    public static void main(String args[])
    {
        
        Scanner entrada = new Scanner(System.in);
        
        double HP, LP, HA, LA;
        int numAzulHorizontais, numAzulVeticais, totalAzulejos;
        
        System.out.println("Entre com as medidas da parede: ");
        HP = entrada.nextDouble();
        LP = entrada.nextDouble();
        
        System.out.println("Agora entre com as medidas do azulejo: ");
        HA = entrada.nextDouble();
        LA = entrada.nextDouble();
        
        numAzulHorizontais = (int)Math.ceil(LP / LA);
        numAzulVeticais = (int)Math.ceil(HP / HA);
        totalAzulejos = numAzulHorizontais * numAzulVeticais;
        
        System.out.println("O total de azulejos necessários: "+ totalAzulejos);
    }
}
