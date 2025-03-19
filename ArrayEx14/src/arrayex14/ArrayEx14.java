
package arrayex14;

      import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx14 {
    public static void main(String[] args) {
        
        ArrayList<String> tarefas = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        do {
     
            System.out.println("\n--- Menu de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                  
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                
                case 2:
                
                    System.out.print("Digite o índice da tarefa a ser removida (começando de 0): ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                
                case 3:
                 
                    System.out.println("\nLista de Tarefas:");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + ". " + tarefas.get(i));
                        }
                    }
                    break;
                
                case 4:
                  
                    System.out.println("Saindo do programa...");
                    break;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}

    
    

