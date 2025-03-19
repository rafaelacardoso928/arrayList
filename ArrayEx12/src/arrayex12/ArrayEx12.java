
package arrayex12;

       import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx12 {
    public static void main(String[] args) {
      
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(25);
        numeros.add(10);
        numeros.add(35);
        numeros.add(50);
        numeros.add(5);

        int maiorValor = Collections.max(numeros);
        int menorValor = Collections.min(numeros);

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}

    
    

