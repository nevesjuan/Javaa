import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        int countExcelente = 0, countBom = 0, countRegular = 0, countInsuficiente = 0;
        int contador = 0;
        
        while (true) {
            System.out.print("Digite a nota (entre 0 e 10) ou -1 para terminar: ");
            double nota = scanner.nextDouble();
            
            if (nota == -1) {
                break;
            } else if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                contador++;
                
                if (nota >= 9) {
                    countExcelente++;
                } else if (nota >= 7) {
                    countBom++;
                } else if (nota >= 5) {
                    countRegular++;
                } else {
                    countInsuficiente++;
                }
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
        }
        
        double media = somaNotas / contador;
        System.out.println("\nMédia geral: " + media);
        System.out.println("Excelente: " + countExcelente);
        System.out.println("Bom: " + countBom);
        System.out.println("Regular: " + countRegular);
        System.out.println("Insuficiente: " + countInsuficiente);
        
        scanner.close();
    }
} 
