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
public class Exercicio21 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        double ltGs= 2.50, ltAc=1.9,ttlGs,ttlAc;
        
        System.out.println("Olá! Bem vindos ao nosso posto.");
        System.out.println("O que vai querer hoje:\nA- Álcool\nG- Gasolina");
        String escolha= scan.nextLine();
        System.out.println("Ok. Quantos litros irá querer?");
        int litros= scan.nextInt();
        
        
        switch(escolha){
            case "G":
                if(litros > 20){
                    ttlGs= litros*(ltGs-(ltGs*0.06));
                    System.out.println("Olá, por "+ litros+" litros, você pagou R$"+ ttlGs+". Obtendo R$"+(ltGs*0.06)+" de lucro.");
                } else if(litros <=20 ){
                           ttlGs= litros*(ltGs-(ltGs*0.04));
                           System.out.println("Olá, por "+ litros+"l, você pagou"+ ttlGs+". Obtendo R$"+(ltGs*0.04)+" de lucro.");
                           };
                break;
            case "A":
                if(litros > 20){
                    ttlAc= litros*(ltAc-(ltAc*0.05));
                    System.out.println("Olá, por "+ litros+" litros, você pagou R$"+ ttlAc+". Obtendo R$"+(ltAc*0.05)+" de lucro.");
                } else if(litros <=20 ){
                           ttlAc= litros*(ltAc-(ltAc*0.03));
                           System.out.println("Olá, por "+ litros+"l, você pagou"+ ttlAc+". Obtendo R$"+(ltAc*0.03)+" de lucro.");
                           };break;
            default: System.out.println("Não existe essa opção de combustível no nosso posto...");
        }
        
        //´pode melhorar o código no conceito dos if's
        
    }
}
