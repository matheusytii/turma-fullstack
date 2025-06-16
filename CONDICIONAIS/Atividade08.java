package CONDICIONAIS;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("digite um valor: ");
        int valor = sc.nextInt();

        int quantidade; 
        sc.close();
        if (valor >= 100){
            quantidade = valor /  100;
            System.out.println(quantidade + " notas de R$ 100");
            valor = valor % 100;
        }
        else{
            System.out.println(" 0 notas de R$ 100");
        }
        
        if (valor >= 50){
            quantidade = valor / 50;
            System.out.println(quantidade + " notas de R$ 50");
            valor = valor % 50;
        }
        else{
            System.out.println(" 0 notas de R$ 50");
        }
        
        
        if (valor >= 20){
            quantidade = valor /  20;
            System.out.println(quantidade + " notas de R$ 20");
            valor = valor % 20;
        }
        else{
            System.out.println(" 0 notas de R$ 20");
        }
        
        if (valor >= 10){
            quantidade = valor /  10;
            System.out.println(quantidade + " notas de R$ 10");
            valor = valor % 10;
        }
        else{
            System.out.println(" 0 notas de R$ 10");
        }
        
        if (valor >= 5){
            quantidade = valor /  5;
            System.out.println(quantidade + " notas de R$ 5");
            valor = valor % 5;
        }
        else{
            System.out.println(" 0 notas de R$ 5");
        }
        
        
        if (valor >= 2){
            quantidade = valor /  2;
            System.out.println(quantidade + " notas de R$ 2");
            valor = valor % 2;
        }
        else{
            System.out.println(" 0 notas de R$ 2");
        }
        
        
        if (valor >= 1){
            quantidade = valor /  1;
            System.out.println(quantidade + " notas de R$ 1");
            valor = valor % 1;
        }
        else{
            System.out.println(" 0 notas de R$ 1");
        }
    
    
    
    
    
    }
    
    
    
    
    
    
    }

