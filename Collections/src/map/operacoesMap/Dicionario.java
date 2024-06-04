package map.operacoesMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    //Atributos
    private Map<String, String> dicionario;


    //Construtor
    public Dicionario(){
        dicionario = new HashMap<>();
    }

    //Métodos
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }
        else{
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirPalavras(){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        }
        else{
            System.out.println("Não há nenhuma palavra cadastrada no dicionário ainda, que tal cadastrar algumas você mesmo?");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        
        if(definicao != null){
            return definicao;
        }
        else{
            return "A palavra " + palavra + " não foi encontrada no dicionário...";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario1 = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario1.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario1.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario1.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
       
        dicionario1.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario1.pesquisarPorPalavra("java");
        System.out.println("\nDefinição da linguagem 'java': " + definicaoJava + "\n");
    
        String definicaoCSharp = dicionario1.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp + "\n");
    
        // Remover uma palavra
        dicionario1.removerPalavra("typescript");
        System.out.println("Reexibindo as palavras cadastradas após as mudanças...");
        dicionario1.exibirPalavras();
      }
}
