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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
          int ano= 0;
        double paisA,paisB;
        double txA,txB;
        boolean valida= false;
        boolean repete= false;
        String teste;


       
//        System.out.println("Deseja calcular?");
  //      repete=scan.next();
        
    //    if (repete.equalsIgnoreCase("s")){
            System.out.println("Digite a população do Pais A:");
            paisA= scan.nextDouble();
            System.out.println("Digite a população do Pais B:");
            paisB= scan.nextDouble();
            System.out.println("Digite a população do Pais B:");
            txA= scan.nextDouble();
            System.out.println("Digite a população do Pais B:");
            txB= scan.nextDouble();
            
           do{
          
            if(paisA > paisB){

                    valida=true;
                    System.out.println(paisA+" "+paisB);
                    System.out.println(ano);
                    System.out.println("Repete?");
                    teste=scan.next();
                    if(teste.equalsIgnoreCase("n")){                   
                        valida=true;
                    }else{
                        System.out.println("Digite a população do Pais A:");
                        paisA= scan.nextDouble();
                        System.out.println("Digite a população do Pais B:");
                        paisB= scan.nextDouble();
                        System.out.println("Digite a população do Pais B:");
                        txA= scan.nextDouble();
                        System.out.println("Digite a população do Pais B:");
                        txB= scan.nextDouble(); 
                        ano=0;
                        valida=false;
                    }                              
            }else{
                    paisA= paisA+(paisA*(txA/100));  
                    paisB= paisB+(paisB*(txB/100));
                    ano++;
                    System.out.println(paisA+" "+paisB);
                    System.out.println(ano);          
            }
            

               
           }while(!valida);
           
           
      //  }
     }
}