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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int  num, tabuada;
        
        System.out.println("Digite o valor para saber sua tabuada:");
        num= scan.nextInt();
        System.out.println("Tabuada do "+ num);
        for (int i = 0;i<=10;i++) {
            
            tabuada= num * i;
            System.out.println(num +" * "+ i + " = "+tabuada);
        }
    }
}
