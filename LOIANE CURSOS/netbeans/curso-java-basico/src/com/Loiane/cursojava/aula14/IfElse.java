/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula14;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        /*
        System.out.println("Qual sua idade?");
        int idade= scan.nextInt();
        
        //Apenas o IF
        if (idade> 18){
            System.out.println("É Maior de Idade");
        } else //Utilizando a condição senão 
        {
            System.out.println("É Menor de Idade");
        }*/
        
        System.out.println("Qual o valor do Produto? ");
        double vlProd= scan.nextDouble();
        
        if (vlProd <= 10){
            System.out.println("Pode comprar, está em conta!!");
        } else 
            if(vlProd > 10 && vlProd < 15){
                System.out.println("Valor bom, mas dá pra chorar um desconto!");
            }else
                if(vlProd >= 15 && vlProd < 17){
                    System.out.println("Saiu do orçamento, da uma pesquisadinha a mais!!");
                } else {
                    System.out.println("Muito Caro, não compensa gastar tempo aqui.");
                }
        
    }
}
