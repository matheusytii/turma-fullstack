package CONDICIONAIS;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o sexo (M ou F): ");
        char sexo = sc.next().charAt(0);
        
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double novoSalario = salario;
        double percentual = 0;

        if (idade > 30) {
            if (sexo == 'M' && salario <= 3000) {
                percentual = 0.30;
            } else if (sexo == 'F') {
                percentual = 0.50;
            }
        } else {
            if (sexo == 'F') {
                percentual = 0.40;
            } else if (sexo == 'M') {
                percentual = 0.20;
            }
        }

        novoSalario = salario + (salario * percentual);

        if (percentual == 0) {
            System.out.printf("(0%%) Não recebe aumento\n");
        } else {
            System.out.printf("Novo Salário: R$ %.2f (%.0f%%)\n", novoSalario, percentual * 100);
        }

        sc.close();
    }
}
    

