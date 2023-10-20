import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    public static int escolherOpcao(){
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        
        //constroi o menu de opcoes
        System.out.print("====== Bem vindo ao Sistema de Calculo de Area ==========\n\n");
        System.out.print("1 - Trapezio \n");
        System.out.print("2 - Quadrado \n");
        System.out.print("3 - Retangulo \n");
        System.out.print("4 - Circulo \n");
        System.out.print("5 - Triangulo\n\n");        
        
        System.out.print("Digite a opcao desejada: ");
        
        try {
            opcao = teclado.nextInt();
        } catch (InputMismatchException ex){
            System.out.print("Opção digitada precisa ser um numero: ");
            //bloco de comando
        }
        
        System.out.print("\n");
        return opcao;    
    }
    
    public static void calcularAreaTrapezio(){
        Scanner teclado = new Scanner(System.in);
        //calculo do trapezio
        System.out.print("Calculo de area do trapezio: \n");
        System.out.print("Digite a altura: ");
    
        int altura = teclado.nextInt();
    
        System.out.print("Digite o valor da base maior: ");
        int baseMaior = teclado.nextInt();
        
        System.out.print("Digite o valor da base menor: ");
        int baseMenor = teclado.nextInt();
        
        System.out.print("\nA area do trapezio e: " + ((baseMenor + baseMaior) * altura) / 2);
    }
    
    public static void calcularAreaQuadrado(){
        Scanner teclado = new Scanner(System.in);
        //calculo do quadrado
        System.out.print("Calculo de area do quadrado: \n");
        System.out.print("Digite o valor da lateral: ");
        int lateral = teclado.nextInt();
    
        System.out.print("\nA area do quadrado e: " + (lateral * lateral));
    }

    public static void calcularAreaRetangulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Calculo de area do retangulo: \n");
        System.out.print("Digite o valor da altura: ");
        int altura = teclado.nextInt();
    
        System.out.print("Digite o valor da largura: ");
        int largura = teclado.nextInt();
        
        System.out.print("\nA area do retangulo e: " + (altura * largura));
    }
    
    public static void calcularAreaCirculo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Calculo de area do circulo: \n");
        System.out.print("Digite o valor do raio: ");
        int raio = teclado.nextInt();
    
        System.out.print("\nA area do circulo e: " + (raio * raio * 3.14f));        
    }  
    
    public static void calcularAreaTriangulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Calculo de area do triangulo: \n");
        System.out.print("Digite o valor da base: ");
        int base = teclado.nextInt();
    
        System.out.print("Digite o valor da altura: ");
        int altura = teclado.nextInt();
    
        System.out.print("\nA area do triangulo e: " + (base * altura));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resposta;
        
        //le a opcao desejada
        resposta = escolherOpcao();
    
        //utiliza a estrutura if else para determinar qual opcao foi escolhida e realizar o calculo
        if (resposta == 1) {
            calcularAreaTrapezio();
        } else if (resposta == 2) {
            calcularAreaQuadrado();
        } else if (resposta == 3) {
            calcularAreaRetangulo();
        } else if (resposta == 4) { 
            calcularAreaCirculo();
        } else if (resposta == 5) {
            calcularAreaTriangulo();
        } else {
            System.out.print("Opcao invalida.");
        }
    }
}
