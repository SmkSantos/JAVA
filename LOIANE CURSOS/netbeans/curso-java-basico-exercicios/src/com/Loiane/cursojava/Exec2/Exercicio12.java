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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Quanto é o seu valor por horas?");
        int vlh= scan.nextInt();
        System.out.println("Quantas Horas você trabalhou no mês?");
        double vlm= scan.nextDouble();
        double bruto,ir=0,inss=0,fgts=0,tt_dsc,slr_lq,sindt;
        
        bruto= vlh*vlm;
        
        if (bruto < 900.0){
            
            inss= bruto * 0.1;
            fgts= bruto * 0.11;
            tt_dsc=  inss + ir;
            slr_lq= bruto - tt_dsc;
            
            System.out.println("Salário Bruto: R$ "+bruto+"\n(-) IR (ISENTO): R$ ---");
            System.out.println("(-) INSS(10%): RS% "+inss+"\nFGTS (11%): R$ "+fgts);
            System.out.println("Total de Descontos: R$ "+ tt_dsc + "\nSalário Líquido: R$ "+slr_lq);
            
        }   else if (bruto >= 900.0 && bruto < 1500.00){
                
                ir= bruto * 0.05;
                inss= bruto * 0.1;
                fgts= bruto * 0.11;
                tt_dsc=  inss + ir;
                slr_lq= bruto - tt_dsc;

                System.out.println("Salário Bruto: R$ "+bruto+"\n(-) IR (5%): R$ "+ ir);
                System.out.println("(-) INSS(10%): RS% "+inss+"\nFGTS (11%): R$ "+fgts);
                System.out.println("Total de Descontos: R$ "+ tt_dsc + "\nSalário Líquido: R$ "+slr_lq);
                
            }   else if(bruto>=1500.0 && bruto < 2500.0){

                    ir= bruto * 0.1;
                    inss= bruto * 0.1;
                    fgts= bruto * 0.11;
                    tt_dsc=  inss + ir;
                    slr_lq= bruto - tt_dsc;

                    System.out.println("Salário Bruto: R$ "+bruto+"\n(-) IR (10%): R$ "+ ir);
                    System.out.println("(-) INSS(10%): RS% "+inss+"\nFGTS (11%): R$ "+fgts);
                    System.out.println("Total de Descontos: R$ "+ tt_dsc + "\nSalário Líquido: R$ "+slr_lq);
                    
                }   else if( bruto >= 2500.0){
                    

                        ir= bruto * 0.2;
                        inss= bruto * 0.1;
                        fgts= bruto * 0.11;
                        tt_dsc=  inss + ir;
                        slr_lq= bruto - tt_dsc;

                        System.out.println("Salário Bruto: R$ "+bruto+"\n(-) IR (20): R$ "+ ir);
                        System.out.println("(-) INSS(10%): RS% "+inss+"\nFGTS (11%): R$ "+fgts);
                        System.out.println("Total de Descontos: R$ "+ tt_dsc + "\nSalário Líquido: R$ "+slr_lq);
                        
                    }
                   
        //Mesmo processo do exercício anterior se encaixa aqui.
        //nos if's, seria legal colocar apenas o valor da porcentagem e depois da decisão, 
        //realizava o processo com formulas predefinidas e realizando o calculo
        //Por exemplo: a porcentagem do ir nos nos ifs, e o calculo do valor total posteriormente.
        
    }
}
