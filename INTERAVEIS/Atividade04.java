package INTERAVEIS;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite que curso você deseja: ");
        String curso = sc.nextLine();

        System.out.printf("Qual valor atual do curso: ");
        double valor = sc.nextDouble();

        double novo = valor + (valor * 7.5  / 100);
        System.out.printf(" O seu curso de %s ficou no valor de R$ %.2f", curso, novo);
        sc.close();
    }
}
