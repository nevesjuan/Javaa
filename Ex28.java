import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
   
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
         
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int soma = num1 + num2;
            System.out.println("Resultado da adição: " + soma);

            System.out.print("Deseja fazer outra adição? (sim/não): ");
            scanner.nextLine();
            continuar = scanner.nextLine();  
        }

        System.out.println("Obrigado por usar a calculadora!");

        scanner.close();
    }
}