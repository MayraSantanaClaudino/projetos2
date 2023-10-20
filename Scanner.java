//importacao da classe que permite usar os métodos
//para leitura de dados do teclado
import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
        //instancia a classe Scanner
        Scanner teclado = new Scanner(System.in);
           
        int velocidadeVeiculo, distancia;
       
        float mediakmLitro, litroTotal; 
       
        System.out.print("Informe a velocidade do veículo em km/h: ");
        //nextInt usa para ler valores inteiros
        velocidadeVeiculo = teclado.nextInt();

        System.out.print("Informe a média km/l: ");
        //nextFloat usa para ler valores fracionários
        mediakmLitro = teclado.nextFloat();
        
        System.out.println("");

        distancia = (velocidadeVeiculo * 5); 
        System.out.print("Em 5 horas o veículo percorrerá " +  distancia);
        //note que aqui realizamos o calculo do consumo direto no println
        System.out.println(" quilômetros e consumirá " + (distancia /  mediakmLitro) + " litros.");

        distancia = (velocidadeVeiculo * 8); 
        //note que aqui optamos para calcular o consumo e armazenar em uma 
        //variavel para depois imprimir no println
        litroTotal = (distancia /  mediakmLitro);
        System.out.print("Em 8 horas o veículo percorrerá " +  distancia);
        System.out.print(" quilômetros e consumirá " + litroTotal + " litros.");
        System.out.println("");
       
        distancia = (velocidadeVeiculo * 12); 
        litroTotal = (distancia /  mediakmLitro);
        System.out.print("Em 12 horas o veículo percorrerá " +  distancia);
        System.out.println(" quilômetros e consumirá " + litroTotal + " litros.");
        System.out.println("");

        }
}
