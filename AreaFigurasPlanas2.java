import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
        public static void main(String[] args) {
        int resposta = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("====== Bem vindo ao Sistema de Cálculo de Área ==========\n\n");
        System.out.print("1 - Trapézio \n");
        System.out.print("2 - Quadrado \n");
        System.out.print("3 - Retângulo \n");
        System.out.print("4 - Círculo \n");
        System.out.print("5 - Triângulo\n\n");
        
        try {
            System.out.print("Digite a opção desejada: ");
            resposta = teclado.nextInt();
        
            System.out.print("\n");
            
            //se o usuario escolheu trapzio
            switch (resposta) {
                case 1:
                    //calculo do trapezio
                    System.out.print("Cálculo de área do trapézio: \n");
                    System.out.print("Digite a altura: ");
                
                    int altura = teclado.nextInt();
                
                    System.out.print("Digite o valor da base maior: ");
                    int baseMaior = teclado.nextInt();
                    
                    System.out.print("Digite o valor da base menor: ");
                    int baseMenor = teclado.nextInt();
                    
                    System.out.print("\nA área do trapézio é: " + ((baseMenor + baseMaior) * altura) / 2);
                    break;
                case  2: 
                    //calculo do quadrado
                    System.out.print("Cálculo de área do quadrado: \n");
                    System.out.print("Digite o valor da lateral: ");
                    int lateral = teclado.nextInt();
                
                    System.out.print("\nA área do quadrado é: " + (lateral * lateral));
                    break;
                case 3: 
                    System.out.print("Cálculo de área do retângulo: \n");
                    System.out.print("Digite o valor da altura: ");
                    altura = teclado.nextInt();
                
                    System.out.print("Digite o valor da largura: ");
                    int largura = teclado.nextInt();
                    
                    System.out.print("\nA área do retângulo é: " + (altura * largura));
                    break;
                case 4:
                    System.out.print("Cálculo de área do círculo: \n");
                    System.out.print("Digite o valor do raio: ");
                    int raio = teclado.nextInt();
                
                    System.out.print("\nA área do círculo é: " + (raio * raio * 3.14f));
                    break;
                case 5:
                    System.out.print("Cálculo de área do triângulo: \n");
                    System.out.print("Digite o valor da base: ");
                    int base = teclado.nextInt();
                
                    System.out.print("Digite o valor da altura: ");
                    altura = teclado.nextInt();
                
                    System.out.print("\nA área do triângulo é: " + (base * altura));
                    break;
                default:
                    System.out.print("Opção inválida.");
            }
        } catch (InputMismatchException ex){
            System.out.print("Opção digitada precisa ser um número: ");
        }
        }
}
