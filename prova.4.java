import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] nomes = new String[5];
        int[] idades = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = ler.nextLine();
            
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
            ler.nextLine(); 
        }
        
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= 18) {
                System.out.println(nomes[i] + " é maior de idade.");
            } else {
                System.out.println(nomes[i] + " é menor de idade.");
            }
        }
    }
}
