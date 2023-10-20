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
            } else if (resto == 0 ) {
                //quando o resto e 0 o valor é par
                System.out.println("Valor digitado é par.");
            } else {
                //quando o resto é diferente de 0 o valor é impar
                //resto 1 por exemplo
                System.out.println("Valor digitado é impar.");
            }
    
            //aqui testamos se o número é positivo ou negativo
            //mas veja que quando o valor digitado for 0 o computador ira 
            //testar se o valor < 0 e depois valor > 0
            //para esta situacao e melhor nem realizar este teste
            //veja a outra implementacao
            if (valor < 0) {
                System.out.println("Valor digitado é negativo.");
            } else if (valor > 0) {
                System.out.println("Valor digitado é positivo.");
            }
        } catch(InputMismatchException ex) {
            System.out.println("O valor precisa ser um número.");
        }        
    }
}
