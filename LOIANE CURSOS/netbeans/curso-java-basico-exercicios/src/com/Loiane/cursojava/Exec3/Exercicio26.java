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
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int num, aux=1;
        
        System.out.println("Fatorização");
        System.out.println("Digite o numero:");
        num= scan.nextInt();
        System.out.print(num+"!= ");
        for (int i = num; i >= 1 ; i--) {
            
            aux= (num--) * aux;
            if (i > 1) {
                System.out.print(i+".");
            }else{
                System.out.print(i+"=");
            }
        }
        System.out.println(" "+aux);
    }
}
