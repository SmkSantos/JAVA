/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double aux=0,div=0,i = 1, j = 1;
        int max=0;
        
        System.out.println("Qual o limite?");
        max= scan.nextInt();
        //int  h=1;
            for ( ;  i < max && j < max; i++, j+=2) {

                    System.out.print(i+" / "+j);
                    div= i/j;
                    aux= aux + div;
                    System.out.printf("= %.2f\n ",div);               
            }
            

        System.out.printf("A soma total é: %.2f \n",aux);
    }
}
