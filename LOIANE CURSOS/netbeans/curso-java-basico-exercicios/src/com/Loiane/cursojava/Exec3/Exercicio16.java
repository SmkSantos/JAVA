/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long fn=1,f1=1,f2=0,valor,n;
        boolean valida= false;
        
        System.out.println("Digite o n valor");
        n = scan.nextInt();
        
        for(int i=0; i <= n; i++){
                      
                if (f1 > 500 && f2 > 500){
                valida=true;
            }else{
                f1= f1 + f2;
                f2= f1 - f2;
                System.out.println(f1+" "+f2);
                System.out.println(i);
                }
        }
    }    
}
