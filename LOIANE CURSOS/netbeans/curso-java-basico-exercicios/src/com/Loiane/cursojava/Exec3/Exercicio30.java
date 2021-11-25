/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec3;

/**
 *
 * @author samue
 */
public class Exercicio30 {
    public static void main(String[] args) {
     
        double aux=0,div=0,h=1;
        //int  h=1;
            for (int i = 1; i < 10; i++) {
                
                System.out.print(h+" / "+i);
                div= h/i;
                aux= aux + div;
                System.out.printf("= %.2f\n ",div);
            }
        System.out.printf("A soma total é: %.2f \n",aux);
    }
}
