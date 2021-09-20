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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite os graus em Fahrenheit ");
        float grFh= scan.nextFloat();
        
        float grCe= (5*(grFh-32)/9);
        
        System.out.println("A conversão ficou em "+ grCe+"º");
        
        
        
    }
}
