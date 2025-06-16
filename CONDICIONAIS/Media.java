package CONDICIONAIS;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a primeira nota: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double num2 = sc.nextDouble();

        
        double media = (num1 + num2) / 2;
        
        System.out.println("MEDIA DA NOTAS: " + media);
        

        if (media >= 7){
            System.out.println("APROVADO!!");
        } 
        else{
            System.out.println("REPROVADO!!");
        }
        
        sc.close();


    }
    
}
