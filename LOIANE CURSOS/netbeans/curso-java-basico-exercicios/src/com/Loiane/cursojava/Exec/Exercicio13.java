/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite seu valor por hora: ");
        double vlHr= scan.nextDouble();
        
        System.out.println("Digite o total de horas trabalhadas no mês: ");
        int hrM = scan.nextInt();
        
        double vlTrab= vlHr * hrM;
        System.out.println("Você ganhou em valor bruto: R$"+ vlTrab);
        
        double inss= (8.0/100.0)*vlTrab;
        System.out.println("Você pagou de INSS: R$"+ inss);
        
        double sindc= (5.0/100)* vlTrab;
        System.out.println("Você pagou de Sindicato: R$"+ sindc);
        
        double irrf= (11.0/100)*vlTrab;
        System.out.println("Você pagou de Imposto de Renda: R$"+ irrf);
        
        double slr_liq= vlTrab-(inss+sindc+irrf);
        double saidas= inss+sindc+irrf;
        System.out.println("Você está recebendo de salário líquido: R$"+ slr_liq+"\n");
        
        System.out.println(" (+) Entradas\n Salario Bruto= R$"+vlTrab+"\n");
        System.out.println(" (-) Saídas\n IRRF= R$"+irrf+" \n INSS= R$"+inss+" \n Sindicato= R$"+sindc);
        System.out.println(" Total: R$"+saidas);
        System.out.println("Ficando o valor liquido de R$"+slr_liq);
        
    }
}
