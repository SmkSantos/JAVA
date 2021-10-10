/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loiane.cursojava.Exec;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class Exercicio23 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        double file_var= 4.90,file_atac=5.80,alc_var=5.90,alc_atac=6.80,pic_var=6.90,pic_atac=7.80, vl_compra,preco,desconto=0.0;
        int opcao,qtd;
        String opc_pgto,tipo,tipo_pgto;
        
        System.out.println("Bem Vindos ao HiperMercado Tabajara");
        System.out.println("                  Até 5kg             Acima de 5kg.   ");
        System.out.println("1-Filé Duplo      R$4,90kg              R$5,80kg      ");
        System.out.println("2-Alcatra         R$5,90kg              R$6,80kg      ");
        System.out.println("3-Picanha         R$6,90kg              R$7,80kg      ");
        
        System.out.println("O que vai querer levar? Digite o número do pedido");
        opcao= scan.nextInt();


        if(opcao==1){
            tipo=  "Filé Duplo";
            System.out.println("Quantos kg irá levar?");
            qtd= scan.nextInt();
            System.out.println("Qual a Forma de Pagamento? D- Dinheiro ou T- Cartão Tabajara");
            opc_pgto= scan.next();
            
                //Define quanto o usuário irá levar
                if(qtd <= 5){
                    preco= file_var;
                    vl_compra= qtd * preco;
                    } else
                        preco= file_atac;
                        vl_compra= qtd * preco;
                        
                // Define a Forma de Pagamento        
                if(opc_pgto.equals("T") || opc_pgto.equals("t")){
                    tipo_pgto= "Cartão Tabajara";
                    System.out.println("Você escolheu a opção: Cartão Tabajara");
                    //Aplicando o desconto de 5%
                    desconto= vl_compra-(vl_compra*0.05);
//                    System.out.println(vl_compra);
                    System.out.println("           Cupom Fiscal            ");
                    System.out.println("\nTipo da Carne:"+ tipo);
                    System.out.println("Quantidade: "+ qtd +"kg" );
                    System.out.println("Preço Total: "+qtd*preco);
                    System.out.println("Tipo de Pagamento: " + tipo_pgto );
                    vl_compra=(qtd*preco)-desconto;
                    System.out.println("Valor do Desconto: " + vl_compra);
                    System.out.println("Valor a Pagar: " + desconto );
                    } else if (opc_pgto.equals("D") || opc_pgto.equals("d")){
                        tipo_pgto= "Débito";
//                        System.out.println(vl_compra);
                        System.out.println("           Cupom Fiscal            ");
                        System.out.println("\nTipo da Carne:"+ tipo);
                        System.out.println("Quantidade: "+ qtd +"kg" );
                        System.out.println("Preço Total: "+qtd*preco);
                        System.out.println("Tipo de Pagamento: " + tipo_pgto );
                        System.out.println("Valor do Desconto: "+desconto);
                        vl_compra=(qtd*preco)-desconto;
                        System.out.println("Valor a Pagar: " + vl_compra );
                        }else{
                                System.out.println("Não existe a forma de pagamento em questão!!!");
                             }
        } else if(opcao==2){
                tipo=  "Alcatra";
                System.out.println("Quantos kg irá levar?");
                qtd= scan.nextInt();
                System.out.println("Qual a Forma de Pagamento? D- Dinheiro ou T- Cartão Tabajara");
                opc_pgto= scan.next();

                    //Define quanto o usuário irá levar
                    if(qtd <= 5){
                        preco= alc_var;
                        vl_compra= qtd * preco;
                        } else
                            preco= alc_atac;
                            vl_compra= qtd * preco;

                    // Define a Forma de Pagamento        
                    if(opc_pgto.equals("T") || opc_pgto.equals("t")){
                        tipo_pgto= "Cartão Tabajara";
                        System.out.println("Você escolheu a opção: Cartão Tabajara");
                        //Aplicando o desconto de 5%
                        desconto= vl_compra-(vl_compra*0.05);
    //                    System.out.println(vl_compra);
                        System.out.println("           Cupom Fiscal            ");
                        System.out.println("\nTipo da Carne:"+ tipo);
                        System.out.println("Quantidade: "+ qtd +"kg" );
                        System.out.println("Preço Total: "+qtd*preco);
                        System.out.println("Tipo de Pagamento: " + tipo_pgto );
                        vl_compra=(qtd*preco)-desconto;
                        System.out.println("Valor do Desconto: " + vl_compra);
                        System.out.println("Valor a Pagar: " + desconto );
                        } else if (opc_pgto.equals("D") || opc_pgto.equals("d")){
                            tipo_pgto= "Débito";
    //                        System.out.println(vl_compra);
                            System.out.println("           Cupom Fiscal            ");
                            System.out.println("\nTipo da Carne:"+ tipo);
                            System.out.println("Quantidade: "+ qtd +"kg" );
                            System.out.println("Preço Total: "+qtd*preco);
                            System.out.println("Tipo de Pagamento: " + tipo_pgto );
                            System.out.println("Valor do Desconto: "+desconto);
                            vl_compra=(qtd*preco)-desconto;
                            System.out.println("Valor a Pagar: " + vl_compra );
                            }else{
                                    System.out.println("Não existe a forma de pagamento em questão!!!");
                                 }
          }else if(opcao==3){
                tipo=  "Picanha";
                System.out.println("Quantos kg irá levar?");
                qtd= scan.nextInt();
                System.out.println("Qual a Forma de Pagamento? D- Dinheiro ou T- Cartão Tabajara");
                opc_pgto= scan.next();

                    //Define quanto o usuário irá levar
                    if(qtd <= 5){
                        preco= pic_var;
                        vl_compra= qtd * preco;
                        } else
                            preco= pic_atac;
                            vl_compra= qtd * preco;

                    // Define a Forma de Pagamento        
                    if(opc_pgto.equals("T") || opc_pgto.equals("t") || opc_pgto.equals("t")){
                        tipo_pgto= "Cartão Tabajara";
                        System.out.println("Você escolheu a opção: Cartão Tabajara");
                        //Aplicando o desconto de 5%
                        desconto= vl_compra-(vl_compra*0.05);
    //                    System.out.println(vl_compra);
                        System.out.println("           Cupom Fiscal            ");
                        System.out.println("\nTipo da Carne:"+ tipo);
                        System.out.println("Quantidade: "+ qtd +"kg" );
                        System.out.println("Preço Total: "+qtd*preco);
                        System.out.println("Tipo de Pagamento: " + tipo_pgto );
                        vl_compra=(qtd*preco)-desconto;
                        System.out.println("Valor do Desconto: " + vl_compra);
                        System.out.println("Valor a Pagar: " + desconto );
                        } else if (opc_pgto.equals("D") || opc_pgto.equals("d")){
                            tipo_pgto= "Débito";
    //                        System.out.println(vl_compra);
                            System.out.println("           Cupom Fiscal            ");
                            System.out.println("\nTipo da Carne:"+ tipo);
                            System.out.println("Quantidade: "+ qtd +"kg" );
                            System.out.println("Preço Total: "+qtd*preco);
                            System.out.println("Tipo de Pagamento: " + tipo_pgto );
                            System.out.println("Valor do Desconto: "+desconto);
                            vl_compra=(qtd*preco)-desconto;
                            System.out.println("Valor a Pagar: " + vl_compra );
                            }else{
                                    System.out.println("Não existe a forma de pagamento em questão!!!");
                                 }
          } else{
              System.out.println("Não Existe a Opção solicitada!!!");
          }
    }   
}
