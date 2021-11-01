/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hailton.desafios;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Balao1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num;
        String id;
        System.out.println("Digite o numero final");
        num=scan.nextInt();
        System.out.println("Digite a identificação da bandeira");
        id= scan.next();
        for (int i = 1; i <= num; i++) {
            
            for (int j = num; j >= i; j--) {
                System.out.print(id);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            //System.out.println("");
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(id);
            }
            for (int l = 1; l < i; l++) {
                System.out.print(id);
            }
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int m = num; m >= i; m--) {
                System.out.print(id);
            }
            System.out.println("");
        }
        //PARTE DO MEIO ABAIXO DA FIGURA
        for (int i = 1; i <= num; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(id);
            }
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k > i; k--) {
                System.out.print(id);
            }
            for (int l = num; l >= i; l--) {
                System.out.print(id);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }            
            for (int k = num; k >= i; k--) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print(id);
            }            
            System.out.println("");
        }
        

    }
}
