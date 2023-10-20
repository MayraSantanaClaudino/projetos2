import java.util.Scanner;

public class Main
{
        public static void imprimirEmpateMaior(String palavra1, String palavra2, float n1, float n2, float p1, float p2, float nP1, float nP2) {
            /* Objetivo: Imprimir a frase apresentando as duas notas maiores */
            System.out.printf("As %s (%.2f) e %s (%.2f) foram as maiores notas apos o calculo dos pesos %.0f (%.2f) e %.0f (%.2f)", palavra1, n1, palavra2, n2, p1, nP1, p2, nP2);
        }    
    
        public static float LerNota(String mensagem){
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite o valor da " + mensagem + " nota: ");
            return teclado.nextFloat();
        }
        
        public static float mediaPonderada(float n1,float n2,float n3,float p1,float p2,float p3){
            n1 = n1 * p1; 
            n2 = n2 * p2; 
            n3 = n3 * p3;
            return ((n1 + n2 + n3)/(p1 + p2 + p3));
        }
        
        public static boolean NotaMaior(float maior,float menor1, float menor2){
            /*Objetivo: receber tres valores e descobrir se o primeiro 
            valor informado e maior do que os outros dois valores
            Retorno: Retorna true se a primeira nota for maior 
                     Retorna false se a primeira nota nao for a maior
            */
            return ((maior > menor1) && (maior > menor2));
        }
        
        public static boolean NotaIgualMaior(float np1,float np2, float np3){
            return ((np1 == np2) && (np1 > np3));
        }
        
        public static void imprimirNotaMaior(String texto, float n1, float p1, float np1){
            System.out.printf("A %s (%.2f) e a maior nota apos o calculo do peso %.0f (%.2f)", texto, n1, p1, np1);
        }
        
        public static void main(String[] args) {
            float peso01, peso02, peso03;
            float nota01, nota02, nota03;
            float notaComPeso01, notaComPeso02, notaComPeso03;
            float mediaPonderada;
            
            peso01 = 1.0f;
            peso02 = 2.0f;
            peso03 = 3.0f;
            
            nota01 = LerNota("primeira");
            nota02 = LerNota("segunda");
            nota03 = LerNota("terceira");
                
            notaComPeso01 = (nota01 * peso01);
            notaComPeso02 = (nota02 * peso02);
            notaComPeso03 = (nota03 * peso03);
            
            mediaPonderada = mediaPonderada(nota01, nota02, nota03, peso01, peso02, peso03);
            
            System.out.printf("A media ponderada das notas %.2f, %.2f e %.2f e: %.2f\n", nota01, nota02, nota03, mediaPonderada);
            
            if (NotaMaior(notaComPeso01, notaComPeso02, notaComPeso03)) 
                imprimirNotaMaior("nota01", nota01, peso01, notaComPeso01);
                
            else if (NotaMaior(notaComPeso02, notaComPeso01, notaComPeso03)) 
                imprimirNotaMaior("nota02", nota02, peso02, notaComPeso02);
                
            else if (NotaMaior(notaComPeso03, notaComPeso01, notaComPeso02)) 
                imprimirNotaMaior("nota03",nota03, peso03, notaComPeso03);
                
            else if (NotaIgualMaior(notaComPeso01, notaComPeso02, notaComPeso03))
                imprimirEmpateMaior("nota01", "nota02", nota01, nota02, peso01, peso02, notaComPeso01, notaComPeso02);
               
            else if (NotaIgualMaior(notaComPeso02, notaComPeso03, notaComPeso01))
                imprimirEmpateMaior("nota02", "nota03", nota02, nota03, peso02, peso03, notaComPeso02, notaComPeso03);
                
            else if (NotaIgualMaior(notaComPeso01, notaComPeso03, notaComPeso02))
                imprimirEmpateMaior("nota01", "nota03", nota01, nota03, peso01, peso03, notaComPeso01, notaComPeso03);

            else 
               System.out.println("As três notas foram iguais");
    }
}
