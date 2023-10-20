import java.util.Scanner;
import java.lang.Math;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um texto qualquer: ");
        String nome = teclado.nextLine();

        int qtdeNaoVazios = 0;
        char caractere;

        //realiza a iteracao em todas os caracteres da frase.
        //para cada caractere da frase verifica se o caractere e diferente 
        //de espaco vazio. Se for diferente faz a contagem
        for (int cont = 0; cont < nome.length(); cont++){
            caractere = nome.charAt(cont);
            if (caractere != ' '){
                qtdeNaoVazios++;
            }
        }
        System.out.println("Quantidade de caracteres sem espaco: " + qtdeNaoVazios);
    }
}
