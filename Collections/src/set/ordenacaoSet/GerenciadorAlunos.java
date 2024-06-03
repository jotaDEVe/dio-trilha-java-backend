package set.ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class GerenciadorAlunos {

    //Atributos
    private Set<Aluno> setDeAlunos;

    //Construtor
    public GerenciadorAlunos(){
        setDeAlunos = new HashSet<>();
    }

    //Métodos
    public void adicionarAluno(String nome, long matricula, double media){
        setDeAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;

        if(!setDeAlunos.isEmpty()){
            for (Aluno a : setDeAlunos){
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
        setDeAlunos.remove(alunoParaRemover);
        }
        else {
            throw new RuntimeException("O Conjunsto está vazio!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matrícula não encontrada!");
        }
        
    }

    public void exibirAlunosPorNome(){
        if(!setDeAlunos.isEmpty()){
            //Cria e retorna um TreeSet que entende a ordenação do Set original
            Set<Aluno> alunosPorNome = new TreeSet<>(setDeAlunos);
            System.out.println(alunosPorNome);
        } else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorMedia(){
        if(!setDeAlunos.isEmpty()){
            Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
            alunosPorMedia.addAll(setDeAlunos);
            System.out.println(alunosPorMedia);
        } else{
            System.out.println("O conjunto está vazio!");
        }
        
    }

    public void exibirAlunos(){
        System.out.println(setDeAlunos);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.setDeAlunos);
    
        // Removendo um aluno com número de matrícula inválido e outro pelo número de matrícula válido
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println("\n" + gerenciadorAlunos.setDeAlunos + "\n" );
    
        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();
    
        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorMedia();
      }
}
