/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
		double a, b, soma; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero");
		a = ler.nextDouble();
		System.out.println("digite o segundo numero");
		b = ler.nextDouble();
		
		soma = a + b;
		
		System.out.println("o valor é" + soma);
	}
}
