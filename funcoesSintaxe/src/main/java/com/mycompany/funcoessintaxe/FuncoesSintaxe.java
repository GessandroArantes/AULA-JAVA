/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.funcoessintaxe;

import java.util.Scanner;

/**
 * Problema exemplo Fazer um programa para ler três números inteiros e mostrar
 * na tela o maior deles.
 */
public class FuncoesSintaxe {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar entrada do usuário

        System.out.println("Enter three numbers:");
        // Exibe mensagem solicitando três números

        int a = sc.nextInt();
        // Lê o primeiro número digitado

        int b = sc.nextInt();
        // Lê o segundo número digitado

        int c = sc.nextInt();
        // Lê o terceiro número digitado

        if (a > b && a > c) {
        // Verifica se 'a' é maior que 'b' E maior que 'c'
            
            System.out.println("Higher = " + a);
            // Se for verdadeiro, imprime 'a' como o maior número

        } else if (b > c) {
        // Caso 'a' não seja o maior, verifica se 'b' é maior que 'c'
            
            System.out.println("Higher = " + b);
            // Se for verdadeiro, imprime 'b' como o maior número

        } else {
        // Se nenhuma das condições anteriores for verdadeira
            
            System.out.println("Higher = " + c);
            // Então 'c' é considerado o maior número
        }

        sc.close();
        // Fecha o Scanner para liberar recursos (boa prática)
         */

        Scanner sc = new Scanner(System.in);
        // Cria o objeto Scanner para entrada de dados

        System.out.println("Enter three numbers:");
        // Pede para o usuário digitar 3 números

        int a = sc.nextInt();
        // Lê o primeiro número

        int b = sc.nextInt();
        // Lê o segundo número

        int c = sc.nextInt();
        // Lê o terceiro número

        int higher = max(a, b, c);
        // Chama a função max para descobrir o maior número

        showResult(higher);
        // Chama a função para mostrar o resultado

        sc.close();
        // Fecha o Scanner (boa prática)
    }

    public static int max(int x, int y, int z) {
        // Função que retorna o maior entre 3 números

        int aux;
        // Variável auxiliar para guardar o maior valor

        if (x > y && x > z) {
            aux = x;
            // Se x for maior que y e z, então ele é o maior
        } else if (y > z) {
            aux = y;
            // Se y for maior que z, então ele é o maior
        } else {
            aux = z;
            // Caso contrário, z é o maior
        }

        return aux;
        // Retorna o maior valor encontrado
    }

    public static void showResult(int value) {
        // Função para exibir o resultado

        System.out.println("Higher = " + value);
        // Mostra o maior número
    }
}
