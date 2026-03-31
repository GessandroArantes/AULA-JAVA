/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturarepetitivafor;

import java.awt.BorderLayout;
import java.util.Scanner;



/**
 *
 * @author gessa
 */
public class EstruturaRepetitivaFor {

    public static void main(String[] args) {
        
        
        /*
        for (int i=1; i<5; i++){
            System.out.println("Valor de i: " +i);
        } // base */
        
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("---Digite quantos numeros voce deseja somar! ");
        int n = sc.nextInt();
        
        for (int i=0; i<n; i++){
            System.out.println("Digite o "+(i+1)+"º numero: ");
        int x = sc.nextInt();
            soma = soma + x;
            
        }
        System.out.println("O total da soma e: "+soma);
        
    }
}
