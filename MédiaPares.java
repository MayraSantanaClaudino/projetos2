import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int somaPar = 0, numero;
        int qtdePar = 0;
        String listaNumPares = "";

        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite o valor " + contador + ": ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                somaPar = somaPar + numero;
                qtdePar++;

                // montagem da string com a lista de numeros
                // pares separados por virgula para imprimirmos
                // posteriormente quais foram os numeros pares
                if (qtdePar == 1) 
                    // Quando for o primeiro numero parte descoberto
                    // adiciona na lista de numeros sem a virgula
                    listaNumPares += numero;
                 else 
                    listaNumPares += ", " + numero;
            }
        }

        if (listaNumPares.equals(""))
            System.out.printf("Nao temos media final pois nao foram digitados valores pares.");
        else
            System.out.printf("A media final dos numeros %s é: %.2f", listaNumPares, ((float) somaPar / qtdePar));
    }
}
