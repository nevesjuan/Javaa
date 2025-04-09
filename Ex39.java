import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        int diasDeVida = idade * 365;
        System.out.println(nome.toUpperCase() + ", VOCÊ JÁ VIVEU " + diasDeVida + " DIAS.");

        scanner.close();
    }
}