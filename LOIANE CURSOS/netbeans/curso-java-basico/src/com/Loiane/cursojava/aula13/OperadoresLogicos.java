/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula13;

/**
 *
 * @author samue
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 =1;
        int valor2 =2;
    
        System.out.println("Valor de um é um e de dois é dois\na resposta é:\n" + ((valor1== 1)&&(valor2==2)));
        
        System.out.println("Valor de um é um e de dois é dois\na resposta é:\n" + ((valor1== 41)||(valor2==52)));
    
        
        boolean verdade=true;
        boolean falso= false;
        
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true ^ false);
        System.out.println(!true || false);
    }
}
