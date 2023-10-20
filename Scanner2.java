import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
           
        int velocidadeVeiculo, distancia, totalHoras;
       
        float mediakmLitro, litroTotal; 
       
        System.out.print("Informe a velocidade do veículo em km/h: ");
        velocidadeVeiculo = teclado.nextInt();

        System.out.print("Informe a média km/l: ");
        mediakmLitro = teclado.nextFloat();
        
        System.out.println("");

        //note que aqui utilizamos uma variavel para armazenar a quantidade
        //de horas, isto permite termos um trecho de código identico para os 
        //casos de 5, 8 e 12 horas. Posteriormente melhoraremos esta repetição 
        //código transformandos em funções ou procedimentos
        totalHoras = 5;
        distancia = (velocidadeVeiculo * totalHoras); 
        System.out.print("Em "+ totalHoras +" horas o veículo percorrerá " +  distancia);
        System.out.println(" quilômetros e consumirá " + (distancia /  mediakmLitro) + " litros.");

        totalHoras = 8;
        distancia = (velocidadeVeiculo * totalHoras); 
        System.out.print("Em "+ totalHoras +" horas o veículo percorrerá " +  distancia);
        System.out.println(" quilômetros e consumirá " + (distancia /  mediakmLitro) + " litros.");
       
        totalHoras = 12;
        distancia = (velocidadeVeiculo * totalHoras); 
        System.out.print("Em "+ totalHoras +" horas o veículo percorrerá " +  distancia);
        System.out.print(" quilômetros e consumirá ");
        //note que aqui estamos formatando as casas decimais com o printf
        //%.2f formata em apenas duas casas decimais
        System.out.printf("%.2f", (distancia /  mediakmLitro));
        System.out.print(" litros.");
        }
}
