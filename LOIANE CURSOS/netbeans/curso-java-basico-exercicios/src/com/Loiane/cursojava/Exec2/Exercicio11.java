/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec2;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Qual seu salário?");
        double salario= scan.nextDouble();
        double percentual, vlraumento,nv_salario;
        
        if(salario < 280.0){
            
            percentual= 0.2;
            vlraumento= salario *(0.2);
            nv_salario= vlraumento + salario;
            
            System.out.println("O seu salário antes do reajuste era de : R$"+salario);
            System.out.println("Percentual: "+ (percentual*100)+"%");
            System.out.println("Valor Aumento: R$"+vlraumento);
            System.out.println("Novo Salario: R$"+nv_salario);
            
                } else if(salario >= 280.0 && salario < 700.0){

                    percentual= 0.15;
                    vlraumento= salario *(0.15);
                    nv_salario= vlraumento + salario;

                    System.out.println("O seu salário antes do reajuste era de : R$"+salario);
                    System.out.println("Percentual: "+ (percentual*100)+"%");
                    System.out.println("Valor Aumento: R$"+vlraumento);
                    System.out.println("Novo Salario: R$"+nv_salario);
                        } else if(salario >= 700.0 && salario < 1500){

                            percentual= 0.1;
                            vlraumento= salario *(0.1);
                            nv_salario= vlraumento + salario;

                            System.out.println("O seu salário antes do reajuste era de : R$"+salario);
                            System.out.println("Percentual: "+ (percentual*100)+"%");
                            System.out.println("Valor Aumento: R$"+vlraumento);
                            System.out.println("Novo Salario: R$"+nv_salario);
                                } else if(salario >= 1500.00){
                                percentual= 0.05;
                                vlraumento= salario *(0.05);
                                nv_salario= vlraumento + salario;

                                System.out.println("O seu salário antes do reajuste era de : R$"+salario);
                                System.out.println("Percentual: "+ (percentual*100)+"%");
                                System.out.println("Valor Aumento: R$"+vlraumento);
                                System.out.println("Novo Salario: R$"+nv_salario);
                                }
    }
}
