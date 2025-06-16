package REPETITIVA;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int valor = sc.nextInt();
        
        //inicializador
        int i = 0;
        

        //criterio de parada
        while (i < 6 ) {
            valor ++;
            System.out.println(valor);

            //Atualiza o contador
            i++;

            sc.close();
           
            
        }

    
        for(  i= 0;  i< 6; i++){
            valor++;
            System.out.println(valor);
        }
        
       
        
    }
}