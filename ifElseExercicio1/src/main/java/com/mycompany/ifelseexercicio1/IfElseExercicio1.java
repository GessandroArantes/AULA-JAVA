/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelseexercicio1;

/*
Exercício 01
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Exemplos:
Entrada: -10
Saída: NEGATIVO
Entrada: 8
Saída: NAO NEGATIVO
Entrada: 0
Saída: NAO NEGATIVO
*/
import java.util.Scanner;
public class IfElseExercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        while(true){
        System.out.println("---Identificando se o número é Negativo ou Não Negativo!");
        System.out.println("");
        System.out.println("Digite um número para descobrir: ");
        int n = sc.nextInt();
      
        if ( n < 0 ){
            System.out.println("Número " + n + " é Negativo!");
        }
         
        else {
        System.out.println("Número " + n + " é Não Negativo!");
        }
        
        System.out.println("---Digite (sair) para sair do programa ou qualquer tecla para continuar.");
        String sair = sc.next();
        if ( sair.equals("sair")){
            System.out.println("Saindo do programa!");
            break;
        }
            System.out.println("");
        
        
        
        
        
        }   
    }
}
