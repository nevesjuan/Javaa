import java.util.Scanner;
public class MaiorDez {
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    
	    int maiorQueDez = 0;
	    
	    for(int i = 1; i <= 20; i++) {
	        System.out.println("Digite o " + i + " número");
	        int n = ler.nextInt();
	        if (n > 10) {
	            maiorQueDez++;
	        }
	    }
	    System.out.println("\nQuantidade de números maiores que 10: " + maiorQueDez);
	}
}