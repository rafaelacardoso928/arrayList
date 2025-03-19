
package arrayex04;

        import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {
        
        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Massa");
        produtos.add("Açúcar");
        produtos.add("Café");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto que deseja buscar: ");
        String produtoBuscado = scanner.nextLine();

        if (produtos.contains(produtoBuscado)) {
            System.out.println("Produto '" + produtoBuscado + "' encontrado na lista!");
        } else {
            System.out.println("Produto '" + produtoBuscado + "' não encontrado na lista.");
        }

        scanner.close();
    }
}

    
    

