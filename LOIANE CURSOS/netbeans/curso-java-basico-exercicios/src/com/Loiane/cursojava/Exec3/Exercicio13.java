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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1,num2,pot;
        
        System.out.println("Informe um número");
        num1=scan.nextInt();
        System.out.println("Informe um número (para a potência)");
        num2=scan.nextInt();
        
        pot=num1;
        
        System.out.println(num1+" ^ "+num2);        
        
        for (int i = 1; i <= num2; i++) {
            pot *= num1;
        }
        
        System.out.println("É igual a: "+pot);
    }
}
