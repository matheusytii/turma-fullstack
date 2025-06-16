package INTERAVEIS;
import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual a quantidade de horas trabalhada: ");
        double qtdHoras = sc.nextDouble();
        
        
        System.out.printf("Qual valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salario = qtdHoras * valorHora;
        
        System.out.printf(" O salário a receber é :R$ %.2f" , salario);
        sc.close();

    }
}
