public class Program {

	public static void main(String[] args) {

		// --- EXEMPLO 1: Operações básicas com Inteiros ---
		// No Java, operações entre inteiros resultam em inteiros.
		/*
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		*/

		// --- EXEMPLO 2: Promoção Implícita (Casting Automático) ---
		// O Java transforma o 10 (int) em 10.0 (double) automaticamente
		// porque não há perda de informação ao ir para um tipo "maior".
		/*
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		*/

		// --- EXEMPLO 3: Cálculo de Área (Trapézio) ---
		// Uso de double para garantir precisão decimal em fórmulas físicas/matemáticas.
		/*
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		*/

		// --- EXEMPLO 4 (A): O erro da Divisão Inteira ---
		// Mesmo que a variável 'resultado' seja double, o Java faz a conta entre
		// dois 'int' primeiro. 5 / 2 vira 2 (o resto é descartado).
		/*
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = a / b; 
		System.out.println(resultado); // Vai imprimir 2.0
		*/

		// --- EXEMPLO 4 (B): Casting Explícito para Divisão ---
		// Ao colocar (double) antes da variável 'a', você avisa ao Java:
		// "Considere este número como decimal". O resultado agora será 2.5.
		/*
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado); // Vai imprimir 2.5
		*/

		// --- EXEMPLO 5: Casting de "Estreitamento" ---
		// Quando você converte um double para int, o Java "trunca" o número.
		// Ele não arredonda, ele simplesmente joga fora tudo que vem após a vírgula.
		double a;
		int b;
		a = 5.0;
		b = (int) a; // O compilador exige o (int) porque pode haver perda de dados.
		System.out.println(b);
	}
}