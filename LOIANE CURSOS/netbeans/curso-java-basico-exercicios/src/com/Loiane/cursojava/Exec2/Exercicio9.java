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
public class Exercicio9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num1= scan.nextInt();
        System.out.println("Digite outro número: ");
        int num2= scan.nextInt();
        System.out.println("Digite mais um número: ");
        int num3= scan.nextInt();
        
        if(num1 >= num2 && num2 >= num3){
            System.out.println("1: "+num1+"\n2: "+num2+"\n3: "+num3);
        }else if (num2 >= num1 && num1 >= num3 ){
            System.out.println("1: "+num2+"\n2: "+num1+"\n3: "+num3);
        }else if (num3 >= num1 && num1>= num2){
            System.out.println("1: "+num3+"\n2: "+num1+"\n3: "+num2);
        }else
            System.out.println("1: "+num2+"\n2: "+num3+"\n3: "+num1);
        
    }
}
