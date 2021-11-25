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
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int s,us,si,cont=0,qtdAlu=0,aux=0,media=0;
        
        System.out.println("Digite a Quantidade de Turmas");
        s= scan.nextInt();
        System.out.println("Iniciemos a Partir de que Série?");
        si= scan.nextInt();
        System.out.println("Qual a Ultima Série?");
        us= scan.nextInt();
        
        for (int i = si; i <= us; i++) {
            System.out.println("\n");
            System.out.println("   SERIE "+i+"   ");
           
            System.out.println("Quantos alunos?");          
            for (int j = 1; j <= s; j++) {
                System.out.println("Turma "+j);
                cont++;
                System.out.print("Alunos: ");
                qtdAlu=scan.nextInt();
                
                if(qtdAlu < 0 || qtdAlu > 40){
                    System.out.println("Não pode ser menor que 0 e maior que 40");
                    j--;
                }else{
                aux=qtdAlu+aux;           
                System.out.println("Total de Alunos: "+aux);
                }
            }
        }
        media= aux/cont;
        System.out.println("O total de Turmas, são: "+cont);
        System.out.println("E a média de alunos, é: " + media);
        
    }
}
