/*
 * Comentário padrão criado pelo NetBeans
 */

package com.mycompany.exercicio4sobreestruturaseguencial; // pacote do projeto

import java.util.Scanner; // importa a classe Scanner para ler dados do teclado

/**
 * Classe principal do programa
 * @author gessa
 */
public class Exercicio4SobreEstruturaSeguencial {

    public static void main(String[] args) { // método principal onde o programa inicia

        Scanner sc = new Scanner(System.in); // cria objeto Scanner para leitura de dados

        // lê a hora inicial do jogo digitada pelo usuário
        int horaInicial = sc.nextInt();

        // lê a hora final do jogo digitada pelo usuário
        int horaFinal = sc.nextInt();

        int duracao; // variável que armazenará a duração do jogo

        // se a hora inicial for menor que a hora final
        if (horaInicial < horaFinal) {
            // calcula a duração normalmente
            duracao = horaFinal - horaInicial;
        }
        else {
            // caso o jogo passe da meia-noite
            duracao = 24 - horaInicial + horaFinal;
        }

        // mostra o resultado na tela
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close(); // fecha o Scanner
    }
}