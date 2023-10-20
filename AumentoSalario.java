import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float salarioInicial;
        float salarioPosReajuste;
        float salarioFinal;
        float aumento = 0;
        float inss;
        float fgts;
        float totalDescontos;
        
        System.out.print("Digite o Salário: ");
        salarioInicial = teclado.nextFloat();
        
        if (salarioInicial < 2000) {
            aumento = salarioInicial * 0.15f;
        } else if (salarioInicial < 3000){
            //como a variavel aumento foi inicializada no momento 
            //da declaracao, nao e necessario este trecho do else if
            //veja na versao 02 e entenda o porque?
            aumento = 0;
        } else if (salarioInicial >= 3000) {
            aumento = salarioInicial * 0.1f;
        }
                
        salarioPosReajuste = salarioInicial + aumento;
                
        inss = salarioPosReajuste * 0.11f;
        fgts = salarioPosReajuste * 0.08f;
        totalDescontos = inss + fgts;
                
        salarioFinal = salarioPosReajuste - totalDescontos;
                
        System.out.printf("Salario Inicial: R$ %.2f\n", salarioInicial);
        System.out.printf("Aumento Salarial: R$ %.2f\n", aumento);
        System.out.printf("Desconto INSS: R$ %.2f\n", inss);
        System.out.printf("Desconto FGTS: R$ %.2f\n", fgts);
        System.out.printf("Total de Descontos: R$ %.2f\n", totalDescontos);
        System.out.printf("Salario final: R$ %.2f\n", salarioFinal);        
    }
}
