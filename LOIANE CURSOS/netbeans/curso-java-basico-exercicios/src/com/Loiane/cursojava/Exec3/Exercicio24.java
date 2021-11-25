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
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vl_pao= 0.18, qtd_pao,aux=0;
        
        System.out.printf("Preço do Pão: R$ %.2f",vl_pao);
        System.out.println("\nPanificadora Pão de Ontem");
        
        System.out.println("\nQuantos pãos você quer comprar?");
        qtd_pao= scan.nextDouble();
        
        for (int i = 1; i <= qtd_pao; i++) {
            aux= vl_pao+ aux;
        }
        System.out.printf("\nO valor total dos pães é de: R$ %.2f",aux);
        System.out.println("\nObrigado pela preferência. Volte Sempre!!");
    }
}
