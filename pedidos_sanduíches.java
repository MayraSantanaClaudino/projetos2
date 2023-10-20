import java.util.Scanner;

public class validacaoSenha2 {
    public static void menu(){
        System.out.print("========= MENU ===========\n\n");
        System.out.println("1: X Salada");
        System.out.println("2: X Tudo");
        System.out.println("3: X Caboquinho");
        System.out.println("0: Nenhuma opcao\n");
    }

    //          note os colchetes na frente do int
    public static int[] lerPedidos(Scanner ler){
        //o objetivo desta funcao e ler alguns pedidos e retornar para o programa 
        //principal quantos pedidos foram feitos para cada sanduiche. Como ate agora 
        //criamos funcoes que precisavam retornar apenas uma unica variavel, precisaremos
        //retornar mais de uma variavel, e neste caso, podemos utilizar um vetor para o retorno
        //deste conjunto de valores
        
        int opcao;
        int sandubas[];
        sandubas = new  int[4];

                for(int cont = 1; cont < 6; cont++){
                    System.out.printf("Digite o código do %dº sanduiche: ",cont);
                    opcao = ler.nextInt();
                    
            //ao rever este código, tente transformar este bloco if em um funcao 
            //separada chamada contabilizarPedidos
                if (opcao == 1) 
                //a quantidade de sanduba1 sera armazenado na posicao 0
                sandubas[0] += 1;
            else if (opcao == 2)
                //a quantidade de sanduba2 sera armazenado na posicao 1
                sandubas[1] += 1;
            else if (opcao == 3)
                //a quantidade de sanduba3 sera armazenado na posicao 2
                sandubas[2] += 1;
            else if (opcao == 0)
                //a quantidade de nenhum sanduba escolhido sera armazenado na posicao 3
                sandubas[3] += 1;
                }
        ler.close();
        return sandubas;
    }

        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
                int sandubas[];
        sandubas = new int[10];
                
                menu();
                
        sandubas = lerPedidos(ler);
            
        //lembrando o saunduba1 esta no vetor sandubas[0] 
        //saundaba2 = sandubas[1]; saundaba3 = sandubas[2];  nenhum = sandubas[1]
            System.out.println("\nQuantidade total de pedidos: "+(5 - sandubas[3]));
            System.out.println("\nQuantidade de: X salada = "+ sandubas[0]);
            System.out.println("Quantidade de: X Tudo = "+ sandubas[1]);
            System.out.println("Quantidade de: X Caboquinho = "+ sandubas[2]);

        }
}
