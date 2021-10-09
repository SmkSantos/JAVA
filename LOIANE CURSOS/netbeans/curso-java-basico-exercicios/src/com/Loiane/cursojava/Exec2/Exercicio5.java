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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite sua nota de 1-10: ");
        int nota1 = scan.nextInt();
        System.out.println("Digite sua segunda nota de 1-10: ");
        int nota2 = scan.nextInt();
        
        double media = (nota1+nota2)/2;
        
        if (media>=7 && media < 10){
            System.out.println("Aprovado!!");
        }else if (media == 10){
            System.out.println("Aprovado com Distinção");
        }else if (media >=0 && media < 7){
            System.out.println("Reprovado");
        }else{
            System.out.println("Numero fora do padrão pré-estabelecido");
        }
    }
}
