package REPETITIVA;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            double valor = sc.nextDouble();
            soma += valor;
        }

        double resultadoMedia = soma / 7;

        System.out.printf("Total de vendas: R$ %.2f\n", soma);
        System.out.printf("Ticket médio: R$ %.2f\n", resultadoMedia);

        sc.close(); 
    }
}
