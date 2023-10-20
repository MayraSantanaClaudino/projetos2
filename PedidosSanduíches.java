import java.util.Scanner;

public class Main
{
    public static void exibirMenu(){
        System.out.print("========= MENU ===========\n\n");
                System.out.print("1: X Tudo\n");
                System.out.print("2: X Salada\n");
                System.out.print("3: X Egg\n");
                System.out.print("0: para nenhum sanduiche\n\n");
    }
    
    public static int lerPedido(String mensagem){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o código do " + mensagem + " sanduiche: ");
                
                return teclado.nextInt();
    }
    
        public static void main(String[] args) {

                int escolha, s1, s2, s3, total = 0;

                s1 = s2 = s3 = 0;

        exibirMenu();
                
        escolha = lerPedido("primeiro");
        
        if (escolha == 1) 
            s1 += 1;
        else if (escolha == 2)
            s2 += 1;
        else if (escolha == 3)
            s3 += 1;

        escolha = lerPedido("segundo");

        if (escolha == 1)
            s1 += 1;
        else if (escolha == 2)
            s2 += 1;
        else if (escolha == 3)
            s3 += 1;


        escolha = lerPedido("terceiro");
    
        if (escolha == 1)
            s1 += 1;
        else if (escolha == 2)
            s2 += 1;
        else if (escolha == 3)
            s3 += 1;

        escolha = lerPedido("quarto");
        
        if (escolha == 1)
            s1 += 1;
        else if (escolha == 2)
            s2 += 1;
        else if (escolha == 3)
            s3 += 1;

        escolha = lerPedido("quinto");
        
        if (escolha == 1)
            s1 += 1;
        else if (escolha == 2)
            s2 += 1;
        else if (escolha == 3)
            s3 += 1;

        System.out.print("\nTotal de sanduiches pedidos: " + (s1 + s2 + s3));
        System.out.print("\n\nPedidos do X Tudo: " + s1);
        System.out.print("\nPedidos do X Salada: " + s2);
        System.out.print("\nPedidos do X Egg: " + s3);
        }
}
