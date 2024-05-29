package set.operacoesSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    // Atributos
    private Set<String> conjuntoPalavrasUnicas;

    // Construtor
    public ConjuntoPalavrasUnicas(){
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    // MÉTODOS

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(palavra);
    };
    
    public void removerPalavra(String palavra){
        if(!conjuntoPalavrasUnicas.isEmpty()){
            if (conjuntoPalavrasUnicas.contains(palavra)){
                conjuntoPalavrasUnicas.remove(palavra);
                System.out.println("A palavra " + palavra + " foi removida do conjunto");
            } else{
                System.out.println("A palavra " + palavra + " não foi encontrada no conjunto");
            }
        } else {
            System.out.println("P conjunto está vazio");
        }
        

        
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }

    public boolean verificarPalavra(String palavra){
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
  }
}


