
 import java.util.Scanner;
 public class Ex16.java
 {
 	public static void main(String[] args) {
 	    Scanner ler = new Scanner(System.in);
 	    String nome;
 	    
 	    System.out.println("Insira seu nome: ");
 	    nome = ler.nextLine();
 	    
 	    for(int i = 0; i <= 10; i++)
 	      System.out.println("Olá " + nome);
 	}
 } 
