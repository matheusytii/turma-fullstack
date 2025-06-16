package INTERAVEIS;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual nome do produto:");
        String produto = sc.nextLine();
        
        
        System.out.println("Qual valor do produto:");
        double valor= sc.nextDouble(); 

        double desconto = valor  - ( valor * 4.5 / 100);

        System.out.printf("O produto %s esta com preço %.2f", produto, desconto);

        sc.close();



    

    }
    
}
