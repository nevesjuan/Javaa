import java.util.Scanner;
import java.util.Random;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Escolha a dificuldade: 1 (fácil), 2 (médio), 3 (difícil)");
        int dificuldade = scanner.nextInt();
        int limite = 0;
        
        if (dificuldade == 1) {
            limite = 10;
        } else if (dificuldade == 2) {
            limite = 50;
        } else if (dificuldade == 3) {
            limite = 100;
        } else {
            System.out.println("Dificuldade inválida!");
            return;
        }
        
        int numeroSecreto = random.nextInt(limite) + 1;
        int tentativas = 5;
        
        System.out.println("Tente adivinhar o número entre 1 e " + limite + ". Você tem " + tentativas + " tentativas.");
        
        while (tentativas > 0) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
            
            tentativas--;
            System.out.println("Você ainda tem " + tentativas + " tentativas.");
        }
        
        if (tentativas == 0) {
            System.out.println("Você não acertou. O número secreto era " + numeroSecreto + ".");
        }
        
    }
}
        
    
