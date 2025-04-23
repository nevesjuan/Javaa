import java.util.Random;

public class Ex51 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        int maior = 0, menor = 100;
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(101);
            soma += numeros[i];
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        double media = soma / 10.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);
    }
}