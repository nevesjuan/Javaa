import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da conta: R$ ");
        double valorTotal = scanner.nextDouble();

        double valorCarlos = Math.floor(valorTotal / 3);
        double valorAndre = Math.floor(valorTotal / 3);
        double valorFelipe = valorTotal - valorCarlos - valorAndre;

        System.out.println("Carlos deve pagar: R$ " + String.format("%.2f", valorCarlos));
        System.out.println("André deve pagar: R$ " + String.format("%.2f", valorAndre));
        System.out.println("Felipe deve pagar: R$ " + String.format("%.2f", valorFelipe));

        scanner.close();
    }
}