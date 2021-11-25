/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import  java.util.Scanner;
/**
 *
 * @author samue
 */
public class Exerc2 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Qual ano de nascimento?");
        int ano= scan.nextInt();
        
        int anoatual= 2021;
        int idade = anoatual- ano;
        
        if (idade < 16) {
            System.out.println("Não pode votar!!!");
        }else if(idade >= 16 && idade <18){
            System.out.println("Não é obrigatória a votação!");
        } else{
            System.out.println("Pode Votar a Vontade");
        }
    }
}
