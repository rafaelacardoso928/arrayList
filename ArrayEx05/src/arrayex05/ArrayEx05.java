
package arrayex05;

     import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx05  {
    public static void main(String[] args) {
       
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Sapucaia do Sul");
        cidades.add("Canoas");
        cidades.add("Gramado");
        cidades.add("Esteio");
        cidades.add("Porto Alegre");

        System.out.println("Lista de cidades original:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o nome da cidade que deseja substituir: ");
        String cidadeAntiga = scanner.nextLine();

        if (cidades.contains(cidadeAntiga)) {
          
            System.out.print("Digite o nome da nova cidade para substituir '" + cidadeAntiga + "': ");
            String novaCidade = scanner.nextLine();

            int indice = cidades.indexOf(cidadeAntiga);
            cidades.set(indice, novaCidade);

            System.out.println("\nLista de cidades atualizada:");
            for (String cidade : cidades) {
                System.out.println(cidade);
            }
        } else {
            System.out.println("\nCidade '" + cidadeAntiga + "' não encontrada na lista.");
        }

        scanner.close();
    }
}

    
    

