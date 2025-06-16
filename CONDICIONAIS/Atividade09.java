package CONDICIONAIS;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade de segundos: ");
        int tempoTotal= sc.nextInt();

        int horas;
        int minutos;
        int segundos;
        sc.close();

        if(tempoTotal >= 3600){ 
         horas =  tempoTotal / 3600;
         tempoTotal = tempoTotal % 3600;
        }else{
            horas = 0;

        }
        if(tempoTotal >= 60){ 
         minutos =  tempoTotal / 60;
         tempoTotal = tempoTotal % 60;
        }else{
            minutos = 0;

        }
        segundos = tempoTotal;


        System.out.println("HH:MM:SS =" + horas + ":" + minutos + ":" + segundos);


    }
    
}
