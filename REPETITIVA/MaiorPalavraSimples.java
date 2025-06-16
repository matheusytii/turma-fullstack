package REPETITIVA;

import java.util.Scanner;  // Importa a classe Scanner para ler entrada do teclado

public class MaiorPalavraSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Cria um objeto Scanner para ler a frase digitada
        System.out.println("Digite uma frase:");

        String frase = teclado.nextLine(); // Lê a frase completa digitada pelo usuário

        // Divide a frase em palavras, usando espaço como separador
        String[] palavras = frase.split(" ");

        String maiorPalavra = ""; // Variável para guardar a maior palavra encontrada

        // Percorre todas as palavras da frase
        for (String palavra : palavras) {
            // Verifica se o tamanho da palavra atual é maior que a maior encontrada até agora
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra; // Se for maior, guarda essa palavra
            }
        }

        // Mostra o resultado final
        System.out.println("Maior palavra = " + maiorPalavra);

        teclado.close(); // Fecha o Scanner para liberar recursos
    }
}
