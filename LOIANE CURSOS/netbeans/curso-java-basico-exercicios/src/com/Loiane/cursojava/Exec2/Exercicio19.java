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
public class Exercicio19 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int resultado;
        
        System.out.println("Digite um número");
        int num1= scan.nextInt();       
        System.out.println("Digite outro número");
        int num2= scan.nextInt();
        
        //Deixa uma escolha ao usuário
        System.out.println("Escolha a operação que você quer fazer: ");
        System.out.println("(+) Soma\n(-) Subtração\n(/) Divisão\n(*) Multiplicação");        
        String escolha= scan.next();
        
        switch(escolha){
            case "+": 
                resultado= num1 + num2;
                if(resultado %2 ==0 ){
                    System.out.println("É PAR");
                } else{
                    System.out.println("É impar");
                }
                
                if( resultado < 0){
                    System.out.println("Negativo");
                } else {
                    System.out.println("Positivo");
                }; break;
            case "-": 
                resultado= num1 - num2;
                if(resultado %2 ==0 ){
                    System.out.println("É PAR");
                } else{
                    System.out.println("É impar");
                }
                
                if( resultado < 0){
                    System.out.println("Negativo");
                } else {
                    System.out.println("Positivo");
                }; break;
            case "/": 
                resultado= num1 / num2;
                if(resultado %2 ==0 ){
                    System.out.println("É PAR");
                } else{
                    System.out.println("É impar");
                }
                
                if( resultado < 0){
                    System.out.println("Negativo");
                } else {
                    System.out.println("Positivo");
                }; break;
            case "*": 
                resultado= num1 *num2;
                if(resultado %2 ==0 ){
                    System.out.println("É PAR");
                } else{
                    System.out.println("É impar");
                }
                
                if( resultado < 0){
                    System.out.println("Negativo");
                } else {
                    System.out.println("Positivo");
                }; break;
            default: System.out.println("ENTRADA INVÁLIDA");; break;
        }
        
    }
}
