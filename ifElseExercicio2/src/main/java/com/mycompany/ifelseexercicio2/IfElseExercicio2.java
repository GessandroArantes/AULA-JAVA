/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelseexercicio2;
import java.util.Scanner;
/* Exercício 02
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
Exemplos:
Entrada:12
Saída PAR
Entrada: -27
Saída IMPAR
Entrada: 0 
Saída: PAR */

public class IfElseExercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        while(true){
        System.out.println("Identificando nùmeros pares e impares");
        System.out.println("");
        System.out.println("Digite um número para descobrir:");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Número "+numero+" é PAR.");
            
        }
        else {
            System.out.println("Número "+numero+" é IMPAR");
            
        }
        
        
        } 
    }
}

