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
public class Exercicio31 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        double salario, sal_Ini,aumento= 1.5,aux=0;  
        int ano=1996;
         System.out.println("Digite o salario");
         sal_Ini= scan.nextDouble();
        salario= (sal_Ini*(aumento/100))+sal_Ini;
        System.out.println("Salário em 1996: "+ salario);
        
        aumento *= 2;
        
        for (int i = ano; i <= 2021; i++) {
            //cada ano
            ano++;
            aux= aumento;
            //salario novo
            salario= (sal_Ini*(aumento/100))+sal_Ini;
            System.out.println("Salário em "+ ano + ": "+salario);
            
            //calculo do novo aumento
            aumento = aux *2;
        }
        
    }
}
