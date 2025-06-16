package REPETITIVA;

import java.util.Scanner;

public class hackathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
            System.out.println("Digite o nome do funcionario: ");
            String nome = sc.nextLine();
            

            String s = """
                    1 - Estagiário,
                    2 - Junior,
                    3 - Pleno,
                    4 - Sênior
                    """;
            System.out.println(s);

            System.out.println("digite seu nivel: ");
            int num = sc.nextInt();

            System.out.println("digite o salario bruto");
            double salarioBrunto = sc.nextDouble();

            double inss = 0;
            double ir = 0;
            String cargonome = "";

            switch (num) {
                case 1:
                    inss = salarioBrunto * 0.05;
                    ir = 0;
                    cargonome = "Estagiario";
                    break;
                case 2:
                    inss = salarioBrunto * 0.07;
                    ir = salarioBrunto * 0.02;
                    cargonome = "junior";
                    break;
                case 3:
                    inss = salarioBrunto * 0.09;
                    ir = salarioBrunto * 0.05;
                    cargonome = "pleno";
                    break;
                case 4:
                    inss = salarioBrunto * 0.11;
                    ir = salarioBrunto * 0.07;
                    cargonome = "sênior";
                    break;

                default:
                    System.out.println("conceito vazio");

            }
            double salarioLiquido = salarioBrunto - inss - ir;
            double somaDesconto = inss + ir;

            System.out.printf("=== holerite === \n");
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Cargo: %s\n", cargonome);
            System.out.printf("Salario bruto: %.2f\n", salarioBrunto);
            System.out.printf("Valor total de desconto: %.2f  (INSS: R$ %.2f | IR: R$: %.2f) \n", somaDesconto, inss,ir);
            System.out.printf("salario liquido: %.2f", salarioLiquido);
sc.close();
        }
       

    

    }

