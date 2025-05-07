import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int num = ler.nextInt();

       
        if (num <= 1) {
            System.out.println(num + " não é primo.");
        } else {
            boolean Primo = true;

            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Primo = false;
                    break;
                }
            }

            
            if (Primo) {
                System.out.println(num + " é um número primo.");
            } else {
                System.out.println(num + " não é primo.");
            }
        }
    }
}
