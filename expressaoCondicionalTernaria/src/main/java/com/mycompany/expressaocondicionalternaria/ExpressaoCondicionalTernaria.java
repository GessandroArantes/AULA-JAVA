/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
package com.mycompany.expressaocondicionalternaria;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        double preco;
        double desconto;
        
        while(true){
        System.out.println("-" .repeat(50));
        System.out.println("---Descoblindo Descontos.");
        System.out.println("Digite o preço para você saber o desconto: ");
        preco = sc.nextDouble();
        
        if (preco < 100.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        
        System.out.printf("O produto de R$%.2f reais teve desconto de R$%.2f reais.%n", preco, desconto);
        
        
        
        }
    }
}
*/

// versão com expressão condicional ternária
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("-" .repeat(50));
        System.out.println("---Descoblindo Descontos.");
        System.out.println("Digite o preço para você saber o desconto: ");
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        
        System.out.printf("O produto de R$%.2f reais teve desconto de R$%.2f reais.%n", preco, desconto);
        
        
        }
    }
}
