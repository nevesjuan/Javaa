import java.util.Scanner;

public class Ex43{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double salarioAjustado = salario * 1.15; 
        double salarioFinal = salarioAjustado * 0.92; 

        System.out.println("Salário inicial: R$ " + String.format("%.2f", salario));
        System.out.println("Salário com aumento: R$ " + String.format("%.2f", salarioAjustado));
        System.out.println("Salário final após impostos: R$ " + String.format("%.2f", salarioFinal));

        scanner.close();
    }
}