package list.ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    // Atributos
    private List<Integer> listaInteiros;

    // Construtor
    public OrdenacaoNumeros(){
        this.listaInteiros = new ArrayList<>();
    }


    // Adicionar numeros a lista
    public void adicionarNumero(int num){
        listaInteiros.add(num);
    }

    // Ordena em ordem crescente usando o método .sort
    public List<Integer> ordenarCrescente(){
        List<Integer> listaCrescente = new ArrayList<>(this.listaInteiros);
        if(!listaInteiros.isEmpty()){
            Collections.sort(listaCrescente);
            return listaCrescente;
        }
        
        // Lança um erro caso a lista esteja vazia

        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Ordena em ordem decrescente utilizando o método reverseOrder em cima da lista crescente
    public List<Integer> ordenarDecrescente(){
        List<Integer> listaCrescente = new ArrayList<>(this.listaInteiros);
        if(!listaInteiros.isEmpty()){
            listaCrescente.sort(Collections.reverseOrder());
            return listaCrescente;
        }
        
        // Lança um erro caso a lista esteja vazia
        
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //exibe a lista em ordem de digitação
    public void exibirNumeros() {
        if (!listaInteiros.isEmpty()) {
          System.out.println(this.listaInteiros);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
      // Método main
      public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista em ordem de digitação
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarCrescente());
    
        // Exibindo a lista em ordem de digitação novamente
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDecrescente());
    
        // Exibindo a lista em ordem de digitação uma terceira vez
        numeros.exibirNumeros();
      }
    }


