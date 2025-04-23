import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor 1: ");
            vetor1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor 2: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor soma:");
        for (int valor : soma) {
            System.out.println(valor);
        }
    }
}