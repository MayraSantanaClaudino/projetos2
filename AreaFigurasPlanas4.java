import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    public static void imprimirTitulo(String palavra){
        System.out.print("Cálculo de área do " + palavra + ": \n");
    }

    public static void imprimirMenu(){
        //constroi o menu de opcoes
        System.out.print("====== Bem vindo ao Sistema de Cálculo de Área ==========\n\n");
        System.out.print("1 - Trapézio \n");
        System.out.print("2 - Quadrado \n");
        System.out.print("3 - Retângulo \n");
        System.out.print("4 - Círculo \n");
        System.out.print("5 - Triângulo\n\n");        
    }

    public static int lerNumeroInteiro(String mensagem){
        //funcao especializada na leitura de um numero inteiro
        Scanner teclado;                

        int leitura = 0;
        boolean deuErro = false;

        //usamos este laco para garantir que o usuário digite um valor
        //inteiro conforme solicitado.
        do {
            System.out.print(mensagem);
            try {        
                //coloquei o new scanner neste ponto, pois o buffer esta
                //ficando sujo quando é gerado uma exception
                teclado = new Scanner(System.in);
                leitura = teclado.nextInt();
                deuErro = false;
            } catch (InputMismatchException erro) {
                System.out.print("Valor inválido, digite novamente.");
                deuErro = true;
            }
        } while(deuErro);
        
        return leitura;  
    }

    public static void exibirCalculo(String palavra, float calculo){
        System.out.printf("\nA área do %s e %f.", palavra, calculo);
    }

    public static void calcularAreaTrapezio(){
        int altura, baseMaior, baseMenor;
        float calculo;
        //calculo do trapezio
        imprimirTitulo("trapezio");
        altura = lerNumeroInteiro("Digite a altura: ");
        baseMaior = lerNumeroInteiro("Digite o valor da base maior: ");
        baseMenor = lerNumeroInteiro("Digite o valor da base menor: "); 
        calculo = ((baseMenor + baseMaior) * altura) / 2;
        
        exibirCalculo("trapézio", calculo);        
    }

    public static void main(String[] args)  throws Exception {
        int resposta = 0;
        Scanner teclado = new Scanner(System.in);
  
        imprimirMenu();

        try {
            //le a opcao desejada
            resposta = lerNumeroInteiro("\nDigite uma das opções disponíveis: ");
            System.out.print("\n");

            //utiliza a estrutura if else para determinar qual opcao foi escolhida e realizar o calculo
            if (resposta == 1) {
                //Todo o calculo necessario para calcular a area do trapezio 
                //colocamos no procedimento calcularAreaTrapezio
                calcularAreaTrapezio();
            } else if (resposta == 2) {
                //Transforme este bloco de comandos para o calculo do quadro 
                /em um procedimento "calcularAreaQuadrado" da mesma forma que fizemos no calcularAreaTrapezio
                imprimirTitulo("quadrado");
                System.out.print("Digite o valor da lateral: ");
                int lateral = teclado.nextInt();
            
                System.out.print("\nA área do quadrado é: " + (lateral * lateral));
            } else if (resposta == 3) {
                //Transforme este bloco de comandos para o calculo do quadro 
                /em um procedimento "calcularAreaRetangulo" da mesma forma que fizemos no calcularAreaTrapezio
                imprimirTitulo("retangulo");
                System.out.print("Digite o valor da altura: ");
                int altura = teclado.nextInt();
            
                System.out.print("Digite o valor da largura: ");
                int largura = teclado.nextInt();
                
                System.out.print("\nA área do retângulo é: " + (altura * largura));
            } else if (resposta == 4) { 
                //Transforme este bloco de comandos para o calculo do quadro 
                /em um procedimento "calcularAreaCirculo" da mesma forma que fizemos no calcularAreaTrapezio
                imprimirTitulo("circulo");
                System.out.print("Digite o valor do raio: ");
                int raio = teclado.nextInt();
            
                System.out.print("\nA área do círculo é: " + (raio * raio * 3.14f));
            } else if (resposta == 5) {
                //Transforme este bloco de comandos para o calculo do quadro 
                /em um procedimento "calcularAreaTriangulo" da mesma forma que fizemos no calcularAreaTrapezio
                imprimirTitulo("triangulo");
                System.out.print("Digite o valor da base: ");
                int base = teclado.nextInt();
            
                System.out.print("Digite o valor da altura: ");
                int altura = teclado.nextInt();
            
                System.out.print("\nA área do triângulo é: " + (base * altura));
            } else {
                System.out.print("Opção inválida.");
            }
        } catch (InputMismatchException ex){
            System.out.print("Opção digitada precisa ser um número: ");
            //bloco de comando
        }
    }
}
