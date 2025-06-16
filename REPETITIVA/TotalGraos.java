package REPETITIVA;

public class TotalGraos {
    public static void main(String[] args) {

        
    

double graos = 1;
        double soma = 0;

        System.out.printf("%-7s %-20s %-30s\n", "Casa", "Qtd de Grãos", "Soma Total");

        for (int casa = 1; casa <= 64; casa++) {
            soma += graos;

            System.out.printf("Casa: %-2d - Qtd: %-18.0f - Soma: %.0f\n", casa, graos, soma);

            graos *= 2;
        }
    }
}