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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num1= scan.nextInt();
        System.out.println("Digite outro número: ");
        int num2= scan.nextInt();
    
        if (num1 > num2){
            System.out.println("Numero Maior "+ num1);
        }else
            System.out.println("Numero Maior "+ num2);
    }
}
