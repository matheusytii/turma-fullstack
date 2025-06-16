package REPETITIVA;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número de 1 a 9: ");
        numero = sc.nextInt();

        // Correção na condição do while
        while (numero < 1 || numero > 9) {
            System.out.print("Número inválido! Digite novamente: ");
            numero = sc.nextInt();
        }

        String s = """
                Escolha as opções abaixo:
                (1) para soma
                (2) para subtração
                (3) para multiplicação
                (4) para divisão
                """;

        System.out.println(s);
        int opcao = sc.nextInt();

        while (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida! Digite um número de 1 a 4: ");
            opcao = sc.nextInt();
        }

        switch (opcao) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " * " + i + " = " + (numero * i));
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d / %d = %.2f\n", numero, i, (double) numero / i);
                }
                break;
        }

        sc.close(); // boa prática: fechar o Scanner
    }
}
