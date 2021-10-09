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

            if(num1 > num2 && num3 < num2){
            System.out.println("Numero Maior: " +num1+ " e menor: "+ num3);
            } else if(num2 > num1 && num3 < num1){
                System.out.println("Numero Maior: " +num2+ " e menor: "+ num3);
            } else if(num3 > num2  && num2 < num1){
                System.out.println("MAIOR: "+ num3+" menor: "+ num2);
            }else{
                System.out.println("MAIOR:" + num3+ " menor: "+ num1);
            }
    }
}
