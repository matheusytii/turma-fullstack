package INTERAVEIS;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.println("Digite seu salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double impostoRenda = salarioBruto * 0.05;
        double valorInss =  salarioBruto * 0.11;
        double desconto = impostoRenda + valorInss;
        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("valor do salario liquido: %.2f\n", salarioLiquido);
        System.out.printf("Valor imposto de renda: %.2f\n", impostoRenda );
        System.out.printf("Valor do INSS: %.2f", valorInss);

        sc.close();

    }
    
}
