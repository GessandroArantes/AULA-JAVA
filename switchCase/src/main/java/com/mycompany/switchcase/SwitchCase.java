
/* Versão com if e else.
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        System.out.println("---Dias da semana");
        System.out.println("");
        System.out.println("Digite o nùmero referente ao dia de semana desejado: ");
        int x = sc.nextInt();
        String dia;
        
        if (x == 1) {
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } 
        else if (x == 3) {
            dia = "terca";
        } 
        else if (x == 4) {
            dia = "quarta";
        } 
        else if (x == 5) {
            dia = "quinta";
        } 
        else if (x == 6) {
            dia = "sexta";
        } 
        else if (x == 7) {
            dia = "sabado";
        } 
        else {
            dia = "valor invalido";
        }
        
        System.out.println("Dia da semana: " + dia);
        
        }
    }
} */


// Versão com SwitchCase
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        System.out.println("-".repeat(50));
        System.out.println("---Dias da semana");
        System.out.println("");
        System.out.println("Digite o nùmero referente ao dia de semana desejado: ");
        int x = sc.nextInt();
        String dia;
        
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        
        System.out.println("Dia da semana: " + dia);
        
        }
    }
}
