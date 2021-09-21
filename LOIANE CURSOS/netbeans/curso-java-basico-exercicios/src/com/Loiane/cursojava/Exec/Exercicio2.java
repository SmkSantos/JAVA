/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        //deixar sempre aspas em branco
        System.out.println("Digite um numero:");
        int numero= num.nextInt();
        
        System.out.println("O número informado foi: "+ numero);
    }
}
