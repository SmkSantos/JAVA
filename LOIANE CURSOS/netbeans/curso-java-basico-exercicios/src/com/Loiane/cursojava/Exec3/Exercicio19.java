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
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double media=0, nota=0, qtdNt,aux=0,cont=0;
        boolean valida= false;
        System.out.println("Olá, quantas notas são?");
        qtdNt=scan.nextDouble();
        
        for (int i = 1; i <= qtdNt; i++) {
            System.out.println("Digite uma nota");
            nota=scan.nextInt();
            
            if (nota <= 10 && nota > 0) {
                aux=nota + aux;
                cont++;                
            }else{
                System.out.println("Digite uma nota de 0 a 10");
                i--;
            }
        }
        System.out.println("A soma das notas é: "+aux);
        media= aux/qtdNt;
        System.out.println("A média Aritmética é: "+ media);
    }
}
