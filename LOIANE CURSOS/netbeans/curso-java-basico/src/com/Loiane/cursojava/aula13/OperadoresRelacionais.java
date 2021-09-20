/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula13;

/**
 *
 * @author samue
 */
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int valor = 1;
        int valor2 = 2;
          
        System.out.println("valor 1 igual a valor 2" + (valor == valor2));
        System.out.println("valor 1 diferente de valor 2" + (valor != valor2));
        System.out.println("valor 1 maior a valor 2" + (valor >  valor2));
        System.out.println("valor 1 maior ou igual que a valor 2" + (valor >= valor2));
        System.out.println("valor 1 menor ou igual que a valor 2" + (valor <= valor2));
        System.out.println("valor 1 menor 2" + (valor < valor2));
      
        
    }
}
