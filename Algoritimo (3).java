import java.util.Scanner;
public class Tabuada{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int n1 = ler.nextInt(); 
		
		int tabuada = 1;
		
		System.out.println("=== Tabuada do "+ n1 +" ===");
		while(tabuada <= 10) {
		    int resultado = n1 * tabuada;
		    System.out.println(n1 + " X " + tabuada + " = " + resultado);
		    tabuada ++;
		}
		
	}
}