package REPETITIVA;

import java.util.Scanner;

public class RepeticaoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero positivo maior que zero: ");
        double numero = sc.nextDouble();

        while (numero <= 0) {
            System.out.println("Digite uma numero positivo maior que zero: ");
            numero = sc.nextDouble();
        }

        System.out.println("numero é valido");
        sc.close();
    }
}