/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula17;

/**
 *
 * @author samue
 */
public class LoopFor {
    public static void main(String[] args) {
       /*
       // for normal
       for(int i=1; i <= 10;i++){
           System.out.println("Valor de i: " + i);
       }
       
       //for mais de uma variável
       for (int a= 1, b = 10; a < b; a++, b--){
           System.out.println("Valor de i " + a + " Valor de j " + b);
       }
       */
       //estudo
       int tabuada= 2;
       for(int num1 = 0; num1<10; num1++){
            int valor= num1*tabuada;
            System.out.println(valor);
       }
    }
}
