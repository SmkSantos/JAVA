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
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int cont=0,rest=0,num_fim, num_ini;
        
        System.out.println("Digite um número final, para que identifiquemos os primos até ele.");
        num_ini= scan.nextInt();
        System.out.println("Digite um número final, para que identifiquemos os primos até ele.");
        num_fim= scan.nextInt();
        
        for (int i = num_ini; i <= num_fim; i++) {
            
            for (int j = num_ini; j <= num_fim; j++) {
                
                rest= i%j;
                if (rest == 0 ) {
                    cont ++;
                }     
            }
                        
            if( cont <= 2){
                System.out.println(i+ "= Primos");
            }
            cont=0;
         /*   if (rest) {
                System.out.println(i+" não é primo");
            }*/
            
        }
        
    }
}
