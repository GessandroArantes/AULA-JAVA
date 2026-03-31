/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooexercicio01;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 1 Fazer um programa para ler os valores da largura e altura de um
 * retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e
 * diagonal. Usar uma classe como mostrado no projeto ao lado.
 *
 * Diagrama de Classe: Rectangle Atributos:
 *
 * - Width: double
 *
 * - Height: double
 *
 * Métodos:
 *
 * + Area(): double
 *
 * + Perimeter(): double
 *
 * + Diagonal(): double
 *
 * Exemplo: Entrada:
 *
 * Enter rectangle width and height: 3.00 4.00
 *
 * Saída:
 *
 * AREA = 12.00 PERIMETER = 14.00 DIAGONAL = 5.00
 */
public class PooExercicio01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        
        System.out.println("Enter rectangle width and height:");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        
        sc.close();
    }

}
