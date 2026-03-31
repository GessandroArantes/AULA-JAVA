/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooexercico03;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos
três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35
cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno
está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para
o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma
classe Student para resolver este problema.

Exemplos:
Caso 1 (Aprovado):
Entrada:
Alex Green
27.00
31.00
32.00

Saída:
FINAL GRADE = 90.00
PASS

Caso 2 (Reprovado):
Entrada:
Alex Green
17.00
20.00
15.00

Saída:
FINAL GRADE = 52.00
////FAILED
MISSING 8.00 POINTS
 */
public class PooExercico03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("Enter the student's name and 3 grades to see if they passed.");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n",  student.finalGrade());
        
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        
        sc.close();
    }
}

