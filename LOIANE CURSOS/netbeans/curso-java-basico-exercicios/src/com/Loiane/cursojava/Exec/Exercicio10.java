/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite o total de graus em Celsius: ");
        double grFh= scan.nextDouble();
        //Errei a fórmula
        double grCe= (grFh*1.8)+ 32;
        
        System.out.println("A conversão em ºC é de: "+ grCe);
    }
}
