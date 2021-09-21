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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner mediaS= new Scanner(System.in);
        //deixar sempre aspas em branco
        System.out.println("Qual a Media do 1 bimestre?");
        float media1= mediaS.nextFloat();
        System.out.println("Qual a Media do 2 bimestre?");
        float media2= mediaS.nextFloat();
        System.out.println("Qual a Media do 3 bimestre?");
        float media3= mediaS.nextFloat();
        System.out.println("Qual a Media do 4 bimestre?");        
        float media4= mediaS.nextFloat();
        
        float media= (media1+media2+media3+media4)/4;
        
        System.out.println("A sua média foi de: "+ media);
    }
}
