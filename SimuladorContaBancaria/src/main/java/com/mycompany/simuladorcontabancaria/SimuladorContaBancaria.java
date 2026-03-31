/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladorcontabancaria;

/**
 *
 * @author gessa
 */

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class SimuladorContaBancaria {


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();

		System.out.print("Digite o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.print("Haverá depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);

		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);

		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		sc.close();
	}
}
