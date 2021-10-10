/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio7 {
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);

            System.out.println("Digite o Primeiro Numero: ");
            int num1= scan.nextInt();
            System.out.println("Digite o Segundo Numero: ");
            int num2= scan.nextInt();
            System.out.println("Digite o Terceiro Numero: ");
            int num3= scan.nextInt();

            if( num1 >= num2 && num1 >= num3){
                        System.out.println("O maior Numero é: "+ num1+ "! O primeiro digitado.");
                    }else if( num2 >= num1 && num2 >= num3){
                        System.out.println("O maior Numero é: "+ num2+ "! O segundo digitado.");
                    }else
                        System.out.println("O Menor Número é: "+ num3 + "! O terceiro digitado.");
            if( num1 <= num2 && num1 <= num3){
                        System.out.println("O menor Numero é: "+ num1+ "! O primeiro digitado.");
                    }else if( num2 <= num1 && num2 <= num3){
                        System.out.println("O menor Numero é: "+ num2+ "! O segundo digitado.");
                    }else
                        System.out.println("O Menor Número é: "+ num3 + "! O terceiro digitado.");
    }
}
