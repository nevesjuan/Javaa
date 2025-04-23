import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] compras = new double[10];
        double total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor da compra " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            total += compras[i];
        }

        double imposto = total > 1200 ? total * 0.025 : total * 0.008;
        double totalComImposto = total + imposto;

        System.out.println("Total sem imposto: R$ " + total);
        System.out.println("Imposto aplicado: R$ " + imposto);
        System.out.println("Total com imposto: R$ " + totalComImposto);
    }
}