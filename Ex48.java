import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            if (i % 2 != 0) {
                soma += valores[i];
            }
        }

        System.out.println("Soma das posições ímpares: " + soma);
    }
}
