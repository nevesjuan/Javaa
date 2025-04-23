import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        System.out.println("Valores em ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}