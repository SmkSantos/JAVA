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
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int numero,div =0,cont=0;
                System.out.println("Digite um número");
        numero=scan.nextInt();
        
                for (int i = 1; i <= 10; i++) {
                div= numero%i;
                if (div==0) {
                    cont++;
                    }
                }
                if (cont > 2) {
                    System.out.println("Não Primo");
                }else if (numero==1) {
                    System.out.println("Esse número só é divisível por ele mesmo");
                }  else {
                    System.out.println("Primo");
                }
        

    }
}