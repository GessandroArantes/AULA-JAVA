import java.util.Scanner;

public class Apoio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int qtdNumero = 0;
        double media = 0.0;

        System.out.println("*".repeat(50));
        System.out.println("Leitura de Números Inteiros com Média");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (numero >= 0) {
                soma += numero;
                qtdNumero++;
            } else {
                if (qtdNumero > 0) {
                    media = (double) soma / qtdNumero;
                }

                System.out.println("Soma: " + soma);
                System.out.println("Quantidade: " + qtdNumero);
                System.out.println("Média: " + media);

                break; 
            }
        }

        scan.close();
    }
}