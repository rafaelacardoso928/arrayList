
package arrayex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx02 {
    public static void main(String[] args) {
     
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();

        if (nomes.contains(nomeParaRemover)) {
           
            nomes.remove(nomeParaRemover);
            System.out.println("Nome '" + nomeParaRemover + "' removido com sucesso!");
        } else {
            System.out.println("Nome '" + nomeParaRemover + "' não encontrado na lista.");
        }

        System.out.println("\nLista atualizada:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

    
    

