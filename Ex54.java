import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores deseja inserir? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int countPares = 0;
        int produtoImpares = 1;
        boolean temImpar = false;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                countPares++;
            } else {
                produtoImpares *= numeros[i];
                temImpar = true;
            }
        }

        System.out.println("Quantidade de pares: " + countPares);
        if (temImpar) {
            System.out.println("Produto dos ímpares: " + produtoImpares);
        } else {
            System.out.println("Não há valores ímpares.");
        }
    }
}