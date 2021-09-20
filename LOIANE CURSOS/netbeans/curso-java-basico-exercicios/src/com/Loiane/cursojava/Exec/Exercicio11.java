/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author samue
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num1= scan.nextInt();
        System.out.println("Digite outro número: ");
        int num2= scan.nextInt();
        System.out.println("E mais um número: ");
        float num3= scan.nextFloat();
        
        int prod_N= (num1*2) * (num2/2) ;
        float soma_N= (num1*3)+ num3;
        float pow_N= (float)Math.pow(num3, 3);
        
        
        System.out.println("Dobro do Primeiro vezes metade do segundo: "+ prod_N);
        System.out.println("Triplo do primeiro somado com o terceiro "+ soma_N);
        System.out.println("Terceiro Elevado ao Cubo "+ pow_N);
        
    }
}
