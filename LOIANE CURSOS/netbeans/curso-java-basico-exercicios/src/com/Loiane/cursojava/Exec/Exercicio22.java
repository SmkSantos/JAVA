/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        //Variáveis
        double valor_ttl=0,valor_desconto=0;
        
        System.out.println("Bem Vindo Ao Meu HortFrut");
        System.out.println("Nossas promoções");
        System.out.println("Até 5 kg, você para na Maçã R$2,50 por KG e mais que 5kg, você só paga R$ 2,20 por KG ");
        System.out.println("Até 5 kg, você para na Morango R$1,80 por KG e mais que 5kg, você só paga R$ 1,50 por KG ");
        System.out.println("E em compras acima de R$25,00, garante 10% off\nEai, o que você irá pedir?\n1-Maçã\n2-Morango\nR:");
        int escolha= scan.nextInt();
        System.out.println("Quantos KGs?");
        int qtdKg= scan.nextInt();
        
        switch(escolha){
            case 1: 
               if(qtdKg > 5){
                   if(qtdKg > 8){
                        valor_ttl= (1.50 * qtdKg);
                        valor_desconto= valor_ttl-(valor_ttl*0.25);
                        System.out.println("Você vai pagar: "+valor_desconto);
                   }else{
                        valor_ttl= (1.50 * qtdKg);  
                        System.out.println("Você vai pagar: "+ valor_ttl);
                   }
               }else{
                   valor_ttl= (1.80 * qtdKg);
                   System.out.println("Você vai pagar: "+ valor_ttl);
               };
            break;
            
            case 2:
               if(qtdKg > 5){
                   if(qtdKg > 8){
                        valor_ttl= (2.20 * qtdKg);
                        valor_desconto= valor_ttl-(valor_ttl*0.25);
                        System.out.println("Você vai pagar: "+valor_desconto);
                   }else{
                        valor_ttl= (2.20 * qtdKg);  
                        System.out.println("Você vai pagar: "+ valor_ttl);
                   }
               }else{
                   valor_ttl= (2.50 * qtdKg);
                   System.out.println("Você vai pagar: "+ valor_ttl);
               };
            break;
            
            default: System.out.println("Valor incorreto!!!!!");
        }
    }
}
