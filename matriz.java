import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    /**
     * Funcao com o objeto de ler os valores da matriz de pontos e calcular
     * o percentual de pontos baseados nas tentativas versus os acertos.
     *
     * @param tentativas matriz contendo nas linhas as jogadas de um mesmo jogador, e 
     * nas colunas a qtde de tentativas de cada tipo de jogada
     * @param pontos matriz contendo nas linhas os pontos de um mesmo jogador, e 
     * nas colunas a qtde de acertos feitos para cada tipo de jogada.
     * @param coluna Identifica qual o tipo de jogada a ser calculada. Este parametro
     * identifica a coluna onde estão armazenados os valores a serem calculados:
     *          0: para a "coluna 0" das jogadas de saque,
     *          1: para a "coluna 1" das jogadas de bloqueio,
     *          2: para a "coluna 2" das jogadas de ataque.

     * @return Retorna um valor float com os pontos calculados com base na coluna informada
     */
    public static float calcularPercentuais(int tentativasPontos[][], int pontos[][], int coluna) {

        int sPontos = 0;
        int sTentativasPontos = 0;

        //calculo % pontos de saque
        for (int jogador = 0; jogador < pontos.length; jogador++) {
            sPontos += pontos[jogador][coluna];
            sTentativasPontos += tentativasPontos[jogador][coluna];
        }

        return ((float)sPontos/sTentativasPontos) * 100;

    }

    public static int lerQuantidadeJogadores(Scanner teclado){
        int qtde=0;
        boolean erro = false;
        do {
            try {
                qtde = teclado.nextInt(); 
                erro = false;
            } catch (InputMismatchException ex){
                System.out.println("Deve ser informado um valor númerico!");
                erro = true;
                teclado.nextLine();
            }
        } while(erro);

        return qtde;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int qtdeJogadores = lerQuantidadeJogadores(teclado);

        //cria o vetor de nomes com a quantidade de jogadores
        String nomes[] = new String[qtdeJogadores];
        //cria a matriz para quardar a quantidade de tentativas 
        //e outra matriz para guardar a quantidade de acertos
        //cada matriz possui 3 colunas e a quantidade de linhas 
        //e definida pela quantidade de jogadores
        int tentativasPontos[][] = new int[qtdeJogadores][3];
        int pontos[][] = new int[qtdeJogadores][3];

        //cria dois vetores para realizar a leitura dos valores
        //na mesma linha
        String linhaTentativas[];
        String linhaPontosMarcados[];

        //realiza a leitura dos dados dos jogaddores
        for (int jogador = 0; jogador < qtdeJogadores; jogador++) {
            //le o nome do jogador
            nomes[jogador] = teclado.nextLine();
           
            //le uma linha com tres valores numericos 
            //para as tentativas de saques, bloqueios e ataques
            linhaTentativas = teclado.nextLine().split(" "); 
            //le uma linha os tres valores com acertos
            linhaPontosMarcados = teclado.nextLine().split(" "); 
            
            //converte os valores lidos pora inteiro
            for (int valor = 0; valor < 3; valor++) {
                tentativasPontos[jogador][valor] = Integer.parseInt(linhaTentativas[valor]);
                pontos[jogador][valor] = Integer.parseInt(linhaPontosMarcados[valor]);
            }
        }
        
        //calcula e imprime os percentuais
        //0 = coluna do saque
        System.out.printf("Pontos de Saque: %.2f %%.",calcularPercentuais(tentativasPontos, pontos, 0));
        //1 = coluna do bloqueio
        System.out.printf("\nPontos de Bloqueio: %.2f %%.",calcularPercentuais(tentativasPontos, pontos, 1));
        //2 = coluna do ataque
        System.out.printf("\nPontos de Ataque: %.2f %%.\n", calcularPercentuais(tentativasPontos, pontos, 2));
    }
}
