package MANIPULAÇAO_DE_TEXTO;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       

       
        int qtdLteras = 0;
        for( int j = 0; j < 5; j++ ){;
        System.out.println("Digite uma frase: ");
         String frase = sc.nextLine();
        
        
        
        for( int i = 0;  i < frase.length(); i++){

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                qtdLteras++;

               
            
            }
        }
    }

            System.out.println( "quantas letra tem na frase: " + qtdLteras);
            sc.close();
        }
    }


