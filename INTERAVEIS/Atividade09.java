package INTERAVEIS;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite o valo do salário-mínimo:");
     double salario = sc.nextDouble();
     
     System.out.println("Digite a quantidade de quilwatt:");
     int consumo = sc.nextInt();

     double quilwatt = salario / 1000;
     double conta = quilwatt * consumo;
     double desconto = conta * 0.85;

     System.out.printf("valor de KW: R$ %.3f \n", quilwatt);
     System.out.printf("valor da conta: R$ %.2f\n", conta);
     System.out.printf(" valor com desconto: R$ %.2f\n", desconto );

     sc.close();





     

    }
}
