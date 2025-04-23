import java.util.Arrays;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double[] crescente = Arrays.copyOf(valores, valores.length);
        Arrays.sort(crescente);
        System.out.println("Crescente: " + Arrays.toString(crescente));

        double[] decrescente = Arrays.copyOf(crescente, crescente.length);
        for (int i = 0; i < decrescente.length / 2; i++) {
            double temp = decrescente[i];
            decrescente[i] = decrescente[decrescente.length - 1 - i];
            decrescente[decrescente.length - 1 - i] = temp;
        }
        System.out.println("Decrescente: " + Arrays.toString(decrescente));

        System.out.print("Inversa: ");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
    }
}
