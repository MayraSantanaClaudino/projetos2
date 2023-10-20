import java.util.Scanner;
import java.util.Scanner;

public class App {
    public static String retornaNomeProva(int coluna){
        String provaNome = "";

        switch (coluna) {
            case 0: provaNome = "Prova 1"; break;
            case 1: provaNome = "Trabalho 1"; break;
            case 2: provaNome = "Prova 2"; break;                        
            case 3: provaNome = "Trabalho 2"; break;                        
            default: provaNome = ""; break;
        }
        return provaNome;
    } 

    public static void main(String[] args) {
        String nome[];
        float notas[][];
        Scanner teclado = new Scanner(System.in);

        nome = new String[10] ;
        // [linhas] e [colunas]
        // [x][0] nota prova1
        // [x][1] nota trabalho1
        // [x][2] nota prova2
        // [x][3] nota trabalho2
        notas = new float[10][4];

        String provaNome = null;

        for (int linha = 0; linha < nome.length; linha++) {
            System.out.print("Digite o nome do aluno" + (linha + 1) +": ");
            nome[linha] = teclado.nextLine();
            for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                
                provaNome = retornaNomeProva(coluna);

                System.out.print("Digite a " + provaNome + " do aluno " + nome[linha] +": ");
                notas[linha][0] = teclado.nextFloat();
                teclado.nextLine();
            }
            System.out.println("\n");
        }
    }

}
