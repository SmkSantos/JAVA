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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Qual o Preço da Banana? ");
        double preco1= scan.nextDouble();
        System.out.println("Qual o Preço da Uva? ");
        double preco2= scan.nextDouble();
        System.out.println("Qual o Preço da Laranja? ");
        double preco3= scan.nextDouble();
    
        if(preco1 < preco2 && preco1 < preco3){
            System.out.println("Compre a Banana, mais barato.");
        } else if(preco2 < preco1 && preco2 < preco3){
            System.out.println("Compre a Uva, mais barato.");
        } else 
            System.out.println("Compre a Laranja, mais barato");
    }
    
}
