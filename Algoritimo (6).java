import java.util.Scanner;
public class SomaFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
