package REPETITIVA;

public class GeradorNumero {
    public static void main(String[] args) {
        //Inicializar um contador
        int contador = 2;

        //criterio de parada
        while (contador <= 100) {
            System.out.println(contador);

            //atualizacao contador
            //contador = contador + 2;
            contador += 2;

        }

        for( int i = 2 ; i <=100; i +=2){
            System.out.println(i);
        }
    }
    
}
