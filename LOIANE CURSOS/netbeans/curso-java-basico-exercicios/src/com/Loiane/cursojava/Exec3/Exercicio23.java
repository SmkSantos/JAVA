/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec3;

/**
 *
 * @author samue
 */
public class Exercicio23 {
    public static void main(String[] args) {
        
        double vl_unt=1.99, aux=0;
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        for (int i = 1; i <= 50; i++) {
            aux= vl_unt+aux;
            System.out.print("\n"+ i +"- R$ ");
            System.out.printf("%.2f",aux);
            System.out.println(i);
        }
    }
}
