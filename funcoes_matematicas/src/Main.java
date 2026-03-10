// Define o nome da classe principal do programa
public class Main {
    // Ponto de entrada onde o computador começa a ler o código
    public static void main(String[] args) {
        
        // Reserva espaços na memória para números com vírgula (double) e guarda valores neles
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        // Cria três variáveis (A, B, C) que servirão para guardar os resultados dos cálculos
        double A, B, C;
        
        // --- CÁLCULOS DE RAIZ QUADRADA (Math.sqrt) ---
        
        // Calcula a raiz quadrada de x (3.0) e guarda em A
        A = Math.sqrt(x);
        // Calcula a raiz quadrada de y (4.0) e guarda em B
        B = Math.sqrt(y);
        // Calcula a raiz quadrada do número fixo 25.0 e guarda em C
        C = Math.sqrt(25.0);
        
        // Exibe os resultados das raízes no console (tela)
        System.out.println("Raiz quadrada de "+ x + "=" + A);
        System.out.println("Raiz quadrada de "+ y + "=" + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        
        // --- CÁLCULOS DE POTÊNCIA (Math.pow) ---
        
        // Calcula x elevado a y (3 elevado a 4) e guarda em A
        A = Math.pow(x, y);
        // Calcula y elevado ao quadrado (4 elevado a 2) e guarda em B
        B = Math.pow(y, 2.0);
        // Calcula 5 elevado ao quadrado (5 elevado a 2) e guarda em C
        C = Math.pow(5.0, 2.0);
        
        // Exibe os resultados das potências no console
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        
        // --- CÁLCULOS DE VALOR ABSOLUTO (Math.abs) ---
        
        // O valor absoluto remove o sinal de menos; é a "distância" do número até o zero
        // Pega o valor absoluto de y (4.0 continua 4.0)
        A = Math.abs(y);
        // Pega o valor absoluto de z (-5.0 vira 5.0 positivo)
        B = Math.abs(z);
        
        // Exibe os valores absolutos no console
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
        
        // Lembrete: a biblioteca Math possui muitas outras funções como Seno, Coseno, etc.
    }
}
