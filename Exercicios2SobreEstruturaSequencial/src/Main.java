import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, pi = 3.14159;

        System.out.println("---- Calculando a Área do Círculo ----");
        System.out.println();
        System.out.print("Digite o valor do raio (ex: 50.0): ");

        R = sc.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}