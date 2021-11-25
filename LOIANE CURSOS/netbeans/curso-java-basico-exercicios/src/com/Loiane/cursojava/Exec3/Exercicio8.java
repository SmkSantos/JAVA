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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num,vl_soma=0, cont=1,div;
        
        while(cont <=5){
            System.out.println("Informe o número");
            num=scan.nextInt();
            
            System.out.println("O numero Digitado foi: "+num+"\n");
            System.out.println("A soma entre "+num + " e "+vl_soma);
            vl_soma=num + vl_soma;
            System.out.println("A resposta é: "+vl_soma);
            cont++;
        }
        
        div= vl_soma/5; 
        System.out.println("A divisão do valor pelos 5 numeros, é: "+ div);
    }
}
