/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.aula16;

/**
 *
 * @author samue
 */
public class LoopWhile {
    public static void main(String[] args) {
            int i = 1;
            int max= 10;
            
            System.out.println("Contando até "+ max);
            
            //valida a expressão
            while( i <= max){
                
                //executa o bloco de código
                System.out.println("Valor de i: "+ i);
                i++;
            }
            
            do{
                //execua bloco de código
                i++;
                System.out.println("");
            }while(i< max+2);
            //avalia a expressão após execução do código
    
}
}
