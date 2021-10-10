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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite uma letra : ");
        String letra= scan.nextLine();
        
        /*para que haja entendimento, a questão solicita vogal ou consoante
          não há determinação que precise ser só letras
        */if (letra.length( )> 1){
            System.out.println("Isso não é uma letra!!!");
        }else{

            switch(letra){
            case "a": System.out.println("vogal");
            case "e": System.out.println("vogal");
            case "i": System.out.println("vogal");
            case "o": System.out.println("vogal");
            case "u": System.out.println("vogal");
            case "A": System.out.println("vogal");
            case "E": System.out.println("vogal");
            case "I": System.out.println("vogal");
            case "O": System.out.println("vogal");
            case "U": System.out.println("vogal");
            default: System.out.println("Consoante");
        }}
        
        
    }
}
