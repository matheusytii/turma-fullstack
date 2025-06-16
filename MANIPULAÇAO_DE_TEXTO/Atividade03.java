package MANIPULAÇAO_DE_TEXTO;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.println("digite  o nome completo: ");
        String nome = sc.nextLine();

        if(nome.contains("silva") ||  nome.contains("silva ") ){
            System.out.println("esse nome tem silva");
        }
        else{
            System.out.println("esse não tem silva");
        }
        sc.close();

    }
    
}
