import java.util.Scanner;

public class Ex42{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas camisetas pequenas? ");
        int pequenas = scanner.nextInt();
        System.out.print("Quantas camisetas médias? ");
        int medias = scanner.nextInt();
        System.out.print("Quantas camisetas grandes? ");
        int grandes = scanner.nextInt();

        double total = (pequenas * 10) + (medias * 12) + (grandes * 15);
        System.out.println("Valor total arrecadado: R$ " + String.format("%.2f", total));

        scanner.close();
    }
}