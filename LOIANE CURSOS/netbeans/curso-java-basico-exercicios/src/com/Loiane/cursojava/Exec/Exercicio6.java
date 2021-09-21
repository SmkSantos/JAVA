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
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        double raio= scan.nextDouble();
        double area= Math.PI*(Math.pow(raio, 2));
      
        System.out.println("O valor da área do raio "+raio+" é de "+area);
       
    }
}
