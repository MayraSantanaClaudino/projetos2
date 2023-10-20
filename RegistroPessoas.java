import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
		
		String nome;
		String sexo;
		int idade;
		int totalCriancas = 0;
		int totalAdolescente = 0;
		int totalAdulto = 0;
		int totalMelhorIdade = 0;
		String nomeMaisVelha = null;
		int idadeMaisVelha = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i < 4; i++){
		
		System.out.println("Digite o nome do indivíduo" + i + ": ");
		nome = scan.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = scan.nextInt();
		scan = new Scanner(System.in);
		
		if (idade <= 13){
		    System.out.println(nome + " é criança");
                    totalCriancas++;
		} else if (idade <= 20){
		    System.out.println(nome + " é adolescente");
                    totalAdolescente++;
		} else if (idade <= 50){
		    System.out.println(nome + " é adulto");
                    totalAdulto++;
		} else {
		    System.out.println(nome + " é da melhor idade");
                    totalMelhorIdade++;
		}
		
		System.out.println("Digite o sexo: (Feminino ou feminino e Masculino ou masculino)");
		sexo = scan.nextLine();
		
		if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")){
		    System.out.println("Sexo inválido, digite m ou M para Masculino e f ou F para Feminino");
		}
		
		if ( i == 1){
           idadeMaisVelha = idade;
           nomeMaisVelha = nome;
    } else if (idadeMaisVelha < idade){
           idadeMaisVelha = idade;
           nomeMaisVelha = nome;
    }
		
	}
	
	
	
		System.out.println("Total de crianças: " + totalCriancas);
		System.out.println("Total de adolescentes: " + totalAdolescente);
		System.out.println("Total de adultos: " + totalAdulto);
		System.out.println("Total de melhor idade: " + totalMelhorIdade);
		
		System.out.println("O nome do indivíduo mais velho é: " + nomeMaisVelha);
	
  }
}
