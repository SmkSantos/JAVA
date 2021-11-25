/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class Exerc1 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double valor1= scan.nextDouble();
        System.out.println("Digite o primeiro numero: ");
        double valor2= scan.nextDouble();
        
        if (valor1==valor2) {
            System.out.println("Digite números diferentes para que programa rode bem!");
        } else if (valor1 > valor2) {
            System.out.println("O valor "+ valor1 + " é maior que o valor " + valor2);
        } else{
            System.out.println("O valor "+ valor2 + " é maior que o valor " + valor1);
        }  
    }
}
