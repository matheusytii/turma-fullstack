package CONDICIONAIS;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o valor 01");
        int v1 = sc.nextInt();

        System.out.println(" Digite o valor 02");
        int v2 = sc.nextInt();

        System.out.println(" Digite o valor 03");
        int v3 = sc.nextInt();
        sc.close();
        
        int menor;
        int meio;
        int maior;

        

        if (v1 < v2 && v1 < v3) {
            menor = v1;
            if (v2 <=v3) {
                meio = v2;
                maior = v3;
            } else {
                meio = v3;
                maior = v2;
            }
        }

        else if (v2 <= v1 && v2 <= v3) {
            menor = v2;
            if (v1 <= v3) {
                meio = v1;
                maior = v3;
            } else {
                meio = v3;
                maior = v1;
            }
        }

        else {
            menor = v3;
            if (v1 <=v2) {
                meio = v1;
                maior = v2;

            } else {
                meio = v2;
                maior = v1;
            }
        }

        System.out.printf("ordem crescente: %d, %d, %d", menor, meio, maior);

    }

}
