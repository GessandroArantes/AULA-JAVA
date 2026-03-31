
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite os dados do produto:");

        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();

        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = scanner.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Digite a quantidade de produtos a adicionar no estoque: ");
        int quantidade = scanner.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.print("Digite a quantidade de produtos a remover do estoque: ");
        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        scanner.close();
    }
}
