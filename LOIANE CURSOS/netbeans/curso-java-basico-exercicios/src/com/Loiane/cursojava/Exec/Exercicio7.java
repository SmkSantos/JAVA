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
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Qual a base? ");
        int base= scan.nextInt();
        System.out.println("Qual a altura? ");
        int altura= scan.nextInt();
        
        int quad= base*altura;
        System.out.println("Base: "+base+"\n\rAltura: "+altura+"\n\rArea do quadrado: "+quad);
        System.out.println("\n\rO dobro da base de seu quadrado é de: " +quad*2);
    }
}
