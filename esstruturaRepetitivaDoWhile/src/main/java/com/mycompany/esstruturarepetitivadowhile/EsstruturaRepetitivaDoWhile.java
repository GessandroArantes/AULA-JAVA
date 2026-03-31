/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.esstruturarepetitivadowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema exemplo: Fazer um programa para ler uma temperatura em Celsius e
 * mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir
 * (s/n). Caso o usuário digite "s", repetir o programa. Fórmula: f = 9.0 * c /
 * 5.0 + 32.0
 */
public class EsstruturaRepetitivaDoWhile {

    public static void main(String[] args) {
        /*
        // geito mais repetitivo de se fazer
        Locale.setDefault(Locale.US);      
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(50));
        System.out.println("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();
        double f = 9.0 * c / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
        System.out.println("Deseja repetir (s/n)? ");
        char resp = sc.next().charAt(0);

        while (resp != 'n') {
            System.out.println("-".repeat(50));
            System.out.println("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }
         */

        /*
        // geito gambiarra que da certo
        Locale.setDefault(Locale.US);      
        Scanner sc = new Scanner(System.in);
        
        char resp = 's';
        while (resp != 'n') {
            System.out.println("-".repeat(50));
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        }
        */
        // forma adequada de se fazer
       
        Locale.setDefault(Locale.US);      
        Scanner sc = new Scanner(System.in);
        
        char resp;
        do {
        System.out.println("-".repeat(50));
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while (resp == 's');
        
        
        sc.close();

    }
}
