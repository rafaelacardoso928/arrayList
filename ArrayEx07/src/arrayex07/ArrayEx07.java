
package arrayex07;

  import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayEx07 {
    public static void main(String[] args) {
     
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10);
        numeros.add(40);
        numeros.add(30);
        numeros.add(50);

        System.out.println("Lista original (com duplicatas):");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        List<Integer> listaSemDuplicatas = new ArrayList<>(new HashSet<>(numeros));

        System.out.println("\nLista sem duplicatas:");
        for (int numero : listaSemDuplicatas) {
            System.out.print(numero + " ");
        }
    }
}

    
    

