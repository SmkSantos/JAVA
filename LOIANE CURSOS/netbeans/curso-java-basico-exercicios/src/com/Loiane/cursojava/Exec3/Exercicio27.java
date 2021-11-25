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
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int qtd,temp=0,menor=0, maior=0,aux=0,prm_num;
        
        System.out.println("Quantas temperaturas serão medidas");
        qtd= scan.nextInt();
        
        System.out.println("Digite a primeira temperatura");
        prm_num= scan.nextInt();
        
        maior= prm_num;
        for (int i = 1; i < qtd; i++) {
            
            System.out.println("Digite outra temperatura");
            temp=scan.nextInt();
            
            if (temp > maior) {
                maior= temp;
            }else if (temp < menor || menor == 0) {
                menor=temp;
            }
        }
        
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

    }
}
