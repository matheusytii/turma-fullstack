package REPETITIVA;

import java.util.Scanner;

public class Ativiadade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double valor1 = 0 ;
        double valor2 =  0;
        double valor;

        double vendasMaior = 0;
        double vendasMenor = 0;

        while (i < 10) {

            System.out.println("digite 10 valores: ");
            valor = sc.nextDouble();

            valor1 = Math.max(valor, vendasMaior);
            valor2 = Math.min(valor, vendasMenor);

            i++;
        }

        System.out.println("numero maximo" + valor1);
        System.out.println("numero minimo" + valor2);
        sc.close();

    }
}
