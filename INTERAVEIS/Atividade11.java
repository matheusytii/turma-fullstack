package INTERAVEIS;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();

         System.out.println("Digite a distanciaKm: ");
        int distanciaKm = sc.nextInt();

         System.out.println("Digite a quantidade de horas: ");
         int qtdHora= sc.nextInt();

        int  custoDeslocamento = distanciaKm * 50; 
        double valorShow = (qtdHora* valorHora) + custoDeslocamento;
        double frete = custoDeslocamento * 0.35;

        System.out.printf("o valor do show: R$ %.2f\n", valorShow);
        System.out.printf("o valor do frete: R$ %.2f", frete);
        sc.close();






    }
}
