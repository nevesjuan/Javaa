import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos cavalos foram comprados? ");
        int cavalos = scanner.nextInt();
        int ferraduras = cavalos * 4; 
        System.out.println("São necessárias " + ferraduras + " ferraduras.");
        scanner.close();
    }
}