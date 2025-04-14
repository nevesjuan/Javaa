import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] votos = {0, 0, 0};  
        int voto;
        
        while (true) {
            System.out.println("Digite seu voto (1, 2, 3) ou 0 para encerrar: ");
            voto = scanner.nextInt();
            
            if (voto == 0) {
                break;
            } else if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido. Tente novamente.");
            }
        }
        
        System.out.println("\nResultado da eleição:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
        }

        int maxVotos = Math.max(votos[0], Math.max(votos[1], votos[2]));
        String vencedor = "";
        boolean empate = false;
        
        for (int i = 0; i < 3; i++) {
            if (votos[i] == maxVotos) {
                if (!vencedor.isEmpty()) {
                    empate = true;
                }
                vencedor += "Candidato " + (i + 1) + " ";
            }
        }
        
        if (empate) {
            System.out.println("Houve um empate entre: " + vencedor);
        } else {
            System.out.println("O vencedor é: " + vencedor.trim());
        }
        
        scanner.close();
    }
}