import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[10];
        double[] valores = new double[10];
        double valorTotal = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();

            System.out.print("Digite o valor do produto " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            scanner.nextLine(); 
            valorTotal += valores[i];  
        }

        System.out.println("\nValor total dos produtos: R$ " + String.format("%.2f", valorTotal));

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
        System.out.println("2 - À Vista no Cartão de Crédito (3% de desconto)");
        System.out.println("3 - Parcelado no Cartão em 2 vezes (sem juros)");
        System.out.println("4 - Parcelado no Cartão em 3 até 10 parcelas (10% de juros)");

        int escolha = scanner.nextInt();
        double valorFinal = 0;

        switch (escolha) {
            case 1: 
                valorFinal = valorTotal * 0.92;  
                break;
            case 2: 
                valorFinal = valorTotal * 0.97;  
                break;
            case 3: 
                valorFinal = valorTotal;  
                System.out.println("Você pagará em 2 vezes de R$ " + String.format("%.2f", valorFinal / 2));
                break;
            case 4: 
                valorFinal = valorTotal * 1.10;  
                System.out.println("Você pagará em até 10 vezes de R$ " + String.format("%.2f", valorFinal / 10));
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("\nProdutos comprados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(produtos[i] + " - R$ " + String.format("%.2f", valores[i]));
        }

        System.out.println("\nValor final a ser pago: R$ " + String.format("%.2f", valorFinal));
    }
}