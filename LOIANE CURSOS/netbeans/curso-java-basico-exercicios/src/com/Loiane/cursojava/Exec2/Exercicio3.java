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
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite M ou F: ");
        String letra= scan.nextLine();
        
        if (letra.equals("M")||letra.equals("m")){
            System.out.println("M - Masculino");
        }else if(letra.equals("F")|| letra.equals("f")){
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo Inválido");
        }
        
                

    }
}
