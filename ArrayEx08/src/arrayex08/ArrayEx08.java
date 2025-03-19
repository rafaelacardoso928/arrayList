
package arrayex08;

     import java.util.ArrayList;
import java.util.Collections;

public class  ArrayEx08 {
    public static void main(String[] args) {
  
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Elemento 1");
        elementos.add("Elemento 2");
        elementos.add("Elemento 3");
        elementos.add("Elemento 4");
        elementos.add("Elemento 5");
        elementos.add("Elemento 6");

        System.out.println("Lista na ordem original:");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }

        Collections.reverse(elementos);

        System.out.println("\nLista na ordem inversa:");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}

    
    

