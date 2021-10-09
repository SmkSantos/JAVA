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
        */
            switch(letra){
            case "a": System.out.println("vogal");break;
            case "e": System.out.println("vogal");break;
            case "i": System.out.println("vogal");break;
            case "o": System.out.println("vogal");break;
            case "u": System.out.println("vogal");break;
            default: System.out.println("Consoante");
        }
        
        
    }
}
