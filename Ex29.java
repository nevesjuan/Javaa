import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você tem na sua academia? ");
        int numAlunos = scanner.nextInt();

        double somaPesos = 0;
        int i = 1;

        while (i <= numAlunos) {
            System.out.print("Digite o peso do aluno " + i + ": ");
            double peso = scanner.nextDouble();
            somaPesos += peso;  
            i++;  
        }

        double mediaPeso = somaPesos / numAlunos;

        System.out.println("A média de peso dos alunos é: " + mediaPeso);

        scanner.close();
    }
}