import java.util.Scanner;
public class Idade5p {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int soma = 0;
        int idade;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            idade = ler.nextInt();
            soma += idade;
            
            double media = (double) soma / 5;
            
            System.out.println("Soma das idades: " + soma);
            System.out.println("Média das idades: " + media);
        }
    }
}