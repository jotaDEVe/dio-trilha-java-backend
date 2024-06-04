package map.ordenacaoMap;

import java.util.Comparator;
import java.util.Map;

public class Livro {

    //Atributos
    private String _titulo;
    private String _autor;
    private double _preco;

    //Construtor
    public Livro(String titulo, String autor, double preco){
        this._autor = autor;
        this._preco = preco;
        this._titulo = titulo;
    }

    //Getters
    public String getTitulo(){
        return _titulo;
    }

    public String getAutor(){
        return _autor;
    }

    public Double getPreco(){
        return _preco;
    }

    @Override
  public String toString() {
    return "Livro{" +
        "titulo='" + _titulo + '\'' +
        ", autor='" + _autor + '\'' +
        ", preco=" + _preco +
        '}';
  }
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
  @Override
  public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
    return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
  }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
  @Override
  public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
    return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
  }
}
