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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        

        boolean validasenha= false;
        
        do{
             
            System.out.println("Digite seu nome:");
            String nome= scan.next();
            System.out.println("Digite sua senha:");
            String senha= scan.next();
            
        if (senha.equalsIgnoreCase(nome)){
            System.out.println("Senha igual a nome!!! Crie nova!!");
        }else{
            validasenha= true;
        }
        }while(!validasenha);
    }
}
