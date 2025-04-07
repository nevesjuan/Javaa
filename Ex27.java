import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while (i <= 5) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();  
            System.out.println("Nome da pessoa " + i + ": " + nome);  
            i++; 
        }

        scanner.close();
    }
}