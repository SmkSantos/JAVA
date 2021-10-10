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
public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de dias de um ano");
        int ano= scan.nextInt();
        //int dias= scan.nextInt();

        if ((ano % 400 ==0) || (ano% 400 ==0 && ano %   100 != 0 ) ){
            System.out.println("Ano Bissexto");
        }else{
            System.out.println("Não é bissexto");
        }







// Houve falha de entendimento no exercicio, no qual ele pede para informar o ano
 // e eue coloquei para informar os dias do ano
       /* if (dias == 365){
            System.out.println("Ano não Bissexto");
        } else if (dias == 366){
            System.out.println("Ano Bissexto");
        } else{
            System.out.println("Valor inválido!");
        }*/
        
    }
}
