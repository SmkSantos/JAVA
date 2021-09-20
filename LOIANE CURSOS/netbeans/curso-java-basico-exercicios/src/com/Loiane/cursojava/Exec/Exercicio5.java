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
public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Digite o total de metros: \r");
        Scanner scan = new Scanner(System.in);
        
        int metro= scan.nextInt();
        
        int calculo= metro*100;
        
        System.out.println("A conversão de "+ metro + "m em cm é de: " +calculo+"cm.");
    }
}
