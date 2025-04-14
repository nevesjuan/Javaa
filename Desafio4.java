import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] cedulas = {100, 50, 20, 10, 5};
        int[] quantidadeCedulas = new int[5];
        
        for (int i = 0; i < cedulas.length; i++) {
            System.out.print("Digite a quantidade de cédulas de R$" + cedulas[i] + ": ");
            quantidadeCedulas[i] = scanner.nextInt();
        }
        
        System.out.print("Digite o valor do saque: ");
        int saque = scanner.nextInt();
        
        if (saque <= 0) {
            System.out.println("Valor inválido.");
            return;
        }
        
        int[] cedulasEntregues = new int[5];
        
        for (int i = 0; i < cedulas.length; i++) {
            int cedula = cedulas[i];
            int maxCedulasPossiveis = saque / cedula;
            int cedulasUsadas = Math.min(maxCedulasPossiveis, quantidadeCedulas[i]);
            
            cedulasEntregues[i] = cedulasUsadas;
            saque -= cedulasUsadas * cedula;
        }
        
        if (saque > 0) {
            System.out.println("Não foi possível realizar o saque com as cédulas disponíveis.");
        } else {
            System.out.println("\nSaque realizado com sucesso! Cédulas entregues:");
            for (int i = 0; i < cedulas.length; i++) {
                if (cedulasEntregues[i] > 0) {
                    System.out.println("R$" + cedulas[i] + ": " + cedulasEntregues[i] + " cédulas");
                }
            }
        }
        
        scanner.close();
    }
}