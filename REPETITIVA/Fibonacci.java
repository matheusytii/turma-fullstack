package REPETITIVA;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 1;

        System.out.println("Digite a quantidade de termos: ");
        int termo = sc.nextInt();

        for( int i = 0 ; i< termo; i++){
            System.out.println(a + " ");

            int proximo  = a + b;
            a = b;
            b = proximo;


        }
sc.close();
        
    }
    
}
