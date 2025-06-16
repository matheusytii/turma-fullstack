package REPETITIVA;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
       

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite as  medição: ");
            double med = sc.nextInt();

            if (soma < 110) {
                System.out.println("normal");

            } 
             else if (soma < 125) {
                System.out.println("alterada");

            } else {
                System.out.println("muito alterada");
                
                

            }
            soma += med;

        }
         double resultado = soma / 4;

        System.out.println(" media das leituras : " + resultado);

        sc.close();



    }

}
