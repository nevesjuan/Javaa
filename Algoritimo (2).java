import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Números pares de 1 a 50:");
        
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        
        System.out.println("\nNúmeros de impares de 51 a 100:");
        
        for (int i = 51; i <= 100; i++) {
            if (i % 2 == 1) {
                
            }    
             System.out.println(i + " ");   
            }
            
        }
    }
