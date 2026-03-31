/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operadoresbitwise;

import java.util.Scanner;

/**
 *
 * @author gessa
 */
public class OperadoresBitwise {

    public static void main(String[] args) {
        System.out.println("Operadores Bitwise!");
        /*
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
         */
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }
        sc.close();

    }
}
