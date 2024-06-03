package set.ordenacaoSet;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>  {
    //Atributos
    private String _nome;
    private long _matricula;
    private double _media;

    //Construtor
    public Aluno(String nome, long matricula, double media){
        this._nome = nome;
        this._matricula = matricula;
        this._media = media;
    }

    @Override
    public int compareTo(Aluno a){
        return _nome.compareToIgnoreCase(a.getNome());
    }

    //Getters
    public String getNome(){
        return _nome;
    }

    public long getMatricula(){
        return _matricula;
    }

    public double getMedia(){
        return _media;
    }

    @Override
    public String toString() {
      return "Aluno{" +
          "nome='" + _nome + '\'' +
          ", matricula=" + _matricula +
          ", media=" + _media +
          '}';
    }
}
  


class ComparatorPorMedia implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia());
    }

}
