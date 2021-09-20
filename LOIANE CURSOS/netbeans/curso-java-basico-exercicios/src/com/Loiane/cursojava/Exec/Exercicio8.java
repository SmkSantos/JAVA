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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Quanto você ganha por hora? ");
        float vlH= scan.nextFloat();
        System.out.println("Quantas horas trabalha por mês? ");
        float hrM= scan.nextFloat();
        
        float calc= vlH*hrM;
        
        System.out.println("Vcê ganhou: R$"+calc);
    }
}
