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
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int qtd=0, pedido=0;
        double prc=0,prc1=0,aux=0;
        boolean valida= false;
        
        System.out.println("Olá, segue cardápio");
        System.out.println("   Especificação    Codigo    Preço");
        System.out.println(" ------------------------------------");
        System.out.println("| Cachorro Quente |   100   | R$ 1,20 |");
        System.out.println("| Bauru Simples   |   101   | R$ 1,30 |");
        System.out.println("| Bauru com Ovo   |   102   | R$ 1,50 |");
        System.out.println("| Hamburguer      |   103   | R$ 1,20 |");
        System.out.println("| Cheeseburguer   |   104   | R$ 1,30 |");
        System.out.println("| Refrigerante    |   105   | R$ 1,00 |");
        System.out.println(" ------------------------------------");
        
        do {
            System.out.println("Digite o(s) numero(s) do(s) pedido(s) e 0 para fechá-lo ");
            pedido= scan.nextInt();
         
         if (pedido == 100) {
                System.out.println("Quantos?");
                qtd= scan.nextInt();
                prc= qtd * 1.20;
                System.out.println("Valor R$"+ prc);
                aux=prc + aux;
            }             
         if (pedido == 101) {
                System.out.println("Quantos?");
                qtd= scan.nextInt();
                prc= qtd * 1.30;
                System.out.println("Valor R$"+ prc);
                aux=prc + aux;
            }
         if (pedido == 102) {
                System.out.println("Quantos?");
                qtd= scan.nextInt();
                prc= qtd * 1.50;
                System.out.println("Valor R$"+ prc);
                aux=prc + aux;
            }
         if (pedido == 103) {
                System.out.println("Quantos?");
                qtd= scan.nextInt();
                prc= qtd * 1.20;
                System.out.println("Valor R$"+ prc);
                aux=prc + aux;
            }
         if (pedido == 104) {
                System.out.println("Quantos?");
                qtd= scan.nextInt();
                prc= qtd * 1.30;
                System.out.println("Valor R$"+ prc);
                aux=prc + aux;
            } 
         if (pedido == 105) {
                System.out.println("Quantos?");
                qtd= scan.nextInt();
                prc= qtd * 1.00;
                System.out.printf("Valor R$ %.2f", prc);
                aux=prc + aux;
            }          
            if (pedido == 0) {
                valida= true;
            }
        } while (!valida);
        System.out.println(""+aux);
    }
}
