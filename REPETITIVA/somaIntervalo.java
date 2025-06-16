package REPETITIVA;

import java.util.Scanner;

public class somaIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o peirmeiro numero");
           int numero1 = sc.nextInt();

            System.out.println("Digite o peirmeiro numero");
             int numero2 = sc.nextInt();

            int menorNumero = Math.min(numero1, numero2);
            int maiorNumero = Math.max(numero1, numero2);

            int soma = 0;
            
            for( int j = menorNumero; j <= maiorNumero; i++){
                System.out.println(i + " ");
                soma += j;
            }
            System.out.println("soma =" + soma);
            sc.close();

        }
    }

}
