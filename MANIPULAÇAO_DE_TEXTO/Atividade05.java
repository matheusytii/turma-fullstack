package MANIPULAÇAO_DE_TEXTO;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto que voce deseja manipular: ");
        String  texto = sc.nextLine();

 String s  = """
                    Escolha as opcões abaixo:
                    (1) Mostre o texto invertido.
                    (2) Mostre o texto em minúsculas.
                    (3) Mostre a segunda frase com as primeiras letras em maiúsculas.
                    (4) Mostre a última frase sem espaço.
                    (5) Mostre a lista de palavras distintas existente no texto (considere os acentos,
                        mas desconsidere a crase) em ordem alfabética
                    (6) Informe quantas frases existe no texto
                    (7) Quantas palavras no total tem o texto (considere as repetidas).
                    (8) Quantos caracteres tem no texto
                    (9) Qual é a posição no texto da palavra Python
                    (10) Junte a primeira frase com a última frase


                    """;
                    System.out.println(s);
                    int opcao = sc.nextLine();

       
       
             switch (1) {
                case 1: System.out.println();
                    
                    break;
             
                default:
                    break;
             }

        sc.close();
    }

}
