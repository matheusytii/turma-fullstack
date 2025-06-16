package CONDICIONAIS;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("digite a hora inicial");
        int horaInical = sc.nextInt();

        System.out.println("digite a hora final:");
        int horaFinal = sc.nextInt();

        int duracao;

        sc.close();



        if(horaFinal > horaInical){
            duracao = horaFinal - horaInical;

        }else{
            duracao = (24 - horaInical) + horaFinal;
            
        }
        System.out.println("O jogo durou " + duracao + "hrs");
    }
}
