package REPETITIVA;

import java.util.Scanner;

public class Atividade06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a população do país A: ");
        int popA = sc.nextInt();

        System.out.print("Digite a população do país B: ");
        int popB = sc.nextInt();

        if (popA >= popB) {
            System.out.println("A população do país A deve ser menor que a do país B.");
        } else {
            int anos = 0;

            while (popA < popB) {
                popA += popA * 0.03;
                popB += popB * 0.015;
                anos++;
            }

            System.out.println("Quantidade de anos: " + anos);
        }

        sc.close();
    }
}
