import java.util.Scanner;

public class Main
{
  public static void main(String[]args)
  {
      Scanner teclado = new Scanner(System.in);

      int qtdeMulheres, totalAlunos;
      float percentualHomens;
      
      System.out.print("Digite o seu nome: ");
      String nomeUsuario;
      //para lermos um texto ou paralvras, usamos o nextLine
      nomeUsuario = teclado.nextLine();
      
      System.out.print("Digite a quantiade de homens: ");
      int qtdeHomens = teclado.nextInt();
      
      System.out.print("Digite a quantiade de mulheres: ");
      qtdeMulheres = teclado.nextInt();
      
      totalAlunos = qtdeMulheres + qtdeHomens;

      System.out.print("Olá " + nomeUsuario + " o percentual de mulheres é: ");
      //note que aqui estamos fazendo uma divisão de dois valores declarados
      //como inteiros. Como a divisão sempre pode produzir um valor fracionário,
      //precisamos fazer o java entender que é para produzir um reultado fracionário
      //ao invés de um resultado inteiro. Para isto utilizamos a converssão de pelo 
      //menos um os valores para float usando o (float) antes da variavel que se quer 
      //converter
      System.out.printf("%.2f", (qtdeMulheres / (float)totalAlunos) * 100);
      System.out.println("%");
      
      percentualHomens = ((float)qtdeHomens / totalAlunos) * 100;
      System.out.print("Olá " + nomeUsuario + " o percentual de homens é: ");
      System.out.printf("%.2f", percentualHomens);
      
  }
}
