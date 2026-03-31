package com.mycompany.aulasenai;

import java.util.Scanner;
import java.util.Locale;

public class AulaSenai {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // ================================
        // ENTRADA DE DADOS (IDADE E ALTURA)
        // ================================
        /*
        int idade;
        double altura;

        System.out.println("-".repeat(80));
        System.out.println("---- Insira os valores a seguir ----");

        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();

        System.out.print("Digite sua altura: ");
        altura = scan.nextDouble();

        System.out.println("-".repeat(80));
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        */

        // ================================
        // ESTRUTURA DE DECISÃO (NOTA)
        // ================================
        /*
        System.out.println("-".repeat(80));
        System.out.print("Digite a nota: ");
        double nota = scan.nextDouble();

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota válida!");
            System.out.println("Nota informada: " + nota);
        } else {
            System.out.println("Nota inválida!");
            System.out.println("Digite uma nota entre 0 e 10.");
        }
        */

        // ================================
        // SWITCH - MESES
        // ================================
        /*
        while (true) {
            System.out.println("=".repeat(72));
            System.out.print("Informe o número do mês: ");
            int mes = scan.nextInt();

            switch (mes) {
                case 1: System.out.println("Janeiro"); break;
                case 2: System.out.println("Fevereiro"); break;
                case 3: System.out.println("Março"); break;
                case 4: System.out.println("Abril"); break;
                case 5: System.out.println("Maio"); break;
                case 6: System.out.println("Junho"); break;
                case 7: System.out.println("Julho"); break;
                case 8: System.out.println("Agosto"); break;
                case 9: System.out.println("Setembro"); break;
                case 10: System.out.println("Outubro"); break;
                case 11: System.out.println("Novembro"); break;
                case 12: System.out.println("Dezembro"); break;
                default: System.out.println("Mês inválido!");
            }

            System.out.println("=".repeat(72));
        }
        */

        // ================================
        // FOR
        // ================================
        /*
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nAcabou!");
        */

        // ================================
        // WHILE
        // ================================
        /*
        int i = 0;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\nAcabou!");
        */

        // ================================
        // DO-WHILE
        // ================================
        /*
        int i = 0;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        System.out.println("\nAcabou!");
        */

        // ================================
        // VETORES (ATIVO)
        // ================================
        int notas[] = new int[5];

        // Entrada de dados
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scan.nextInt();
        }

        System.out.println("-".repeat(40));

        // Saída de dados
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        scan.close();
    }
}