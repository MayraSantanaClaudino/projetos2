import java.util.Scanner;

public class Main
{
        public static void calculaConsumoMedia(int velocidadeVeiculo, float mediakmLitro, int totalHoras){
            int distancia = (velocidadeVeiculo * totalHoras); 
            
            System.out.print("Em "+ totalHoras +" horas o veículo percorrerá " +  distancia);
            System.out.print(" quilômetros e consumirá ");
            //note que aqui estamos formatando as casas decimais com o printf
            //%.2f formata em apenas duas casas decimais
            System.out.printf("%.2f", (distancia /  mediakmLitro));
            System.out.print(" litros.");    
        }
        
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
               
            int velocidadeVeiculo, distancia, totalHoras;
           
            float mediakmLitro, litroTotal; 
           
            System.out.print("Informe a velocidade do veículo em km/h: ");
            velocidadeVeiculo = teclado.nextInt();
    
            System.out.print("Informe a média km/l: ");
            mediakmLitro = teclado.nextFloat();
            
            System.out.println("");
        
            //chamada do procedimento para os calculos modificando apenas 
            //a quantidade de horas
            calculaConsumoMedia(velocidadeVeiculo, mediakmLitro, 5);
            calculaConsumoMedia(velocidadeVeiculo, mediakmLitro, 8);
            calculaConsumoMedia(velocidadeVeiculo, mediakmLitro, 12);
            
        }
}
