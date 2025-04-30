import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int resultado = 1;
	    int contador = 0;
	    
	    
		System.out.println("Digite a base: ");
		int base = ler.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = ler.nextInt();
		
		while (contador < expoente) {
		    resultado *= base;
		   
		   contador++;
		}
		
		System.out.println("Base: "+ base);
		System.out.println("Expoente: "+ expoente);
		System.out.println("Resultado: " + resultado);
	}
}