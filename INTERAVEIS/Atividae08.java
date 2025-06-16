package INTERAVEIS;
import java.util.Scanner;

public class Atividae08 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);

        System.out.println("quantidade homens presentes:");
        int qtdHomen = sc.nextInt();
        
        
        System.out.println("quantidade mulheres presentes:");
        int qtdMulheres = sc.nextInt();
        
        System.out.println("quantidade ausente:");
        int qtdAusente = sc.nextInt();

        int totalIcrito =  qtdAusente + qtdHomen + qtdMulheres;
        double p1 = (double) qtdHomen / totalIcrito * 100;
        double p2 = (double) qtdAusente / totalIcrito * 100;

        System.out.printf("P1 = %.4f %%", p1);
        System.out.printf("P1 = %.4f %%", p2);
        sc.close();
    }

    
}
