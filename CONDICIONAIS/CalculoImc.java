package CONDICIONAIS;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();
        
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        double imc = peso / (altura* altura);
        
        

        sc.close();
    
    if (imc < 20 ){
        System.out.println("Abaixo do peso");
    }

    else if( imc < 25){
        System.out.println("Peso normal");
    }
    else if(imc < 30){
        System.out.println("sobre peso");
    }
    else if(  imc < 40){
        System.out.println("Obeso");
    }
    else{
        System.out.println("Obeso mórbido");
    }
    
    }
}
