import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();
            System.out.print("Digite o número de parcelas: ");
            int parcelas = scanner.nextInt();
            
            double taxaJuros = 0.02;  // 2% ao mês
            double montante = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
            double parcela = montante / parcelas;
            
            System.out.printf("Valor final a ser pago: R$ %.2f\n", montante);
            System.out.printf("Valor de cada parcela: R$ %.2f\n", parcela);
            
            System.out.print("Deseja simular outro empréstimo? (s/n): ");
            char continuar = scanner.next().charAt(0);
            
            if (continuar != 's' && continuar != 'S') {
                break;
            }
        }
        
        scanner.close();
    }
}