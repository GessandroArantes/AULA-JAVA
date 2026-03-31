/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacondicional;
import java.util.Scanner;
/**
 *
 * @author gessa
 */
public class EstruturaCondicional {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true){
        
        System.out.println("---- Estrutura condicional! ");
        System.out.println("");
        
        System.out.println("Quantas horas são? ");
        int hora = sc.nextInt();
        
        if ( hora < 12 ){
            System.out.println("Bom dia!");
        }
        else if ( hora < 18 ){
                System.out.println("Boa tarde!");
        } 
        else if ( hora <= 24 ) {
            System.out.println("Boa noite!");       
                   }
        if ( hora > 24 ){
            System.out.println("Hora invalida! Relógio marca até 24 horas. Tente novamente.");
        }
        if ( hora == -1){
            break;
        }
        System.out.println("");
        
        
         
        
        
        
        }
    }
}
