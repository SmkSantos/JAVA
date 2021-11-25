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
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num=0, divisao,cont=0;
        boolean valida= false;
        String opcao;
        
        System.out.println("Digite um número:");
        num= scan.nextInt();        
        
        for (int i = 1; i < 10; i++) {
            
            divisao= num % i;
            //System.out.println(" "+divisao+" "+num+" "+i);
            
            if (divisao == 0) {
                
                cont++;
            }
            
        }
         if(cont == 2){
                    System.out.println("É primo");
                }else{
                    System.out.println("Não é primo");
                }
        
    }
}
/*do {
            System.out.println("Digite um número:");
            num= scan.nextInt();
            
            if(num % 1 ==0 && num % num == 0){
                System.out.println("É primo!");
            }else{  
                System.out.println("Não é primo!");
            }
            
            System.out.println("Quer Continuar?");
            opcao= scan.next();
            
            if (opcao.length()== 1 && opcao.equalsIgnoreCase("s")) {
                System.out.println("Ok.");
            }else{
                valida= true;
            }
        } while (!valida);*/