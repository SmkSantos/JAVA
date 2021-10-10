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
public class Exercicio20 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int a=0;
        System.out.println("Olá, você será interrogado sobre o crime na casa dos Osvald's.");
        System.out.println("Responda a mim:\nVocê Telefonou para a Vitima?");
        String perg1= scan.nextLine();
        System.out.println("Esteve no Local do Crime?");
        String perg2= scan.nextLine();
        System.out.println("Mora perto da vitima?");
        String perg3= scan.nextLine();
        System.out.println("Devia para a vitima?");
        String perg4= scan.nextLine();
        System.out.println("Já trabalhou com a vítima?");
        String perg5= scan.nextLine();
        
        if (perg1.equalsIgnoreCase("S")){
            a+=1;
        }
        
        if(perg2.equalsIgnoreCase("S")){
            a+=1;
        }
        if(perg3.equalsIgnoreCase("S")){
            a+=1;
        }
        if(perg4.equalsIgnoreCase("S")){
            a+=1;
        }
        if(perg5.equalsIgnoreCase("S")){
            a+=1;
        }
        
        
        switch (a){
            case 5: System.out.println("Você esta sendo preso por assassinato");break;
            case 4: System.out.println("Você é cúmplice do assassinato.");
            case 3: System.out.println("Você é cúmplice do assassinato.");break;
            case 2: System.out.println("Pode sair, mas é suspeito de um assassinato. NÃO SAIA DA CIDADE!!");break;
            case 1: 
            default:System.out.println("Desculpe-nos o incoveniente, pode ir."); ;break;
        }
        // Corrigido detalhe de todas as perguntas serem não
        
    }
}
