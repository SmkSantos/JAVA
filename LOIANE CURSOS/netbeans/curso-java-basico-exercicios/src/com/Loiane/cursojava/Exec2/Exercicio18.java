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
public class Exercicio18 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite um número qualquer (inteiro)");
        int num= scan.nextInt();
        
        if( num %2 == 0 ){
            System.out.println("Número é par");
        } else{
            System.out.println("Número é impar");
        }
        
    }
}
