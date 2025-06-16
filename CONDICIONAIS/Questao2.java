package CONDICIONAIS;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        
        
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        int resultado;
        

        String s  = """
                    Escolha as opcões abaixo:
                    (1) para soma
                    (2) para subtracão
                    (3) para multiplicação
                    (4) para divisão
                    """;

        System.out.println(s);
        int opcao = sc.nextInt();
        
        
        sc.close();
       
        switch (opcao) {
            case 1: soma = num1 + num2 ;
                resultado = soma;
                System.out.println("A soma dos numero é: " + soma);    
                 if(resultado % 2 == 0){
                    System.out.println( resultado + " é par");
                 }
                 else{
                    System.out.println( resultado + " é impar");
                 }
                 if (resultado > 0 ){
                    System.out.println(resultado + " é positivo");
                 } else{
                    System.out.println(resultado + " é Negativo");
                 }
                break;
            
            case 2: subtracao = num1 - num2 ;
                resultado = subtracao;
                System.out.println("A subtração dos numero é: " + subtracao);    
                 if(resultado % 2 == 0){
                    System.out.println( resultado + " é par");
                 }
                 else{
                    System.out.println( resultado + " é impar");
                 }
                 if (resultado > 0 ){
                    System.out.println(resultado + " é positivo");
                 } else{
                    System.out.println(resultado + " é Negativo");
                 }
                break;
            
            case 3: multiplicacao = num1 * num2 ;
                resultado = multiplicacao;
                System.out.println("A multiplicação dos numero é: " + multiplicacao);    
                 if(resultado % 2 == 0){
                    System.out.println( resultado + " é par");
                 }
                 else{
                    System.out.println( resultado + " é impar");
                 }
                 if (resultado > 0 ){
                    System.out.println(resultado + " é positivo");
                 } else{
                    System.out.println(resultado + " é Negativo");
                 }
                break;
            
            case 4: divisao = num1 / num2 ;
                resultado = divisao;
                System.out.println("A divisão dos numero é: " + divisao);    
                 if(resultado % 2 == 0){
                    System.out.println( resultado + " é par");
                 }
                 else{
                    System.out.println( resultado + " é impar");
                 }
                 if (resultado > 0 ){
                    System.out.println(resultado + " é positivo");
                 } else{
                    System.out.println(resultado + " é Negativo");
                 }
                break;
            
        
            default:
                break;
        }


        
    }
    
}
