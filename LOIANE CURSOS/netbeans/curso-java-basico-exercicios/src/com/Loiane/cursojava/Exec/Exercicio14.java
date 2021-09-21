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
public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        //Tamanho Do Download
        System.out.println("Qual o tamanho do arquivo? ");
        double mb= scan.nextDouble();
        
        //Velocidade do Download
        System.out.println("Qual a velocidade de download em sua internet? ");
        double mbps= scan.nextDouble();
        
        double tempo= mb/mbps;
        double minuto= tempo/60.0;
        System.out.println(tempo);
    }
}
