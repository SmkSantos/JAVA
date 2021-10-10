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
public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        //Variáveis
        double vlrMc=0, vlrMrg=0,vlrCmp=0.0,desconto;
        int ttlqtd;
        
        System.out.println("Bem Vindo Ao Meu HortFrut");
        System.out.println("Nossas promoções");
        System.out.println("Até 5 kg, você para na Maçã R$2,50 por KG e mais que 5kg, você só paga R$ 2,20 por KG ");
        System.out.println("Até 5 kg, você para na Morango R$1,80 por KG e mais que 5kg, você só paga R$ 1,50 por KG ");
        System.out.println("E em compras acima de R$25,00, garante 10% off\n");
        System.out.println("Quantos KGs de maçã?");
        int qtdMc= scan.nextInt();
        System.out.println("Quantos KGs de morango?");
        int qtdMrg= scan.nextInt();
        
        
        // definição de preços para maçãs
        
        if (qtdMc > 5){
            vlrMc = 1.5;
        } else {
            vlrMc = 1.8;
        }
        
        // definição de preços para os morangos
        
        if (qtdMrg > 5){
            vlrMrg= 2.2;
        }else{
            vlrMrg= 2.5;
        }
       
        ttlqtd= qtdMc + qtdMrg;
        vlrCmp= (vlrMc * qtdMc)+(vlrMrg * qtdMrg);
        
        if((ttlqtd > 8) || (vlrCmp > 25.0)){
            desconto= 10;
            vlrCmp= vlrCmp - ((vlrCmp/100) * desconto);
        } 
        
        System.out.println("Maçãs: " + qtdMc);
        System.out.println("Morango: " + qtdMrg);
        System.out.println("\nTotal a Pagar: " + vlrCmp );
        
    }
}
