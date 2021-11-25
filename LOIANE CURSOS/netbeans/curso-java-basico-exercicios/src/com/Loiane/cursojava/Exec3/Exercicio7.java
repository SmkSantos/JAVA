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
public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        int num,cont=1, maior=0;
        
        while(cont <=5){
            

            
            System.out.println("Digite um número: ");
            num= scan.nextInt();
            
            if (num > maior) {
                maior =  num;
            }
            
            System.out.println(cont+ "- Numero Digitado: " + num);
            cont++;
        }
        
        System.out.println("O numero maior é " + maior);
        
    }
}
