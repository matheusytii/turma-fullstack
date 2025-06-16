package CONDICIONAIS;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantidade estoque: ");
        int qtdEstoque = sc.nextInt();
        
        if (qtdEstoque >= 10) {
            System.out.println("Estoque suficiente");
        
        }
        else{
            System.out.println("Produto em falta! Deve ser reabastecido");
        }
        sc.close();

    }
    
}
