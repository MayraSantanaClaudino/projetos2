import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float frente, lateral, valorMetro, difLateralFrente, valorTotal, precofinal;
        
        System.out.print("Quantos metros o terreno possui de frente: ");
        frente = teclado.nextFloat();

        System.out.print("Quantos metros o terreno possui de lateral: ");
        lateral = teclado.nextFloat();

        System.out.print("Informe o valor do metro quadrado: ");
        valorMetro = teclado.nextFloat();

        difLateralFrente = Math.abs(frente - lateral);
        //garantir que a difenca sempre seja um numero positivo 
        if (difLateralFrente < 0) {
            difLateralFrente = difLateralFrente * -1;
        }
        
        valorTotal = (frente * lateral) * valorMetro;

        System.out.print("\n");
        
        if (difLateralFrente < (frente*0.10f)){ //Esse pode estar errado
            precofinal = (valorTotal * 1.22f);
            //precofinal = (valorTotal * 1.22f) + valorTotal;

            System.out.print("A área total do terreno de " + frente + " mts de frente com " + lateral);
            System.out.printf(" mts de lateral é: %.2f", lateral * frente);
            System.out.printf("\nO terreno recebeu um acrescimo de 22%% e custará: R$ %.2f\n", precofinal);
        } else if(frente < (lateral * 0.40f)){
            precofinal = valorTotal - (valorTotal * 0.12f);

            System.out.print("A área total do terreno de " + frente + " mts de frente com " + lateral);
            System.out.printf(" mts de lateral é: %.2f",lateral * frente);
            System.out.printf("\nO terreno recebeu um decrescimo de 12%% e custará: R$ %.2f\n", precofinal);
        }else if(frente > (lateral * 0.70f)){
            precofinal = valorTotal - (valorTotal * 0.15f);

            System.out.print("A área total do terreno de " + frente + " mts de frente com " + lateral);
            System.out.printf(" mts de lateral é: %.2f", lateral * frente);
            System.out.printf("\nO terreno recebeu um decrescimo de 15%% e custará: R$ %.2f\n", precofinal);
        }else{
            System.out.print("A área total do terreno de " + frente + " mts de frente com " + lateral);
            System.out.printf(" mts de lateral é: %.2f",lateral * frente);
            System.out.printf("\nO terreno não recebeu nenhuma alteração e custará: R$ %.2f\n", valorTotal);
        }
    }
}
