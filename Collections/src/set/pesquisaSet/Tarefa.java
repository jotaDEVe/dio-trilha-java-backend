package set.pesquisaSet;

public class Tarefa {

    // Atributos
    private String _descricao;
    private Boolean _status = false;

    // Construtor
    public Tarefa(String descricao){
        this._descricao = descricao;
        this._status = false;
    }

    // Métodos Getters
    public String getDescricao(){
        return _descricao;
    }
    public Boolean getStatus(){
        return _status;
    }

    // Métodos Setters

    public void setStatus(Boolean b){
        _status = b;
    }

    // Sobreescrevendo o método equals

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tarefa outraTarefa = (Tarefa) obj;
        return _descricao != null ? _descricao.equals(outraTarefa._descricao) : outraTarefa._descricao == null;
    }
}
