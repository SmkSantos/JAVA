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
public class Exerc3 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        int senha=1234,senhadig=0;
        
        System.out.println("Digite a senha de entrada");
        senhadig= scan.nextInt();
        
        if (senhadig == 1234) {
            System.out.println("ACESSO PERMITIDO!!");
        }else {
            System.out.println("ACESSO NEGADO!!");
        }
    }
}
