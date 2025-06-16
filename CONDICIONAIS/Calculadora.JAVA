package CONDICIONAIS;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        


        System.out.println("Digite um numero de 1 a 9: ");
        int num1 = sc.nextInt();
        

        while(nuemro <= 0 && nuemro > 10  ){
            System.out.print("numero invalido! digite novamente ")
            num1  = sc.nextLine();
        }   
         
    
      String s  = """
                    Escolha as opcões abaixo:
                    (1) para soma
                    (2) para subtracão
                    (3) para multiplicação
                    (4) para divisão
                    """;

        System.out.println(s);
        int opcao = sc.nextInt();
        
        
       
       while(opcao < 1  || opcao > 4){
        System.out.println("digite novamente um ")
        int opcao = sc.nextInt();

       }
        switch (opcao) {
            case 1: 
            for( int i = 1; i <= 10; i++ ){
                
                
            
               break;  
                
            }
                 }
                 
               

    }
}
           