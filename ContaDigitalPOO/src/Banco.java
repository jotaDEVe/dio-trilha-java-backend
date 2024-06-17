import java.util.List;

public class Banco {

    //Atributos
    private String nome;
    private List<Conta> listaDeContas;

    //Getter
    public String getNome(){
        return nome;
    }

    public List<Conta> getContas(){
        return listaDeContas;
    }
}
