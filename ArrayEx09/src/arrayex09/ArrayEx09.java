
package arrayex09;

       import java.util.ArrayList;

public class ArrayEx09 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomesOriginal = new ArrayList<>();
        nomesOriginal.add("Beatriz");
        nomesOriginal.add("Nycolle");
        nomesOriginal.add("Kauê");
        nomesOriginal.add("Kauã");
        nomesOriginal.add("Eduardo");

        ArrayList<String> nomesCopia = new ArrayList<>(nomesOriginal);

        System.out.println("ArrayList original:");
        for (String nome : nomesOriginal) {
            System.out.println(nome);
        }

        System.out.println("\nArrayList copiado:");
        for (String nome : nomesCopia) {
            System.out.println(nome);
        }
    }
}

    
    

