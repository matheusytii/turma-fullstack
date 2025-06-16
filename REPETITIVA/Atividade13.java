package REPETITIVA;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media;
        double nota1;
        double nota2;
        System.out.println("Digite nota 01");
            nota1 = sc.nextDouble();
         
         while ( nota1 < 0 || nota1 > 10 ) {

            System.out.println( "nota invalida");
            System.out.println("Digite nota 01");
            nota1 = sc.nextDouble();
            
         }
        System.out.println("Digite nota 02");
            nota2 = sc.nextDouble();
         
         while ( nota2 < 0 || nota2 > 10 ) {
            

            System.out.println( "nota invalida");

            System.out.println("Digite nota 02");
             nota2 = sc.nextDouble();
            
         }

         media  = (nota1 + nota2)/ 2;

         System.out.println("nota1 = " + nota1);
         System.out.println("nota 2 = " + nota2);
         System.out.println("MEDIA = " + media);

         sc.close();

    }
    
}
