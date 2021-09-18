/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula10;

/**
 *
 * @author samue
 */
public class BonusPegadinha {
    public static void main(String[] args) {
        
        int max= 2147483647;
        int teste= 1;
        
        int soma= max + teste;
        
        System.out.println("O valor é: "+ soma);
        System.out.println("UÉ, MAS PQ????");
        System.out.println("Porque depois que excede o limite, ele volta ao valor menor + o valor somado");
        System.out.println("Ex.: \"8,9,10...-2147483648,-2147483647,-2147483646");
    }
}
