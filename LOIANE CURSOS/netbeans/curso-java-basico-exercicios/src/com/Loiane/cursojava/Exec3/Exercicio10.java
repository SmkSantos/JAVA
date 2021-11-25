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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int ini,fim;
        
        System.out.println("Digite o valor inicial");
        ini= scan.nextInt();
        System.out.println("Digite o valor inicial");
        fim= scan.nextInt();
        
        for (int i = ini; i <= fim; i++) {
            System.out.println("O Valor é: "+ i);
        }
    }
}
