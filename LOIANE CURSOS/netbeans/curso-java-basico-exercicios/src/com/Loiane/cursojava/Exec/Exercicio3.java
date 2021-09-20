/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio3 {
    public static void main(String[] args) {
         Scanner num= new Scanner(System.in);
        //deixar sempre aspas em branco
        int numero= num.nextInt();
        int numero2= num.nextInt();
        
        int soma= numero+numero2;
        System.out.println("A soma de ambos é: "+ soma);
    }
}
