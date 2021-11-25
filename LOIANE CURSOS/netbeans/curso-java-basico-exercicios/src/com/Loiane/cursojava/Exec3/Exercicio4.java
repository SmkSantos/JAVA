/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec3;

/**
 *
 * @author samue
 */
public class Exercicio4 {
    public static void main(String[] args) {
        
        int ano= 0;
        double paisA= 80000,paisB=200000;
        double txA=0.03,txB=0.015;
        boolean valida= false;
        do{
            
            if (paisA < paisB){
                paisA= paisA+(paisA*txA);
                paisB= paisB+(paisB*txB);
                ano++;
            }else{
                valida= true;
            }
            
            
            System.out.println(""+paisA+"     "+paisB);
            System.out.println(ano);
        }while(!valida);
        
    }
}
