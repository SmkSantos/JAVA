/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula15;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int dia= scan.nextInt();
        
        switch (dia){
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Segunda");break;
            case 3: System.out.println("Terça");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sábado");break;
            default: System.out.println("Não existe esse dia");
        }
    }
}
