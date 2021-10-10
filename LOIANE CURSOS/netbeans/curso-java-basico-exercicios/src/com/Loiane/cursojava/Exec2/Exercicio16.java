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
public class Exercicio16 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        double raizdelta, a,b,c,delta, x1,x2,raizUnic;
        
        // Definir os valores das Variáveis
        System.out.println("Digite o valor de A");
        a=scan.nextDouble();
        
        if(a!=0){
                System.out.println("Digite o valor de B");
                b=scan.nextDouble();
                System.out.println("Digite o valor de C");
                c=scan.nextDouble();
                //Definir o valor de Delta
                delta= Math.pow(b,2)- 4*a*c;
                System.out.println(delta);

                //Calcular valor da Raiz do Delta
                raizdelta= Math.sqrt(delta);

                if(delta > 0 ){

                x1= ((-b) + raizdelta) / (2*a);
                x2= ((-b) - raizdelta) / (2*a);
                System.out.println(x1+" "+ x2);

                } else if(delta == 0){
                    
                    raizUnic= (-b) / (2*a);
                    System.out.println("Araiz única é: " +raizUnic);
                    
                } else{
                    System.out.println("Delta Negativo, não possui raízes");
                }
            }
        else{
            System.out.println("A não pode ser negativo.");
        }

    }
}
