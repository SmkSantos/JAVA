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
public class BonusEscapesChar {
    public static void main(String[] args) {
        System.out.println("\" Eu vou pular a linha entre aspas duplas\"\n\r"); 
        //Mantem o texto entre aspas duplas, vai pra linha de baixo com \n e pula linha com \r
        System.out.println("\' Eu vou pular a linha entre aspas duplas\'\n\r");
        //Mantem o texto entre aspas simples
        System.out.println("\\Estou entre contra-barras\\");
    }
}
