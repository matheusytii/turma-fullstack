package INTERAVEIS;
import java.util.Scanner;

public class Atividade012 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de apartamento: ");
    int qtdAptos = sc.nextInt();
    
    
    System.out.println("Valor conta de energia: ");
    double valorEnergia = sc.nextDouble();
    
    
    
    System.out.println("valor conta água: ");
    double valorAgua = sc.nextDouble();
    
    double valorTotal =  (valorEnergia + valorAgua) / qtdAptos;
    System.out.printf("valor do rateio - R$ %.2f " , valorTotal);
    
    
    
    sc.close();

 }   
}
