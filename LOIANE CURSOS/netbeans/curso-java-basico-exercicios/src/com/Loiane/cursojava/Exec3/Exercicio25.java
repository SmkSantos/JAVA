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
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num_prod=1;
        double vl_prod=0,aux=0,vl_pago, troco=0;
        
        System.out.println("Caixa Registradora");
        System.out.println("\nLojas Tabajara");
        
        do {
            
            System.out.println("Produto "+ num_prod);
            System.out.println("Qual o valor do Produto?");
            vl_prod= scan.nextDouble();
            num_prod++;
            aux= vl_prod+ aux;
            
            if(vl_prod == 0){
                num_prod=0;
            }
        } while ( num_prod != 0 );
        
        System.out.printf("\nO valor total da compra foi de R$ %.2f",aux,"\n ");
        System.out.println("\nValor Recebido: ");
        vl_pago= scan.nextDouble();
        troco= vl_pago- aux;
        System.out.printf("Total do Troco: R$ %.2f", troco);
        System.out.println("\nVolte Sempre!!");
        
    }
}
