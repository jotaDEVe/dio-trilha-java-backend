package list.operacoesList;

public class Item {

    // Atributos
    private String nome;
    private Double preco;
    private int quantidade;

    // Construtor
    public Item(String nome, double preco, int quantidade){  
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getter nome
    public String getNome(){
        return nome;
    }

     // Getter preço
    public Double getPreco(){
        return preco;
    }

     // Getter quantidade
    public int getQuantidade(){
        return quantidade;
    }

     // toString
    public String toString(){
        return "Produto: " +getNome()+ " || Preço: " +getPreco()+ "|| Quantidade: " +getQuantidade()+ ".";
    }
}
