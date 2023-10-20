import java.util.Scanner;

public class App {
        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int nomexx = teclado.nextLine().length(); 
        int qtdeJogadores = teclado.nextInt(); 

        String nomes[] = new String[qtdeJogadores];
        int tentativasPontos[][] = new int[qtdeJogadores][3];
        int Pontos[][] = new int[qtdeJogadores][3];

        //x[0] = "saque"
        //x[1] = "bloqueios"
        //x[2] = "ataques"
        for (int jogador = 0; jogador < qtdeJogadores; jogador++) {
            teclado.nextLine();
            nomes[jogador] = teclado.nextLine();
            tentativasPontos[jogador][0] = teclado.nextInt(); //tentativas de saque
            tentativasPontos[jogador][1] = teclado.nextInt(); //tentativas de bloqueios
            tentativasPontos[jogador][2] = teclado.nextInt(); //tentativas de ataque
            
            Pontos[jogador][0] = teclado.nextInt(); //pontos de saque
            Pontos[jogador][1] = teclado.nextInt(); //pontos de bloqueios
            Pontos[jogador][2] = teclado.nextInt(); //pontos de ataque
        }

        int sPontosSaque = 0;
        int sTentativasPontosSaque = 0;

        //calculo % pontos de saque
        for (int jogador = 0; jogador < qtdeJogadores; jogador++) {
            sPontosSaque += Pontos[jogador][0];
            sTentativasPontosSaque += tentativasPontos[jogador][0];
        }

        System.out.printf("Pontos de Saque: %.2f %%.", ((float)sPontosSaque / sTentativasPontosSaque) * 100);

        //int sPontosBloqueio = 0;
        //int sTentativasPontosBloqueio = 0;

        // for (int jogador = 0; jogador < qtdeJogadores; jogador++) {
            
        // }

        // int sPontosAtaque = 0;
        // int sTentativasPontosAtaque = 0;

        // for (int jogador = 0; jogador < qtdeJogadores; jogador++) {
            
        // }

        }
}
