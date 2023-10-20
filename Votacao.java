import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int votos = 0;
		int votosA = 0;
		int votosB = 0;
		int votosC = 0;
		int nulos = 0;
		int vencedor = 0;
		String NomeVencedor = null;
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (i < 5){
		    System.out.println("===========MENU DE VOTACAO===========");
		    System.out.println("1 para Candidato A");
		    System.out.println("2 para Candidato B");
		    System.out.println("3 para Candidato C");
		    System.out.println("4 para Nulo");
		    System.out.println("Digite o codigo do voto: ");
		    try {
		        votos = scan.nextInt();
		    } catch (InputMismatchException erro){
		        System.out.println("O valor precisa ser numerico");
		        votos = 0;
		        scan.nextLine();
		    }
		switch (votos) {
		    case 1:
		        votosA++;
		        i++;
		        break;
		    case 2:
		        votosB++;
		        i++;
		        break;
		    case 3:
		        votosC++;
		        i++;
		        break;
		    case 4:
		        nulos++;
		        i++;
		        break;
		    default:
		        System.out.println("Opcao invalida, o codigo nao sera computado");
		        break;
		}
		
	}
	
	if (vencedor < votosA){
	    vencedor = votosA;
	    NomeVencedor = "Candidato vencedor: Candidato A";
	} 
	if (vencedor < votosB){
	    vencedor = votosB;
	    NomeVencedor = "Candidato vencedor: Candidato B";
	} 
	if (vencedor < votosC){
	    vencedor = votosC;
	    NomeVencedor = "Candidato vencedor: Candidato C";
	}
	
	if (vencedor == votosA && vencedor == votosB){
	    NomeVencedor = "Empate entre Candidato A e B";
	} 
	if (vencedor == votosA && vencedor == votosC){
	    NomeVencedor = "Empate entre Candidato A e C";
	}
	if (vencedor == votosB && vencedor == votosC){
	    NomeVencedor = "Empate entre Candidato B e C";
	}
	
	votos = votosA + votosB + votosC;
	int aux = votos * 20;
	System.out.println("Percentual de votos validos: " + aux + "%");
	
	votosA = votosA * 20;
	votosB = votosB * 20;
	votosC = votosC * 20;
	
	System.out.println("Percentual de votos Candidato 1: " + votosA + "%");
	System.out.println("Percentual de votos Candidato 2: " + votosB + "%");
	System.out.println("Percentual de votos Candidato 3: " + votosC + "%");
	System.out.println(NomeVencedor);
	
  }
}
