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
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int qtdCd;
        double preco, vlTotal=0.0,media;
        String nomeCd;
        
        System.out.println("Olá, Seja Bem Vindo");
        System.out.println("Quantos CD's há na sua coleção?");
        qtdCd= scan.nextInt();
        
        System.out.print("Qual o nome do CD?");
        nomeCd=scan.next();
        
        
        for (int i = 1; i <= qtdCd ; i++) {
            System.out.println("\nQual foi o valor?");
            preco=scan.nextDouble();
            System.out.println("\n"+i+". "+nomeCd);
            System.out.println("Valor: R$"+preco+"\n");
            vlTotal= preco+vlTotal;
            
            if (i<qtdCd) {
                System.out.println("Próximo CD");
                System.out.println("Qual nome?");
                nomeCd= scan.next();
                
            }
        }
        media= vlTotal/qtdCd;
        
        System.out.println("Você tem: "+qtdCd+" CD's");
        System.out.println("Você investiu R$"+vlTotal+" na sua coleção de CD's");
        System.out.println("A média do valor dos CD's é de: R$"+media);
        
    }
  
}
