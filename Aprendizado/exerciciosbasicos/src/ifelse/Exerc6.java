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
public class Exerc6 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        double Altura,pesoideal=0;
        int sexo;
        
        System.out.println("Qual sua altura?");
        Altura= scan.nextDouble();
        System.out.println("Qual Seu Sexo: \n1- Masculino\n2-Feminino");
        sexo= scan.nextInt();
        
        if(sexo == 1){
            pesoideal= (72.7 * Altura)- 58;
        }else if ( sexo == 2){
            pesoideal= (62.1 * Altura)-44.7;
        }
        
        System.out.println("Seu Peso Ideal é:" + pesoideal);
    }
}
