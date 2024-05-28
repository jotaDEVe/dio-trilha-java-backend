package list.pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    
    // Atributos
    private List<Integer> listaNumeros;

    // Construtor
    public ListaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    // Adicionar números
    public void adicionarNumero(int num){
        listaNumeros.add(num);
    }

    // Calcular soma
    public void calcularSoma(){
        int somatorio = 0;
        for(Integer n : listaNumeros){
            somatorio += n;
        }
        System.out.println("A soma dos números da sua lista é igual a " + somatorio);
    }

    // Encontrar maior número
    public void encontrarMaiorNumero(){

        // maiorNum parte do menor inteiro possivel até achar o maior valor da lista percorrida

       int maiorNum = Integer.MIN_VALUE;
       if(!listaNumeros.isEmpty()){
        for(Integer n : listaNumeros){
            if (n > maiorNum){
                maiorNum = n;
            }
        }
        System.out.println("O maior número da lista é " + maiorNum);
       }
        // Lança um erro se a lista estiver vazia
       else {
        throw new RuntimeException("A lista está vazia!");
       }
    }

    // Encontrar menor número
    public void encontrarMenorNumero(){
        
        // menorNum parte do maior inteiro possível até achar o menor valor da lista percorrida

        int menorNum = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()){
            for(Integer n : listaNumeros){
                if (n < menorNum){
                    menorNum = n;
                }
            }
            System.out.println("O menor número da lista é " + menorNum);
        }
        // Lança um erro se a lista estiver vazia
        else {
            throw new RuntimeException("A Lista está vazia!");
        }
        
    }

    // Exibe os números da lista
    public void exibirNumeros(){
        System.out.println("Esses são os números da sua lista: " + listaNumeros);
    }

    // Método main
    
    public static void main(String[] args) {
        ListaNumeros lista1 = new ListaNumeros();

        // Adicionando números a lista
        lista1.adicionarNumero(3);
        lista1.adicionarNumero(32);
        lista1.adicionarNumero(1);
        lista1.adicionarNumero(42);
        lista1.adicionarNumero(5);

        // Exibindo os números adicionados
        lista1.exibirNumeros();

        // Calculando a soma de todos os números da lista
        lista1.calcularSoma();

        // Encontrando o maior número da lista
        lista1.encontrarMaiorNumero();

        // Encontrando o menor número da lista
        lista1.encontrarMenorNumero();
        

    }
}
