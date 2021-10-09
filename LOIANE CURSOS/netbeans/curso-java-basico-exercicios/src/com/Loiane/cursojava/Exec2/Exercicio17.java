/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec2;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de dias de um ano");
        int dias= scan.nextInt();
        
        if (dias == 365){
            System.out.println("Ano não Bissexto");
        } else if (dias == 366){
            System.out.println("Ano Bissexto");
        } else{
            System.out.println("Valor inválido!");
        }
        
    }
}
