package CONDICIONAIS;

import java.util.Scanner;

public class Atividade04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();


        if (valorCompra > 500){
            double desconto =  valorCompra - (valorCompra * 0.10);
            System.out.printf("O valor a pagara: R$ %.2f", desconto);
        }
        else{
            System.out.println("Item não tem desconto!");

            sc.close();
        }
        
    }
}
