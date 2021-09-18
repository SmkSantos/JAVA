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
public class TipoChar {
    public static void main(String[] args) {
        char a= 0x00E1; // O valor segundo a ascii é "á"
        char o= 'o';
        char i= 'i';
        System.out.println(""+o+i); // oi, para juntar as strings
        
        char e = 210;
        char u = 151;
        System.out.println(e+u); // vai somar
        System.out.println(""+e+u); // vai gerar um encode
        
        System.out.println(a+o+i);// o valor sera de 441, que é a interunião dos tres caracteres
        System.out.println(o+i); //216
        
        
        
    }
}
