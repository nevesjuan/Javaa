public class Soma05 {
    public static void main(String [] args){
        
        int numero = 1;
        int soma = 0;
        
        System.out.println("soma dos números pares de 1 a 100: ");
           while (numero <= 100) {
               if (numero % 2 == 0) {
                 soma = numero + numero;
                   System.out.println(numero + " + " + numero + " = " + soma);
               }
               numero++;
           }
    }
}