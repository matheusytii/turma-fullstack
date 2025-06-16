package INTERAVEIS;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual foi sua distancia percorrida:");
        double distancia = sc.nextDouble();

        System.out.println("quantos litros voce gastou: ");
        double qtdLitros = sc.nextDouble();

        double medio = distancia / qtdLitros;
        
        System.out.printf("O consumo médio do automóvel é : %.3f KM/L", medio);

        sc.close();
    }
}
