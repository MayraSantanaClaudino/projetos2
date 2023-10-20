/*Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a
sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3). Calcule o valor das notas com
base em seus pesos e além de apresentar a média, exiba a maior nota entre as 3 notas, ou a
mensagem “As 3 notas são iguais”, ou “As notas 1 e 2 são as maiores”, “As notas 1 e 3 são as
maiores”, “As notas 2 e 3 são as maiores” caso exista duas notas iguais e elas sejam as maiores. */

import java.util.Scanner;

public class Main
{
    public static void imprimirEmpateMaior(String palavra1, String palavra2, float n1, float n2, float p1, float p2, float nP1, float nP2) {
        /* Objetivo: Imprimir a frase apresentando as duas notas maiores */
        System.out.printf("As %s (%.2f) e %s (%.2f) foram as maiores notas apos o calculo dos pesos %.0f (%.2f) e %.0f (%.2f)", palavra1, n1, palavra2, n2, p1, nP1, p2, nP2);
    }    

    public static void imprimirNotaMaior(String palavra, float nota, float peso, float notaComPeso){
        /* Objetivo: Imprimir a frase apresentando a maior nota */
        System.out.printf("A %s (%.2f) e a maior nota apos o calculo do peso %.0f (%.2f)", palavra, nota, peso, notaComPeso);
    }
    
    public static float calcularMediaPonderada(float nP1, float nP2, float nP3, float p1, float p2, float p3){
        /* Objetivo: Calcular a media ponderada 
           Retorno: media ponderada no formato fracionario */
        return (nP1 + nP2 + nP3) / (p1 + p2 + p3);    
    }

    public static boolean verificarNota01Maior(float nP1, float nP2, float nP3){
        /* Objetivo: Testa para ver se a nota01 e a maior 
           Retorno: Verdadeiro para a nota01 maior
                    Falso para a nota01 nao for maior
        */
        return (nP1 > nP2) && (nP1 > nP3); 
    }

    public static boolean verificarNota02Maior(float nP1, float nP2, float nP3){
        return (nP2 > nP1) && (nP2 > nP3); 
    }
    
    public static boolean verificarNota03Maior(float nP1, float nP2, float nP3){
        return (nP3 > nP1) && (nP3 > nP2); 
    }
    
    public static float lerNota(String palavra){
        /* Objetivo: Apresentar uma mensagem e ler o valor de uma nota 
           Retorno: Valor da nota lida do teclado
        */
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da " + palavra + " nota: ");
        return teclado.nextFloat();
    }
    
    public static void main(String[] args) {
        float peso01, peso02, peso03;
        float nota01, nota02, nota03;
        float notaComPeso01, notaComPeso02, notaComPeso03;
        float mediaPonderada;
        
        peso01 = 1.0f;
        peso02 = 2.0f;
        peso03 = 3.0f;
        
        nota01 = lerNota("primeira");
        nota02 = lerNota("segunda");
        nota03 = lerNota("terceira");
        
        notaComPeso01 = (nota01 * peso01);
        notaComPeso02 = (nota02 * peso02);
        notaComPeso03 = (nota03 * peso03);
        
        mediaPonderada = calcularMediaPonderada(notaComPeso01, notaComPeso02, notaComPeso03, peso01, peso02, peso03);
        
        System.out.printf("A media ponderada das notas %.2f, %.2f e %.2f e: %.2f\n", nota01, nota02, nota03, mediaPonderada);
        
        if (verificarNota01Maior(notaComPeso01, notaComPeso02, notaComPeso03)) 
           imprimirNotaMaior("nota01", nota01, peso01, notaComPeso01);
        
        else if (verificarNota02Maior(notaComPeso01, notaComPeso02, notaComPeso03)) 
           imprimirNotaMaior("nota02", nota02, peso02, notaComPeso02);
        
        else if (verificarNota02Maior(notaComPeso01, notaComPeso02, notaComPeso03)) 
           imprimirNotaMaior("nota03", nota03, peso03, notaComPeso03);
        
        else if ((notaComPeso01 == notaComPeso02) && (notaComPeso01 > notaComPeso03)) 
           imprimirEmpateMaior("nota01", "nota02", nota01, nota02, peso01, peso02, notaComPeso01, notaComPeso02);
        
        else if ((notaComPeso02 == notaComPeso03) && (notaComPeso02 > notaComPeso01))
           imprimirEmpateMaior("nota02", "nota03", nota02, nota03, peso02, peso03, notaComPeso02, notaComPeso03);
        
        else if ((notaComPeso01 == notaComPeso03) && (notaComPeso01 > notaComPeso02))
            imprimirEmpateMaior("nota01", "nota03", nota01, nota03, peso01, peso03, notaComPeso01, notaComPeso03);

        else
           System.out.println("As três notas foram iguais");
    }
}
