package CONDICIONAIS;

import java.util.Scanner;

public class Atividade10 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);


    System.out.println("Digite quantos dias: ");
    int dias = sc.nextInt();


    int anos = 0, meses = 0;

    if (dias >= 365){
         anos = dias /365;
         dias = dias % 365;
    }else{
        anos  = 0;
    }
    if (dias >= 30){
        meses = dias / 30;
        dias=  dias % 30 ;

    }else{
        meses = 0;

    }

    System.out.println(anos + " anos");
    System.out.println(meses + " mês");
    System.out.println( dias + " ias");

    sc.close();
}
}
