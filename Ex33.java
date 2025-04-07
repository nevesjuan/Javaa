import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            soma += numero;
        }

        double media = soma / 10.0;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

    }
}