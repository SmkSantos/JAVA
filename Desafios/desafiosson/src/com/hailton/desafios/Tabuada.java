/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hailton.desafios;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int inicio, fim, numero,valor;
        
        System.out.println("Olá. Digite o numero para mostrar sua tabuada");
        numero= scan.nextInt();
        System.out.println("Digite a partir de qual numero quer iniciar a tabuada");
        inicio= scan.nextInt();
        System.out.println("Digite o numero que vai findar a tabuada");
        fim= scan.nextInt();
            
        if (inicio < fim) {
            
        //inicia-se o loop para rodar número a número
            for (int i = inicio; i <= fim; i++) {
                //Faz-se a multiplicação
                valor= numero * i;
                //Mostra o valor e sequência da tabuada
                System.out.println(numero+" x "+i+" = "+valor);
            }
        }else{
            for (int i = inicio; i >= fim; i--) {
                valor = numero * i;
                System.out.println(numero+" x "+i+" = "+valor);
            }
        }

    }
}
