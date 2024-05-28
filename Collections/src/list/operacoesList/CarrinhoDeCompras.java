package list.operacoesList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributos
    private List<Item> carrinho;

    // Construtor
    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    // Adicionar itens
    public void adicionarItem(String nome, double preco, int quantidade){
        Item newItem = new Item(nome, preco, quantidade);
        carrinho.add(newItem);
        System.out.println(newItem);
    }

    // Remover itens
    public void removerItem(String nome){
        List<Item> removerCarrinho = new ArrayList<>();
        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                removerCarrinho.add(i);
            }
        }
        carrinho.removeAll(removerCarrinho);
        System.out.println("Itens removidos!");
    }

    // Calcular o valor total
    public void calcularValorTotal(){
        double somatoria = 0;
        for(Item i : carrinho){
            somatoria += i.getPreco() * i.getQuantidade();
        }
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("O valor total dos produtos do seu carrinho é de R$" + df.format(somatoria));
    }

    // Exibir os itens da lista
    public void exibirItens(){
        for(Item i : carrinho){
            System.out.println(i.toString());
        }
    }

    // Método main
    public static void main(String[] args) {

        // Instancia a classe CarrinhoDeCompras
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        // Adiciona os itens ao carrinho e os exibe
        carrinho1.adicionarItem("MOLETOM", 199.99, 1);
        carrinho1.adicionarItem("CAMISETA", 79.99, 5);
        carrinho1.adicionarItem("TOUCA", 39.99, 3);

        // Remove o item "camiseta" do carrinho
        carrinho1.removerItem("camiseta");

        // Exibe os itens adicionados
        carrinho1.exibirItens();

        // Calcula o valor total do carrinho
        carrinho1.calcularValorTotal();
       

    }

}
