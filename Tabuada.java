import java.util.Scanner;
import java.lang.Math;
import java.lang.ArithmeticException;

public class Main { 
    public static int obterValor(){
        Scanner teclado = new Scanner(System.in);
        
        //exemplo de um procedimento que nao recebe valores do programa principal
        System.out.print("Digite um numero para o calculo da tabuada de soma, subtração, multiplicação e divisão: ");
        
        return teclado.nextInt();
    }
    
    public static String exibirSomaSubtracao(int valor, int calculo){
        //exemplo de um procedimento que recebe valores do programa principal
        String mensagem;
        
        mensagem = valor + " + " + calculo + " = " + Math.abs(valor + calculo) + "         ";
        mensagem += valor + " - " + calculo + " = " + Math.abs (valor - calculo);
        
        return mensagem;
    }
    
    public static String exibirMultiplicaoDivisao(int valor, int calculo){
        //tratando a divisão por 0 com um if else
        String msg;
        
        if(calculo == 0){
            msg = valor + " * " + calculo + " = " + Math.abs(valor * calculo) + "         Não existe divisao por 0\n";    
        } else {
            msg = valor + " * " + calculo + " = " + Math.abs(valor * calculo) + "         ";
            msg +=  valor + " / " + calculo + " = " + String.format("%.2f",Math.abs(valor / (float) calculo)) + "\n";
        }
        
        return msg;
    }
    
    public static void main(String[] args) {
       
        String mensagem;

        int numero = obterValor();
    
        if (numero <= 0){
            System.out.println("Valor nao pode ser negativo ou 0");
        } else {
            System.out.println("\nSoma              Subtracao\n");
            
            mensagem = exibirSomaSubtracao(numero,0);
            System.out.println( mensagem );
            
            mensagem = exibirSomaSubtracao(numero,2);
            System.out.println( mensagem );
            
            System.out.println( exibirSomaSubtracao(numero,1) );
            System.out.println( exibirSomaSubtracao(numero,3) );
            System.out.println( exibirSomaSubtracao(numero,4) );
            System.out.println( exibirSomaSubtracao(numero,5) );
            System.out.println( exibirSomaSubtracao(numero,6) );
            System.out.println( exibirSomaSubtracao(numero,7) );
            System.out.println( exibirSomaSubtracao(numero,8) );
            System.out.println( exibirSomaSubtracao(numero,9) );
            

            System.out.println("\nMultiplicacao     Divisao\n");
            System.out.print( exibirMultiplicaoDivisao(numero,0) );
            System.out.print( exibirMultiplicaoDivisao(numero,1) );
            System.out.print( exibirMultiplicaoDivisao(numero,2) );
            System.out.print( exibirMultiplicaoDivisao(numero,3) );
            System.out.print( exibirMultiplicaoDivisao(numero,4) );
            System.out.print( exibirMultiplicaoDivisao(numero,5) );
            System.out.print( exibirMultiplicaoDivisao(numero,6) );
            System.out.print( exibirMultiplicaoDivisao(numero,7) );
            System.out.print( exibirMultiplicaoDivisao(numero,8) );
            System.out.print( exibirMultiplicaoDivisao(numero,9) );
        }
    }
}
