package CONDICIONAIS;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a renda do homen:");
        double rendaHomen = sc.nextDouble();
        
        System.out.println("Digite a renda do mulher:");
        double rendaMulher= sc.nextDouble();

        double rendaConjunta = rendaHomen + rendaMulher;
        double aliquota;

        sc.close();
        if( rendaConjunta <= 900 ){
            aliquota  = 0;
        
        }
        else if( rendaConjunta <= 1500 ){
            aliquota = 0.10;
    
        }
        else if( rendaConjunta <= 2500){
            aliquota = 0.15;
        }
        
        else {
            aliquota = 0.25;
            }
            double imposto = rendaConjunta * aliquota ;
            double rendaLiquida = rendaConjunta - imposto;

            System.out.printf("renda conjunta é:%.2f \n", rendaConjunta);
            System.out.printf("percentual de IR %.0f%%\n", aliquota * 100);
            System.out.printf("valor do IR:%.2f\n",imposto );
            System.out.printf("renda liquída:%.2f", rendaLiquida);

    }



    }


