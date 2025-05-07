/******************************************************************************

                          

*******************************************************************************/
import java.util.Scanner;
public class Ex1
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor de um número inteiro");
		int n1 = ler.nextInt();
		System.out.println("Digite o valor de outro número inteiro");
		int n2 = ler.nextInt();
		
		if (n1 % 2 == 0) {
		    System.out.println("O número " + n1 + " é par!");
		} else {
		     System.out.println("O número " + n1 + " é ímpar!");
		}
		
		if (n2 % 2 == 0) {
		    System.out.println("O número " + n2 + " é par!");
		} else {
		    System.out.println("O número " + n2 + " é ímpar!");
		}
	}
}