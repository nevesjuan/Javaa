import java.util.Scanner;
import java.lang.Math;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        if (A == 0) {
            System.out.println("Isso não é uma equação de segundo grau (A não pode ser zero).");
        } else {
    
            double delta = Math.pow(B, 2) - 4 * A * C;
            System.out.println("Delta: " + delta);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
               
                double x1 = (-B + Math.sqrt(delta)) / (2 * A);
                double x2 = (-B - Math.sqrt(delta)) / (2 * A);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        scanner.close();
    }
}
