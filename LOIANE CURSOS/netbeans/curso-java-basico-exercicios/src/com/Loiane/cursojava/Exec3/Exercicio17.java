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
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num=0, aux=0, valor=0, valor1=1;
        boolean a=false;
        System.out.println("Digite um número");
        num= scan.nextInt();
        System.out.println("!"+num);
        aux= num--;
        do {
            
            valor= num * aux;
            System.out.print(aux+" "+num+" ");
            valor1= valor * valor1;
            aux -= 2;
            num -= 2;        
            if(aux <= 0 && num <=0){
                System.out.println("="+valor1);                
                a=true;   
            }
            
        } while (!a);
        
    }
}
