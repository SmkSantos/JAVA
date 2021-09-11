/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user= new Scanner(System.in);//Será escaneada toda a entrada (in) no sistema
        String nome= user.nextLine();
        float nota=user.nextFloat();

        
        System.out.println("A nota é: "+nota);
        System.out.printf("A nota de %s é: %.1f \n",nome,nota);
    }
    
}
