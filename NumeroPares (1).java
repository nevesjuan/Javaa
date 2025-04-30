public class NumeroPares {
    public static void main(String [] args){
        int numero = 1;
        
        System.out.println("Números de pares de 1 a 50: ");
           while (numero <= 50) {
               if (numero % 2 == 0) {
                   System.out.println(numero);
               }
               numero++;
           }
           
           numero = 51;
           
           System.out.println("\nNumeros pares de 51 a 100: ");
                while(numero <= 100) {
                    if (numero % 2 ==0) {
                        System.out.println(numero);
                    }
                    numero++;
                }
    }
}