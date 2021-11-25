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
public class Exerc4 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        double preço=0,vlrttl=0;
        
        System.out.println("Digite a quantidade de maçãs que irá comprar!!");
        int qtdmc= scan.nextInt();
        
        if (qtdmc < 12){
            preço=0.30;
        } else{
            preço=0.25;
        }
        
        vlrttl= preço * qtdmc;
        
        System.out.println("Foram compradas " + qtdmc + " maçãs.");
        System.out.println("O Valor unitário foi: R$"+ preço);
        System.out.println("O Valor total da compra foi: R$" + vlrttl);
    }
}
