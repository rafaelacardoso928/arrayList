
package arrayex03;


      import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayEx03 {
    public static void main(String[] args) {
      
        ArrayList<Integer> numeros = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;  
            numeros.add(numeroAleatorio);
        }

        System.out.println("Lista original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        Collections.sort(numeros);

        System.out.println("\nLista ordenada em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

    
    

