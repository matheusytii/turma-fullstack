package REPETITIVA;

import java.util.Scanner;

public class Hackathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double qtdpontos;
       

        System.out.println("Digite o valor total de compra no mês: ");
        double valorToral = sc.nextDouble();
        
        
        System.out.println("Digite o numero de compras no mês: ");
        int numeroDeConpra = sc.nextInt();


    
     qtdpontos= (int) ( valorToral / 10);
        
    
    if (numeroDeConpra >= 5 ) {
         qtdpontos += 50;
        
    }
    if (valorToral >= 500 ) {
         qtdpontos += 100;
        
    }

    String categoria;

    
    
    if( qtdpontos <= 100){
        categoria ="bronze";

        
        
    }
    else if( qtdpontos <= 300 ){
        categoria = "prata";
      
    }
    else if(qtdpontos <= 500){
        categoria = "ouro";
        
    }
    else{
        categoria = "diamante";
        
    }

    System.out.printf("quantidade de compra no mes: %.2f \n" , valorToral);
    System.out.printf("numero de compra no mes: %d \n" , numeroDeConpra);
    System.out.printf("total de pontos  : %.2f \n" , qtdpontos);
    System.out.printf("categoria: %s\n", categoria);
    System.out.printf("parabéns você alcançou o nivel %s este mês!!", categoria);
        sc.close();
        
        
    }
}



