/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hailton.desafios;

/**
 *
 * @author samue
 */
public class Bandeirola4 {
    public static void main(String[] args) {
        
        
        //Cone Central        Para i = 1 e i for menor que 10, incremente i
        for (int i = 1; i <= 10; i++) {
            
                /*for (int k = 10; k<= i; k--) {
                    System.out.print("");
                }*/
                for (int l = 1; l <= (i-1); l++ ) {
                    System.out.print(" ");
                }
                for (int m = 10; m > i; m--) {
                    System.out.print("*");
            }
              
            System.out.println("");
        }      
    }
}
