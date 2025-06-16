package REPETITIVA;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        
        double somaValorVendas = 0 ;
        double somaValorCusto = 0;


        for( int  i = 0; i < 5; i++){
            System.out.println("Digite o valor da vendas: ");
             double valorVenda = sc.nextDouble();

            somaValorVendas += valorVenda;

            System.out.println("Digite o valor do custo");
             double valorCusto  = sc.nextDouble();

             somaValorCusto += valorCusto;
            

        }
            
          double lucro =  somaValorVendas - somaValorCusto;

         System.out.println("lucro das vendas " + lucro);
         sc.close();
    }
    
}
