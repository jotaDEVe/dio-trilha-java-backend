package map.pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    //Atributos
    private Map<String, Integer> contagemMap;

    //Construtor
    public ContagemPalavras(){
        contagemMap = new HashMap<>();
    }

    //Métodos
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemMap.isEmpty()){
            contagemMap.remove(palavra);
        }
        else{
            System.out.println("A lista está vazia!");
        }
    }

    public int exibirContagemPalavras(){
        int contagem = 0;
        for (int c : contagemMap.values()){
            contagem += c;
        }
        return contagem;
    }

    public String encontrarPalavraMaisFrequente(){
       String palavraMaisFrequente = null;
       Integer maiorNumVezes = Integer.MIN_VALUE;
       for(Map.Entry<String, Integer> entry : contagemMap.entrySet()){
          if (entry.getValue() > maiorNumVezes){
            palavraMaisFrequente = entry.getKey();
          }
       }
       return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();
    
        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    
        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
      }

}
