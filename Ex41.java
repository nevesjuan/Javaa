import java.util.Scanner;

public class Ex41
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso do prato (em quilos): ");
        double peso = scanner.nextDouble();

        double valorPagar = peso * 12.00;
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorPagar));

        scanner.close();
    }
}