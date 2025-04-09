import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;

        do {
        
            System.out.println("\n*** Menu da Conta Corrente ***");
            System.out.println("1 - Depósito Bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 2: 
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Saque inválido. Verifique o valor ou o saldo.");
                    }
                    break;

                case 3: 
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 4: 
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4); 

        scanner.close();
    }
}