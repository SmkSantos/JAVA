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
public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num= scan.nextInt();
        
        if (num < 0 ) {
            System.out.println("O Numero "+ num + " é negativo");            
        } else{
            System.out.println("O Numero "+ num + " é positivo");
        }
    }
}
