package INTERAVEIS;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a primeira nota:");
         double nota1 = sc.nextDouble();
        
        System.out.printf("Digite a segunda nota nota:");
         double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.printf(" O resultado é: %.2f", media);
    sc.close();
    }
}
