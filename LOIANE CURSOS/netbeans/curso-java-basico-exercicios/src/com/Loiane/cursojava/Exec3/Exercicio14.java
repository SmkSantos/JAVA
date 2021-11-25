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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int num, par=0, impar=0;
        
        for (int i = 1; i <=10; i++ ){
            System.out.println("Informe um número:");
            num= scan.nextInt();
            if (num %2 == 0 ){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Pares: "+ par +"\nÍmpares: " + impar);
    }
}
