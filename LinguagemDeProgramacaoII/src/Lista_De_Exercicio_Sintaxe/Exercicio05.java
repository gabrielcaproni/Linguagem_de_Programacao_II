// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 14/02/2023 07:48:54
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Exercicio05.java

package Lista_De_Exercicio_Sintaxe;

import java.util.Scanner;

public class Exercicio05
{

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
       
        double peso, altura, imc;
        String gender;
         
        System.out.println("Peso:");
        peso = entrada.nextDouble();
        
        System.out.println("Altura:");
        altura = entrada.nextDouble();
        
        System.out.println("Você é (M)ulher ou (H)omem ?: ");
        gender = entrada.next();
        
        imc = peso / (altura * altura);
        System.out.println("Seu IMC é: ");
        
        if(gender.equals("M"))
            if(imc < 19.1)
                System.out.println("Você está abaixo do peso !");
            else
            if(imc >= 19.1 && imc <= 25.8)
                System.out.println("Seu peso esta ideal !");
            else
                System.out.println("Você está acima do peso !");
        if(gender.equals("H"))
            if(imc < 20.7)
                System.out.println("Você está abaixo do peso !");
            else
            if(imc >= 20.7 && imc <= 26.4)
                System.out.println("Seu peso está ideal !");
            else
                System.out.println("Você está acima do peso !");
    }
}
