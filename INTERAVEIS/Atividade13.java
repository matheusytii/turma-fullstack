package INTERAVEIS;
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Difite o valor do produto 1: ");
        double produto1 = sc.nextInt();
        
        System.out.println("Difite o valor do produto 2: ");
        double produto2 = sc.nextInt();
        
        System.out.println("Difite o valor do produto 3: ");
        double produto3 = sc.nextInt();

        double resultado = produto3  *  0.50;
        double resultadoFinal = produto1 + produto2 + resultado;
       

        System.out.printf("Valor da compra foi: R$ %.2f", resultadoFinal);

        sc.close();


        
    }
}
