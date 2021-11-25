/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n, idade,media=0, aux=0,soma=0;
        
        System.out.println("Digite a quantidade de pessoas que vão responder.");
        n=scan.nextInt();
        
        System.out.println("Ok, vamos lá!");
        
        for (int i = 1; i <=n; i++) {
            System.out.print(i+".");
            
            System.out.println("Qual sua idade?");
            idade= scan.nextInt();
            
            if(idade < 0 ){
                System.out.println("Digite uma idade válida");
                i--;
            }else{
            soma= idade+aux;
            aux=soma;
            }
        }
        
        media= soma/n;
        System.out.println("A média é de: "+ media);
        
        if (media > 0 && media <= 25) {
            System.out.println("A turma é Jovem");
        }else if (media > 26 && media <= 60){
            System.out.println("A turma é Adulta");
        }else{
            System.out.println("A turma é Idosa");
        }
    }
}
