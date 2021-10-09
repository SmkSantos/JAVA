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
public class Exercicio15 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        String trgl;
        System.out.println("Digite o valor do primeiro lado:");
        int lado1=scan.nextInt();
        
        System.out.println("Digite o valor do segundo lado:");
        int lado2=scan.nextInt();
       
        System.out.println("Digite o valor do terceiro lado:");
        int lado3=scan.nextInt();
        
        
        if((lado1+lado2 > lado3)&& (lado2 + lado3 > lado1) && (lado1+lado3 > lado2)){
            
            trgl="T";
            System.out.println("É triângulo");
        } else
            trgl="NT";
        
        
        switch(trgl){
            case "T": 
                if (lado1==lado2 && lado2==lado3){
                    System.out.println("Triângulo Equilátero");
                }else if ((lado1==lado2 && lado1 != lado3)|| (lado1==lado3 && lado1 != lado2) || (lado3==lado2 && lado3 != lado1) ){
                    System.out.println("Triângulo Isósceles");
                }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                    System.out.println("Triângulo Escaleno");
                };break;
            case "NT": System.out.println("Não é Triângulo");break;
            default:   System.out.println("Escreveu algo errado");
        }    
        
    }
    
}
