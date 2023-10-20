/*Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 5%. Após o
aumento, desconte 11% de INSS e 8% de FGTS e o % do IR conforme a tabela abaixo. 
Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, 
o desconto do FGTS, o desconto do IR e o Total de Descontos (INSS+FGTS+IR). O desconto do 
Imposto de Renda é variável. Quando o salário do funcionário muda de uma faixa de 
desconto de IR para outra, ele pode mesmo com o aumento de 5% receber menos do que quando 
comparado antes do aumento. O seu algoritmo deve calcular e descobrir se o novo salário (5%) 
fará com que o usuário receba um salário final menor do que antes de aplicar os 5%.

base de calculo IR
Até 1.903,98                0%
De 1.903,99 até 2.826,65    7,5%
De 2.826,66 até 3.751,05    15%
De 3.751,06 até 4.664,68    22,5%
Acima de 4.664,68           27,5% */
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main{
    
    public static float lerSalarioInicial(){
        //procedimento responsavel pela leitura do Salario Inicial
        float salario = 0;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Digite o salário inicial: ");
        
        try {
            salario = teclado.nextFloat();    
        } catch (InputMismatchException ex ) {
            System.out.print("Valor digitado não é um número!");
        }
        
        return salario;
        
    }

    public static float calcularIR(float salario){
        //procedimento responsavel por receber um salario
        // e calculcar o desconto com base na faixa de desconto
        float descontoIR = 0;
        
        if ((salario >= 1903.99) && (salario < 2826.65))
            descontoIR = salario * 0.075f;
        else if ((salario >= 2826.66) && (salario < 3751.05))
            descontoIR = salario * 0.15f;
        else if ((salario >= 3751.06) && (salario < 4664.68))
            descontoIR = salario * 0.225f;
        else if (salario >= 4664.68)
            descontoIR = salario * 0.275f;
        
        return descontoIR;
    }
    
    public static void imprimirResultados(  float salarioInicial, 
                                            float salarioPosAumento, 
                                            float descontoFGTS, 
                                            float descontoINSS,
                                            float descontoIR,
                                            float salarioFinal  ){
        
        System.out.printf("Salário inicial: R$ %.2f\n", salarioInicial);
        System.out.printf("Salário reajustado: R$ %.2f\n", salarioPosAumento);
        System.out.printf("Desconto INSS 11%%: R$ %.2f\n", descontoINSS);
        System.out.printf("Desconto FGTS 8%%: R$ %.2f\n", descontoFGTS);
        System.out.printf("Desconto IR: R$ %.2f\n", descontoIR);
        System.out.printf("Total de descontos: R$ %.2f\n", descontoIR + descontoFGTS + descontoINSS);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);
    }

    public static void main(String[] args) {
        float salarioInicial = 0, salarioPosAumento, salarioFinal;
        float descontoINSS, descontoIR = 0, descontoFGTS, totalDescontos;
        float salarioFinalAntesAumento;
        
        salarioInicial = lerSalarioInicial();
        
        //caso o salario retornado for 0
        //finaliza o programa
        if (salarioInicial == 0){
            //comando que forca o termino da execucao do programa
            System.exit(0);
        }
            
        //calculos antes do aumento de 5%
        descontoINSS = salarioInicial * 0.11f;
        descontoFGTS = salarioInicial * 0.08f;
    
        descontoIR = calcularIR(salarioInicial);
        totalDescontos = descontoIR + descontoFGTS + descontoINSS;
        salarioFinal = salarioInicial - totalDescontos;
        
        //guarda o salarioFinal (sem aplicar o aumento de 5% ) 
        // apos os descontos para comparar depois com 
        //o salarioFinalComAumento        
        salarioFinalAntesAumento = salarioFinal;
        
        //calculos considerando o aumento de 5%
        salarioPosAumento = salarioInicial * 1.05f;
        descontoINSS = salarioPosAumento * 0.11f;
        descontoFGTS = salarioPosAumento * 0.08f;
  
        descontoIR = calcularIR(salarioPosAumento);
        
        //guarda o salarioFinal apos aplicar o aumento de 5%  
        // menos os descontos para comparar depois com 
        //o salarioFinalAntesAumento  
        salarioFinal = salarioPosAumento - totalDescontos;
        
        imprimirResultados(salarioInicial, salarioPosAumento, descontoFGTS, descontoINSS, descontoIR, salarioFinal);
        
        //baseado no salarioFinal antes do aumento comparado com o salarioFinal com Aumento
        //identificamos se o funcionario vai ganhar menos ou não mesmo recebendo um aumento
        if (salarioFinal < salarioFinalAntesAumento) {
            System.out.printf("O novo salário final é menor que o salário recebido antes do aumento!");
        }
        
       
    }
}
