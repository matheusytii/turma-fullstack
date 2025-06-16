package CONDICIONAIS;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso do peixe:");
        double pesoPeixe = sc.nextInt();

        sc.close();

        if (pesoPeixe > 50){
           double pesoExedente  = pesoPeixe - 50;
           double multa  = pesoExedente * 4;
           
           System.out.printf("Excesso: %.2f KG\n", pesoExedente );
           System.out.printf("Multa: R$ %.2f", multa);
        }

        else {
            System.out.println("Peso: ok!!!");
        }
    }

}
