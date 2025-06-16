package INTERAVEIS;
import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

     System.out.println("Digite o primeiro valor:");
     int n1 = sc.nextInt();
     
     System.out.println("Digite o segundo  valor:");
     int n2 = sc.nextInt();

    int soma = n1 + n2;
    int sub = n1 -n2;
    double  div = (double) n1 / n2;
    int mult = n1 * n2;

    System.out.printf("resultado da soma: %d\n", soma);
    System.out.printf("resultado da soma: %d\n", sub);
    System.out.printf("resultado da soma: %.1f\n", div);
    System.out.printf("resultado da soma: %d", mult);
    
    sc.close();
    }

}