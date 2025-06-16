package CONDICIONAIS;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        
        char conceito = ' ';

        if (nota >= 9 ) {
            conceito = 'A';
        } else if (nota >= 8 &&  nota < 9) {
             conceito = 'B';
        } else if (nota >= 7 && nota < 8) {
             conceito = 'C';
        } else {
             conceito = 'D';
        }

        switch (conceito) {
            case 'A':
             System.out.println("parabéns");
                break;
            case 'B':
             System.out.println("Muito bem");
                break;
            case 'C':
             System.out.println("Quase la...");
                break;
            case 'D':
             System.out.println(" lascou-se");
                break;
        
            default:
                System.out.println("conceito vazio!");

               
            
        }

        sc.close();
    }

}
