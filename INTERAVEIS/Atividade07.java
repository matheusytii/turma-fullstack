package INTERAVEIS;
import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor do salário:");
        double  salario = sc.nextDouble();
        
        
        System.out.println("Digite o total de vendas:");
        double totVendas = sc.nextDouble();


        double valorFinal = salario + ( totVendas * 15 / 100) ;

        System.out.printf(" o sua comissão é %.2f", valorFinal );

    sc.close();
    }
    
}