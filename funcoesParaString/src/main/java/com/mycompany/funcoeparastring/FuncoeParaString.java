/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.funcoeparastring;

/**
 * Checklist • Formatar: toLowerCase(), toUpperCase(), trim() • Recortar:
 * substring(inicio), substring(inicio, fim) • Substituir: Replace(char, char),
 * Replace(string, string) • Buscar: IndexOf, LastIndexOf • str.Split(" ")
 */
public class FuncoeParaString {

    public static void main(String[] args) {
        // Método principal: ponto de entrada do programa

        /*
        String original = "abcde FGHIJ ABC abc DEFG "; 
        // Cria uma String com letras maiúsculas, minúsculas e espaço no final

        String s01 = original.toLowerCase(); 
        // Converte todos os caracteres da String para minúsculo

        String s02 = original.toUpperCase(); 
        // Converte todos os caracteres da String para maiúsculo

        String s03 = original.trim(); 
        // Remove espaços em branco do início e do fim da String

        String s04 = original.substring(2); 
        // Retorna uma nova String a partir do índice 2 até o final

        String s05 = original.substring(2, 9); 
        // Retorna uma parte da String do índice 2 até o 8 (9 não incluído)

        String s06 = original.replace('a', 'x'); 
        // Substitui todas as ocorrências do caractere 'a' por 'x'

        String s07 = original.replace("abc", "xy"); 
        // Substitui todas as ocorrências da palavra "abc" por "xy"

        int i = original.indexOf("bc"); 
        // Retorna o índice da primeira ocorrência da sequência "bc"

        int j = original.lastIndexOf("bc"); 
        // Retorna o índice da última ocorrência da sequência "bc"

        System.out.println("Original: -" + original + "-"); 
        // Imprime a String original (com "-" para mostrar espaços)

        System.out.println("toLowerCase: -" + s01 + "-"); 
        // Imprime a String convertida para minúsculo

        System.out.println("toUpperCase: -" + s02 + "-"); 
        // Imprime a String convertida para maiúsculo

        System.out.println("trim: -" + s03 + "-"); 
        // Imprime a String sem espaços nas extremidades

        System.out.println("substring(2): -" + s04 + "-"); 
        // Imprime a substring a partir do índice 2

        System.out.println("substring(2, 9): -" + s05 + "-"); 
        // Imprime a substring do índice 2 até 8

        System.out.println("replace('a', 'x'): -" + s06 + "-"); 
        // Imprime a String com 'a' substituído por 'x'

        System.out.println("replace('abc', 'xy'): -" + s07 + "-"); 
        // Imprime a String com "abc" substituído por "xy"

        System.out.println("Index of 'bc': " + i); 
        // Imprime a posição da primeira ocorrência de "bc"

        System.out.println("Last index of 'bc': " + j); 
        // Imprime a posição da última ocorrência de "bc"
         */
        //Operação split
        String s = "potato apple lemon orange";
// Cria uma String com várias palavras separadas por espaço

        String[] vect = s.split(" ");
// O método split(" ") divide a String sempre que encontrar um espaço (" ")
// Resultado: um array (vetor) de Strings
// vect = ["potato", "apple", "lemon", "orange"]

        System.out.println(vect[0]);
// Imprime o primeiro elemento do vetor
// Saída: potato

        System.out.println(vect[1]);
// Imprime o segundo elemento
// Saída: apple

        System.out.println(vect[2]);
// Imprime o terceiro elemento
// Saída: lemon

        System.out.println(vect[3]);
// Imprime o quarto elemento
// Saída: orange

    }
}
