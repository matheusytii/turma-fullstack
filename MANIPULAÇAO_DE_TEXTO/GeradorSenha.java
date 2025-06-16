package MANIPULAÇAO_DE_TEXTO;

import java.util.Scanner;

public class GeradorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();

        while (senha.length() < 10) {
            System.out.println("senha incorreta! digite novamente: ");
            senha =sc.nextLine();

        }
        sc.close();

        int numeroCaracteres = senha.length();

        int indiceMeio = numeroCaracteres / 2 ;

        String primeiraParte = senha.substring(0, indiceMeio);
        String segundaParte = senha.substring(indiceMeio);

        String doisPrimeirosSegParte = segundaParte.substring(0,2);
        String TresUltimosPrimParte = primeiraParte.substring(primeiraParte.length()-3);

        String senhaFinal = doisPrimeirosSegParte + "%%" + TresUltimosPrimParte;

        System.out.println("parte 1" + primeiraParte);
        System.out.println("parte 2" + segundaParte);
        System.out.println("parte 3" + senhaFinal);

    }
    
}
