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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite uma nota");
        int nota= scan.nextInt();
        
        while (nota > 10){
            
            System.out.println("Valor inválido, peça outro valor");
            nota=scan.nextInt();
            
        }
        
        System.out.println("Você tirou: "+ nota);
    }
}
