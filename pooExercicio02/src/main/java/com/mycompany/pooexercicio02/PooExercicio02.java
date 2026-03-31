/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooexercicio02;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/*
Exercício 2
Fazer um programa para ler os dados de um funcionário
(nome, salário bruto e imposto). Em seguida, mostrar
os dados do funcionário (nome e salário líquido). Em seguida,
aumentar o salário do funcionário com base em uma porcentagem
dada (somente o salário bruto é afetado pela porcentagem) e mostrar
novamente os dados do funcionário. Use a classe projetada abaixo.

Diagrama de Classe: Employee
Atributos:
- Name: string
- GrossSalary: double
- Tax: double

Métodos:
+ NetSalary(): double
+ IncreaseSalary(percentage: double): void

Exemplo:
Entrada:
Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00

Saída Parcial:
Employee: Joao Silva, $ 5000.00

Interação:
Which percentage to increase salary? 10.0

Saída Final:
Updated data: Joao Silva, $ 5600.00
 */
public class PooExercicio02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        
        System.out.println();
        System.out.println("Updated data: " + emp);
        
        sc.close();
        
    }
}
