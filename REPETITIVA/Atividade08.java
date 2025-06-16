package REPETITIVA;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double veichleMaior = 0;
        double veichleMenor = 0;
        double velocidade1 = 0;
        double ano1 = 0;
        
        
        
        for(i = 0; i < 6; i++){

            System.out.println("Digite o ano do seu carro");
            double ano = sc.nextDouble();       

            ano1 += ano;
           
            
            System.out.println("Digite a veloidade do seu carro");
            double velocidade = sc.nextDouble();

            velocidade1 += velocidade;


             ano1 = Math.max(ano,veichleMaior);
             
             velocidade1= Math.min(velocidade,veichleMenor);
                i++;
 }
        System.out.println("ano mais novo" + ano1);
        System.out.println("ano mais novo" + velocidade1);


    }
}
