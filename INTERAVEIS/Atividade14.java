package INTERAVEIS;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do emprestimo: ");
        double emprestimo = sc.nextDouble();
        
        System.out.println("digite a quantidade de mês que você deseja:");
        int mes = sc.nextInt();

        double juros = emprestimo * 0.05 * mes;
        double total = emprestimo + juros;

        System.out.printf("Total a ser pago: %.2f",total );
        sc.close();

    }
    
}
