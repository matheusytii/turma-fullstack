package CONDICIONAIS;

import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primerio numero");
        int v1 = sc.nextInt();

        System.out.println("digite o segundo numero");
        int v2 = sc.nextInt();

        System.out.println("digite o terceiro numero");
        int v3 = sc.nextInt();
        
        int maior;
        int menor;

        sc.close();

        if (v1 > v2 && v1 > v3) {
            maior = v1;

        } else if (v2 > v1 && v2 > v3) {
             maior = v2;

        } else {
             maior = v3;
        }
        
        if (v1 < v2 && v1 < v3) {
             menor = v1;

        } else if (v2 < v1 && v2 < v3) {
             menor = v2;

        } else {
             menor = v3;
        }

        System.out.printf("O maior numero: %d\n", maior);
        System.out.printf("O menor numero: %d", menor);

    }
}