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
public class LiteraisGeral {
    public static void main(String[] args) {
        double db= 2e2;// e2 10^2-> 2.(10^2)=200
        System.out.println(db);
    
        int decVal= 26;
        int hexVal= 0x1a;
        int octVal= 032;
        int BinVal= 0b11010;
        /*
        Ambos valores são 26, só que cada um em seu tipo literal especifico: 
        - decimal
        - hexadecimal
        - octais
        - binárias 
        */
        
        System.out.println(decVal);
        System.out.println(hexVal);
        System.out.println(octVal);
        System.out.println(BinVal);
    }
}
