/*Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a
sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3). Calcule o valor das notas com
base em seus pesos e além de apresentar a média, exiba a maior nota entre as 3 notas, ou a
mensagem “As 3 notas são iguais”, ou “As notas 1 e 2 são as maiores”, “As notas 1 e 3 são as
maiores”, “As notas 2 e 3 são as maiores” caso exista duas notas iguais e elas sejam as maiores. */

import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
        float peso01, peso02, peso03;
        float nota01, nota02, nota03;
        float notaComPeso01, notaComPeso02, notaComPeso03;
        float mediaPonderada;
        
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        
            peso01 = 1.0f;
            peso02 = 2.0f;
            peso03 = 3.0f;
            
                System.out.print("Digite o valor da primeira nota: ");
                nota01 = teclado.nextFloat();
                
                System.out.print("Digite o valor da segunda nota: ");
                nota02 = teclado.nextFloat();
                
                System.out.print("Digite o valor a terceira nota: ");
                nota03 = teclado.nextFloat();
                
                notaComPeso01 = (nota01 * peso01);
                notaComPeso02 = (nota02 * peso02);
                notaComPeso03 = (nota03 * peso03);
                
                mediaPonderada = (notaComPeso01 + notaComPeso02 + notaComPeso03) / (peso01 + peso02 + peso03);
                
                System.out.printf("A media ponderada das notas %.2f, %.2f e %.2f e: %.2f\n", nota01, nota02, nota03, mediaPonderada);
                
                if ((notaComPeso01 > notaComPeso02) && (notaComPeso01 > notaComPeso03)) {
                    System.out.printf("A nota01 (%.2f) e a maior nota apos o calculo do peso %.0f (%.2f)", nota01, peso01, notaComPeso01);
                } else if ((notaComPeso02 > notaComPeso01) && (notaComPeso02 > notaComPeso03)) {
                   System.out.printf("A nota02 (%.2f) e a maior nota apos o calculo do peso %.0f (%.2f)", nota02, peso02, notaComPeso02);
                } else if ((notaComPeso03 > notaComPeso01) && (notaComPeso03 > notaComPeso02)) {
                   System.out.printf("A nota03 (%.2f) e a maior nota apos o calculo do peso %.0f (%.2f)", nota03, peso03, notaComPeso03);
                } else if ((notaComPeso01 == notaComPeso02) && (notaComPeso01 > notaComPeso03)) {
                   System.out.printf("As nota01 (%.2f) e nota02 (%.2f) foram as maiores notas apos o calculo dos pesos %.0f (%.2f) e %.0f (%.2f)", nota01, nota02, peso01, notaComPeso01, peso02, notaComPeso02);
                } else if ((notaComPeso02 == notaComPeso03) && (notaComPeso02 > notaComPeso01)) {
                   System.out.printf("As nota02 (%.2f) e nota03 (%.2f) foram as maiores notas apos o calculo dos pesos %.0f (%.2f) e %.0f (%.2f)", nota02, nota03, peso02, notaComPeso02, peso03, notaComPeso03);
                } else {
                   System.out.println("As três notas foram iguais");
                }   
                
        }
}
