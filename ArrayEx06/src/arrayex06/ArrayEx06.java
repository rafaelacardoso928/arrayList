
package arrayex06;

        import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx06 {
    public static void main(String[] args) {
   
        ArrayList<String> palavras = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas palavras você deseja inserir? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite as palavras:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            String palavra = scanner.nextLine();
            palavras.add(palavra);
        }

        System.out.print("\nDigite a palavra para contar quantas vezes ela aparece na lista: ");
        String palavraBuscada = scanner.nextLine();

        int count = 0;
        for (String palavra : palavras) {
            if (palavra.equals(palavraBuscada)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A palavra '" + palavraBuscada + "' aparece " + count + " vez(es) na lista.");
        } else {
            System.out.println("A palavra '" + palavraBuscada + "' não foi encontrada na lista.");
        }

        scanner.close();
    }
}

    
    

