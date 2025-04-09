import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos pães franceses vendidos? ");
        int paes = scanner.nextInt();
        System.out.print("Quantas broas vendidas? ");
        int broas = scanner.nextInt();

        double totalPao = paes * 0.12;
        double totalBroa = broas * 1.50;
        double totalArrecadado = totalPao + totalBroa;
        double poupanca = totalArrecadado * 0.10;

        System.out.println("Total arrecadado: R$ " + String.format("%.2f", totalArrecadado));
        System.out.println("Valor a guardar na poupança: R$ " + String.format("%.2f", poupanca));

        scanner.close();
    }
}