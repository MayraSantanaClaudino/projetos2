//faça um algoritmo que seja capaz de ler um número e 
//classifica-lo como neutro, impar e par
//positivo e negativo
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        int resto;
        
        try {
            System.out.print("Digite um valor: ");
            valor = teclado.nextInt();
            
            //descobrimos o resto da divisao inteira do numero por 2
            resto = (valor % 2);
            
            //aqui testamos apenas se o numero é neutro, par ou impar
            if (valor == 0) {
                System.out.println("Valor digitado é neutro.");
            } else {
                //verifica se o numero e par ou impar
                if (resto == 0) {
                    //quando o resto e 0 o valor é par
                    System.out.println("Valor digitado é par.");
                } else {
                    //quando o resto é diferente de 0 o valor é impar
                    //resto 1 por exemplo
                    System.out.println("Valor digitado é impar.");
                }
                
                //verifica se o numero e positivo ou negativo
                if (valor < 0) {
                    System.out.println("Valor digitado é negativo.");
                } else  {
                    //compare com a versao 1 e veja que agora podemos utilizar 
                    //um simples else para o caso do valor positivo
                    //pois nesta implementacao so existe esta posibilidade
                    System.out.println("Valor digitado é positivo.");
                }
            }
        } catch(InputMismatchException ex) {
            System.out.println("O valor precisa ser um número.");
        }        
    }
}
