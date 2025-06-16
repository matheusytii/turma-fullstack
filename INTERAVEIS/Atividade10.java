package INTERAVEIS;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("digite o seu sálario:");
        double salario = sc.nextDouble();
        
        System.out.println("digite as vantegens:");
        double vantagens = sc.nextDouble();
        
        
        System.out.println("digite o descontos:");
        double descontos = sc.nextDouble();

        double salarioLiquido = (salario + vantagens) - descontos;

        System.out.printf("salário líquido: R$ %.2f",salarioLiquido);
        sc.close();


    }
}
