import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Informe os números desejado para serem calculados ---");
		System.out.println();
		
		System.out.println("Digite o primeiro número para somar: ");
		int soma1 = sc.nextInt();
		System.out.println("Digite o segundo número para somar: ");
		int soma2 = sc.nextInt();
		int somaResultado = soma1 + soma2;
		System.out.printf("%d + %d = %d%n", soma1, soma2, somaResultado);
		
		System.out.println();
		System.out.println("Digite o primeiro número para subtrair: ");
		int subtrair1 = sc.nextInt();
		System.out.println("Digite o segundo número para subtrair: ");
		int subtrair2 = sc.nextInt();
		int subtrairResultado = subtrair1 - subtrair2;
		System.out.printf("%d - %d = %d%n", subtrair1, subtrair2, subtrairResultado);

		System.out.println();
		System.out.println("Digite o primeiro número para multiplicar: ");
		int multiplicar1 = sc.nextInt();
		System.out.println("Digite o segundo número para multiplicar: ");
		int multiplicar2 = sc.nextInt();
		int multiplicarResultado = multiplicar1 * multiplicar2;
		System.out.printf("%d * %d = %d%n", multiplicar1, multiplicar2, multiplicarResultado);
		
		System.out.println();
		System.out.println("Resultado da Soma: " + somaResultado);
		System.out.println("Resultado da Subtração: " + subtrairResultado);
		System.out.println("Resultado da Multiplicação: " + multiplicarResultado);
		
		sc.close();
		
		
		
		
	}
}
