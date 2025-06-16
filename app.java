import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome : ");
        String nome = sc.nextLine();
        
        sc.close();
        System.out.println("bem vindo(a) " + nome);

    }
}