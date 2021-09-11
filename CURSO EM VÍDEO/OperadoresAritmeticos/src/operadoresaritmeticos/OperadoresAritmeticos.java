/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner ler =  new Scanner(System.in);
      String nome;
      float n1,n2,n3,n4;
      double valores= Math.random();
      
      
      
        System.out.println("Qual o seu nome? \n");
         nome= ler.nextLine();
        System.out.println("Digite um numero: \n");
         n1= ler.nextFloat();
        System.out.println("Digite um numero: \n");
         n2= ler.nextFloat();
        System.out.println("Digite um numero: \n");
         n3= ler.nextFloat();
        
        n1 *= Math.PI;
        n2 *= Math.sqrt(n2);
        n3 = (float)Math.pow(n3,2);
        n4 = 5- (float)valores * (10-5);
        System.out.printf("%.2f \n",n1);
        System.out.printf("%.2f \n",n2);
        System.out.printf("%.2f \n",n3);
        System.out.printf("%f \n",n4);
    }
    
}
