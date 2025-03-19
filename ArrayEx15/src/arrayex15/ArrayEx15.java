
package arrayex15;

      import java.util.ArrayList;

class Aluno {
   
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Nota: " + nota);
    }
}

public class  ArrayEx15 {
    public static void main(String[] args) {
        
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Carlos", 7.0));
        alunos.add(new Aluno("Bruna", 9.2));
        alunos.add(new Aluno("Daniel", 6.8));
        alunos.add(new Aluno("Eduardo", 7.5));

        double somaNotas = 0;

        System.out.println("Lista de Alunos e suas Notas:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
            somaNotas += aluno.getNota();
        }

        double mediaNotas = somaNotas / alunos.size();
        System.out.println("\nMédia das notas: " + mediaNotas);
    }
}

      
    
    

