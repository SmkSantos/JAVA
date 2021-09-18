/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula11;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class LeituraDadosTeclado {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       /*
        System.out.println("Digite seu nome: ");
        String nomeCompleto = scan.nextLine();
        
        System.out.println(nomeCompleto);
        
        
        System.out.println("Digite seu nome: ");
        String firstName= scan.next();
        System.out.println(firstName);
        System.out.println("Digite sua altura: ");
        String altura = scan.nextLine();
        System.out.println(altura);*/
        
        System.out.println("Digite seu nome, idade, tem filhos, altura, tem bicho de estimação?");
        String name= scan.next();
        int idade = scan.nextInt();
        byte filhos = scan.nextByte();
        float alt= scan.nextFloat();
        boolean temPet= scan.nextBoolean();
        
        System.out.println("Nome: "+name);
        System.out.println("Idade "+idade);
        System.out.println("Filhos? "+filhos);
        System.out.println("Altura: "+ alt);
        System.out.println("Tem Animal de Estimação?" + temPet);
    }
}
