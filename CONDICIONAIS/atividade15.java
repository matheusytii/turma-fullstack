package CONDICIONAIS;

import java.util.Scanner;

public class atividade15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o bairro (S, I ou T): ");
        char bairro = sc.next().charAt(0);
        System.out.print("Digite a renda: ");
        double renda = sc.nextDouble();
        System.out.print("Digite o consumo: ");
        double consumo = sc.nextDouble();

        if (renda < 0 || consumo < 0) {
            System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
        } else {
            double desconto = 0;

            if (bairro == 'S') {
                if (renda >= 50 && renda <= 500) {
                    desconto = 50;
                } else if (renda > 500 && renda <= 1000) {
                    desconto = 25;
                }
            } else if (bairro == 'I') {
                if (renda >= 240 && renda <= 1000) {
                    desconto = 240;
                } else if (renda > 1000 && renda <= 5000) {
                    desconto = 120;
                }
            } else if (bairro == 'T') {
                if (renda > 5000 && renda <= 10000) {
                    desconto = 720;
                } else if (renda > 10000 && renda <= 20000) {
                    desconto = 360;
                }
            } else {
                System.out.println("BAIRRO INVÁLIDO");
                sc.close();
                return;
            }

            double valorPagar = consumo - desconto;
            System.out.printf("Valor a pagar: R$ %.0f\n", valorPagar);
        }

        sc.close();
    }
}
    

