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
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Qual Período você estuda?\nM-Matutino\nV-Vespertino\nN-Noturno\n");
        String periodo= scan.nextLine();
        
        switch(periodo){
            
            case "M": System.out.println("Bom dia!"); break;
            case "V": System.out.println("Boa tarde!"); break;
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor Inválido"); break;
        }
        
    }
}
