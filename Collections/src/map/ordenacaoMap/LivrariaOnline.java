package map.ordenacaoMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {

    //Atributos
    private Map<String, Livro> livrariaMap;

    //Construtor
    public LivrariaOnline(){
        livrariaMap = new HashMap<>();
    }

    //Métodos
    public void adicionarLivro(String isbn, Livro livro){
        livrariaMap.put(isbn, livro);
    };

    public void removerLivro(String titulo){
        List<String> chavesParaRemover = new ArrayList<>();
        for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesParaRemover.add(entry.getKey());
            }
        }

        for(String chave : chavesParaRemover){
            livrariaMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        // Crio um List para ordernar os livros por preço
       List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());
       // Ordeno os livros por preço utilizando o Comparator sobreescrito na classe Livro.java
       Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
       // Crio um LinkedHashMap que conseguirá manter a proposta de ordenação, (diferente do HashMap)
       Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

       // Passo os valores da minha lista para o meu LinkedHashMap
       for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
        livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
       }

       // Exibo os livros ordenados no LinkedHashMap
       return livrosOrdenadosPorPreco;

    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        // Crio um List para ordernar os livros por autor
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());
        // Ordeno os livros por autor utilizando o Comparator sobreescrito na classe Livro.java
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        // Crio um LinkedHashMap que conseguirá manter a proposta de ordenação, (diferente do HashMap)
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
    
        // Passo os valores da minha lista para o meu LinkedHashMap
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
          livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
    
        // Exibo os livros ordenados no LinkedHashMap
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        // Crio o LinkedHashMap que irá receber todos os livros do autor passado como parâmetro
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        // Acho todos as chaves onde o valor do autor é o mesmo do parâmetro passado
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
          Livro livro = entry.getValue();
          if (livro.getAutor().equals(autor)) {

            // Insiro os livros filtrados dentro do LinkedHashSet criado no começo do método
            livrosPorAutor.put(entry.getKey(), livro);
          }
        }
        // Exibo os livros do autor escolhido
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {

        // Instancio a lista que receberá os livros mais caros
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;
    
        if (!livrariaMap.isEmpty()) {
            // Itero sobre os livros do HashMap padrão procurando pelo de maior preço
          for (Livro livro : livrariaMap.values()) {
            if (livro.getPreco() > precoMaisAlto) {
              precoMaisAlto = livro.getPreco();
            }
          }
        } else {
          throw new NoSuchElementException("A livraria está vazia!");
        }
    
        // Itero sobre o HashMap e adiciono os livros mais caros dentro da lista final
        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
          if(entry.getValue().getPreco() == precoMaisAlto) {
            Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
            livrosMaisCaros.add(livroComPrecoMaisAlto);
          }
        }
        return livrosMaisCaros;
    }

      public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
    
        if (!livrariaMap.isEmpty()) {
          for (Livro livro : livrariaMap.values()) {
            if (livro.getPreco() < precoMaisBaixo) {
              precoMaisBaixo = livro.getPreco();
            }
          }
        } else {
          throw new NoSuchElementException("A livraria está vazia!");
        }
    
        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
          if(entry.getValue().getPreco() == precoMaisBaixo) {
            Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
            livrosMaisBaratos.add(livroComPrecoMaisBaixo);
          }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
    
        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());
    
        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());
    
        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);
    
        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
    
        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());
    
        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livrariaMap);
    
      }

}
