import java.util.Scanner;

public class Ex40{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoLitro = scanner.nextDouble();
        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        double litros = valorPago / precoLitro;
        System.out.println("Você conseguiu colocar " + String.format("%.2f", litros) + " litros de gasolina.");

        scanner.close();
    }
}