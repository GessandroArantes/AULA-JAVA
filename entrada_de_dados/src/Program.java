import java.util.Scanner; // Importa a classe Scanner do pacote java.util para permitir a entrada de dados

public class Program {
	public static void main(String[] args) {

		// Exemplo 1: Leitura de uma String (palavra simples)
//		Scanner sc = new Scanner(System.in); // Cria o objeto Scanner associado à entrada padrão (teclado)
//		String x;
//		System.out.println("Digite uma palavra: ");
//		x = sc.next(); // O método .next() lê a entrada até encontrar o primeiro espaço em branco
//		System.out.println("Você digitou: "+ x);
//		
		// Exemplo 2: Leitura de um valor inteiro
//				Scanner sc = new Scanner(System.in);
//				int x;
//				System.out.println("Digite um número inteiro: ");
//				x = sc.nextInt(); // O método .nextInt() lê e converte a entrada para o tipo primitivo int
//				System.out.println("Você digitou: "+ x);
//		
		// Exemplo 3: Leitura de um valor com ponto flutuante (decimal)
//				Scanner sc = new Scanner(System.in);
//				double x;
//				System.out.println("Digite um número decimal: ");
//				x = sc.nextDouble(); // Lê um valor double (usa a vírgula como separador se o sistema estiver em PT-BR)
//				System.out.printf("Você digitou: %.2f%n", x); // Imprime formatado com 2 casas decimais e quebra de linha
//		
		// Exemplo 4: Leitura de um único caractere
//				Scanner sc = new Scanner(System.in);
//				char x;
//				System.out.println("Digite uma letra: ");
//				x = sc.next().charAt(0); // Lê a String digitada e extrai apenas o caractere na posição 0
//				System.out.println("Você digitou: "+ x);

		// Exemplo 2 (Parte Executável): Leitura de múltiplos dados em sequência
//		Scanner sc = new Scanner(System.in); // Instancia o Scanner para ler dados do teclado
//		String x;
//		int y;
//		double z;
//		
//		// As leituras abaixo esperam que os dados sejam digitados na mesma linha ou em linhas diferentes
//		System.out.println("Digite seu nome, idade e altura: ");
//		x = sc.next();     // Lê a primeira palavra e armazena em x
//		y = sc.nextInt();  // Lê o próximo valor inteiro e armazena em y
//		z = sc.nextDouble(); // Lê o próximo valor decimal e armazena em z
//		
//		System.out.println("Dados digitados: ");
//		System.out.println(x); // Exibe o valor da String
//		System.out.println(y); // Exibe o valor do Inteiro
//		System.out.println(z); // Exibe o valor do Double
		
		//Para ler um texto ATÉ A QUEBRA DE LINHA 
//		Scanner sc = new Scanner(System.in); //Cria um objeto Scanner para ler dados digitados pelo usuário
//		String s1, s2, s3; //Declara três variáveis do tipo String
//		s1 = sc.nextLine(); //Lê uma linha inteira digitada pelo usuário e guarda em s1
//		s2 = sc.nextLine(); //Lê outra linha inteira e guarda em s2
//		s3 = sc.nextLine(); //Lê mais uma linha inteira e guarda em s3
//		System.out.println("DADOS DIGITADOS:"); //Mostra uma mensagem na tela
//		System.out.println(s1); //Mostra o conteúdo da variável s1
//		System.out.println(s2); //Mostra o conteúdo da variável s2
//		System.out.println(s3); //Mostra o conteúdo da variável s3
//			
//		ATENÇÃO: quebra de linha pendente //Aviso sobre o problema comum ao misturar nextInt() com nextLine()

	Scanner sc = new Scanner(System.in); //Cria o objeto Scanner para leitura de dados pelo teclado
	int x; //Declara uma variável inteira
	String s1, s2, s3; //Declara três variáveis do tipo String
	System.out.println("Olá, seja Bem Vindo!"); //Mostra uma mensagem de boas-vindas
	x = sc.nextInt(); //Lê um número inteiro digitado pelo usuário
	sc.nextLine(); //Consome a quebra de linha que ficou pendente após o nextInt()
	s1 = sc.nextLine(); //Lê uma linha de texto e armazena em s1
	s2 = sc.nextLine(); //Lê outra linha de texto e armazena em s2
	s3 = sc.nextLine(); //Lê mais uma linha de texto e armazena em s3
	System.out.println("DADOS DIGITADOS:"); //Mostra um título indicando os dados informados
	System.out.println(x); //Mostra o número inteiro digitado
	System.out.println(s1); //Mostra o texto armazenado em s1
	System.out.println(s2); //Mostra o texto armazenado em s2
	System.out.println(s3); //Mostra o texto armazenado em s3
	
		sc.close(); // Encerra o objeto Scanner e libera o recurso de entrada de dados
	}
}