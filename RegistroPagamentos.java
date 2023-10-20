public class Main {
    public static void menu(){
        System.out.println("======================================");
        System.out.println("Código Classificação");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 -  Em 4x, preço acrescido de 8%");
        System.out.println("======================================");
    }
    public static void main(String[] args) {
        float totalAVista = 0;
        float totalParceladas = 0;
        float totalDesconto = 0.0f;
        float totalJuros = 0.0f;
        Scanner scanner = new Scanner(System.in);

        menu();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Digite o valor da compra: R$ ");
                float valorCompra = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Digite o código da forma de pagamento: ");
                int codigoFormaPagamento = scanner.nextInt();
                scanner.nextLine();
                if ((codigoFormaPagamento < 1) || (codigoFormaPagamento > 4)) {
                    throw new Exception("Opção inválida, escolhe entre 1 e 4.");
                }
                float valorFinal = 0.0f;
                float valorParcela = 0.0f;
                String formaPagamento = "";
                switch (codigoFormaPagamento) {
                    case 1:
                        valorFinal = valorCompra - (valorCompra * 0.08f);
                        formaPagamento = "À vista, com 8% de desconto";
                        totalAVista += valorFinal;
                        totalDesconto += valorCompra * 0.08f;
                        break;
                    case 2:
                        valorFinal = valorCompra - (valorCompra * 0.04f);
                        formaPagamento = "À vista no cartão, 4% de desconto";
                        totalAVista += valorFinal;
                        totalDesconto += valorCompra * 0.04f;
                        break;
                    case 3:
                        valorFinal = valorCompra;
                        valorParcela = valorCompra / 2;
                        formaPagamento = "Em 2x, preço normal sem juros";
                        totalParceladas += valorFinal;
                        break;
                    case 4:
                        valorFinal = valorCompra + (valorCompra * 0.08f);
                        valorParcela = valorFinal / 4;
                        formaPagamento = "Em 4x, preço acrescido de 8%";
                        totalParceladas += valorFinal;
                        totalJuros += valorCompra * 0.08f;
                        break;
                }
                System.out.printf("\nValor final: R$ %.2f\n", valorFinal);
                System.out.println("Forma de pagamento: " + formaPagamento);
                if (valorParcela > 0) {
                    System.out.printf("Valor da parcela: R$ %.2f\n", valorParcela);
                }
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                if (e.getMessage() == null){
                    System.out.println("Valor inválido");
                } else {
                    System.out.println(e.getMessage());
                }
                i--;
            }
        }
        System.out.printf("\nTotal de compras à vista: R$ %.2f\n", totalAVista);
        System.out.printf("Total de compras parceladas: R$ %.2f\n", totalParceladas);
        System.out.printf("Total de descontos: R$ %.2f\n", totalDesconto);
        System.out.printf("Total de juros: R$ %.2f\n", totalJuros);
    }
}
