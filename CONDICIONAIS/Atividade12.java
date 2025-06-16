package CONDICIONAIS;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = sc.nextLine(); 

        System.out.println("Digite a segunda palavra:");
        String palavra2 = sc.nextLine();  

        System.out.println("Digite a terceira palavra:");
        String palavra3 = sc.nextLine();  

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave") ) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("O animal é: Águia");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("O animal é: Pomba");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")){
                    System.out.println("O animal é: Homem");
                } else if (palavra3.equals("herbivoro"))  {
                    System.out.println("O animal é: Vaca");
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("O animal é: Pulga");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("O animal é: Lagarta");
                }
            } else if (palavra2.equals("anelidio")) {
                if (palavra3.equals("heamtofago")){
                    System.out.println("O animal é: Sanguessuga");
                } else if (palavra3.equals("onivoro") ) {
                    System.out.println("O animal é: Minhoca");
                }
            }
        } else {
            System.out.println("Palavras inválidas ou com erro de digitação.");
        }

        sc.close();
    }
}
