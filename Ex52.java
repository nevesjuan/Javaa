import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
        }

        System.out.println("Soma das idades: " + soma);
        for (int idade : idades) {
            if (idade >= 60) {
                System.out.println(idade + " anos - Melhor idade");
            } else if (idade >= 18) {
                System.out.println(idade + " anos - Adulto");
            } else {
                System.out.println(idade + " anos - Criança");
            }
        }
    }
}