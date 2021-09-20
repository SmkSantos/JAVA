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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        double altura= scan.nextDouble();
        
        double psIdeal= ( 72.7 * altura )- 58.0;
        
        System.out.println("Seu peso ideal é de: " + psIdeal);
    }
}
