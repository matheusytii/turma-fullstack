import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("digite o valor de x: ");
        int num1= sc.nextInt();
        
        System.out.println("digite o valor de y: ");
        int num2= sc.nextInt();
        
        System.out.println("digite o valor de Z: ");
        int num3= sc.nextInt();
        
        sc.close();
        
        double media = (num1 + num2 + num3 ) /3.0;

        System.out.printf(" A media de X e Y eh : %.2f\n", media);
    }
}

    

