import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + "METROS");
		System.out.printf("RESUTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}

/*
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		
		// Declaração de variáveis com diferentes tipos de dados
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		// Impressões básicas e formatação inicial (usando padrão do sistema)
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		// Configuração do Locale para padrão Americano (ponto como separador)
		Locale.setDefault(Locale.US);
		
		// Impressões após a mudança do Locale
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + "METROS");
		
		// Uso de printf com placeholders (marcadores de posição)
		System.out.printf("RESUTADO = %.2f metros%n", x);
		
		// %s para String, %d para Inteiro e %.2f para Double com 2 casas
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}
*/