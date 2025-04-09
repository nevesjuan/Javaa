import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos sanduíches deseja fazer? ");
        int quantidade = scanner.nextInt();

        double queijo = quantidade * 2 * 0.05; 
        double presunto = quantidade * 1 * 0.05; 
        double carne = quantidade * 1 * 0.1; 
        
        System.out.println("Para " + quantidade + " sanduíches, você precisará de:");
        System.out.println("Queijo: " + String.format("%.2f", queijo) + " kg");
        System.out.println("Presunto: " + String.format("%.2f", presunto) + " kg");
        System.out.println("Carne: " + String.format("%.2f", carne) + " kg");

        scanner.close();
    }
    
}