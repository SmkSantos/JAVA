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
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        String nome, sexo , estciv;
        int idade=0;
        double salario=0;
        boolean valida=false;
        
        do{
            System.out.println("Digite seu nome");
            nome=scan.next();
            System.out.println("Digite sua idade");
            idade= scan.nextInt();
            System.out.println("Digite seu salario");
            salario= scan.nextDouble();
            System.out.println("Digite seu sexo: f ou m");
            sexo= scan.next();
            System.out.println("Qual seu estado cívil?\nS-Solteiro\nC-Casado\nV-Viúvo\nD-Divorciado");
            estciv= scan.next();


                if(nome.length()<= 3){
                    System.out.println("Deve haver mais de 3 caracteres no nome.");
                } else{
                    System.out.println("Olá, "+nome);
                    valida = true;       
                  }
                
                if (idade > 0 && idade <= 150) {
                        System.out.println("Você tem "+ idade + " anos");
                }else{
                    System.out.println("A idade tem que estar entre 0 e 150");
                }
                
                if (salario > 0 ) {
                    System.out.println("Você ganha: " + salario);
                }else{
                    System.out.println("O salário deve ser maior que 0");
                }
                
                if (sexo.length()== 1 && sexo.equalsIgnoreCase("m") ) {
                    System.out.println("Seu Sexo é: "+sexo);
                }else if (sexo.length()== 1 && sexo.equalsIgnoreCase("f") ) {
                    System.out.println("Seu Sexo é: "+sexo);
                }else{
                    System.out.println("O salário deve ser maior que 0");
                }

                if (estciv.length()== 1 && estciv.equalsIgnoreCase("s") ) {
                    System.out.println("Solteiro(a)");
                }else if (estciv.length()== 1 && estciv.equalsIgnoreCase("c") ) {
                    System.out.println("Casado(a)");    
                }else if (estciv.length()== 1 && estciv.equalsIgnoreCase("v") ) {
                    System.out.println("Viúvo(a)");
                }else if (estciv.length()== 1 && estciv.equalsIgnoreCase("d") ) {
                    System.out.println("Divociado(a)");
                }else{
                     System.out.println("Você colocou o valor incorreto");
                }

                
          } while(!valida);



        
    }
}
