import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
		int saque = 0;
		int n100 = 0;
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		int n5 = 0;
		
		while (saque <= 0){
		    System.out.println("Digite o valor do saque: ");
		    saque = scan.nextInt();
		}
		
		    System.out.println("QUANTIDADES:");
		    n100 = saque/100;
		    System.out.println("100 reais: " + n100);
		    saque = saque - saque / 100 * 100;
		    
		    n50 = saque / 50;
		    System.out.println("50 reais: " + n50);
		    saque = saque % 50;
		    
		    n20 = saque / 20;
		    System.out.println("20 reais: " + n20);
		    
		    n10 = saque / 10;
		    System.out.println("10 reais: " + n10);
		    
		    n5 = saque / 5;
		    System.out.println("5 reais: " + n5);
		    
	}
	
}
