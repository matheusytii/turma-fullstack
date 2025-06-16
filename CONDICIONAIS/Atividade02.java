package CONDICIONAIS;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite seu salário");
        double salario = sc.nextDouble();


        sc.close();

        if (salario < 1100){
            salario *= 1.10;  //operador de atribuiçãocom multiplicação
        
        }
        else if ( salario <= 2000){
       salario *= 1.07;
        }
        
        else if ( salario > 2000){
       salario *= 1.05;
        }
System.out.printf("Novo salario: R$ %.2f",salario);
        }
    }

