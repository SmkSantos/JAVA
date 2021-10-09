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
public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner (System.in);
        
        System.out.println("Digite a primeira nota ");
        int nt1= scan.nextInt();
        System.out.println("Digite a segunda nota ");
        int nt2= scan.nextInt();
      
        String conceito=null;
        double media = (nt1+nt2)/2;
        System.out.println("Sua média foi "+ media);
    
        if (media >= 9.0 && media <= 10.0){
            conceito = "A";
        }else if(media >= 7.5 && media < 9.0){
            conceito = "B";
        }else if(media >= 6.0 && media < 7.5){
            conceito = "C";
        }else if(media >= 4.0 && media < 6.0){
            conceito = "D";
        }else if(media >= 4.0 && media < 0.0){
            conceito = "E";
        }else
            System.out.println("Valor Inválido");
        
        
        switch(conceito){
            case "A": 
            case "B": 
            case "C": System.out.println("Aprovado");break;
            case "D": 
            case "E": System.out.println("Reprovado");break;
            
            default: System.out.println("Valor Inválido");break;
        }
    
    }
}
