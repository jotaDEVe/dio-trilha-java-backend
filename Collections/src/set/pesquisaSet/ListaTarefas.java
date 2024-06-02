package set.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    // Atributos
    private Set<Tarefa> listaTarefas;

    // Construtor
    public ListaTarefas(){
        this.listaTarefas = new HashSet<>();
    }

    // Métodos

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        
        if(!listaTarefas.isEmpty()){
            for (Tarefa t : listaTarefas){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    Tarefa tarefaParaRemover = t;
                    listaTarefas.remove(tarefaParaRemover);
                }
                break;
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
       System.out.println(listaTarefas.size());
    }

    public void obterTarefasConcluidas(){
         // Instancia um novo set que recebe as tarefas concluidas
        Set<Tarefa> setTarefasConcluidas = new HashSet<>();

         // Verifica se a lista está vazia
        if(!listaTarefas.isEmpty()){
            // Itera sobre os elementos da lista procurando pelo status
            for (Tarefa t : listaTarefas){
                if (t.getStatus() == true){
                    setTarefasConcluidas.add(t);
                }
            }

            // Exibe o novo set com as tarefas concluidas
            System.out.println(setTarefasConcluidas);

        } else{
            System.out.println("A lista está vazia");
        }
    }

    public void obterTarefasPendentes(){
        // Instancia um novo set que recebe as tarefas pendentes
        Set<Tarefa> setTarefasPendentes = new HashSet<>();

         // Verifica se a lista está vazia
        if(!listaTarefas.isEmpty()){
            // Itera sobre os elementos da lista procurando pelo status
            for (Tarefa t : listaTarefas){
                if (t.getStatus() == false){
                    setTarefasPendentes.add(t);
                }
            }

            // Exibe o novo set com as tarefas pendentes
            System.out.println(setTarefasPendentes);

        } else{
            System.out.println("A lista está vazia");
        }
    }
    

    public void marcarTarefaConcluida(String descricao){

        // Itera sobre os elementos da lista para encontrar a tarefa com a descrição fornecida
        for (Tarefa t : listaTarefas){
            if (t.getDescricao().equals(descricao)){

                // Seta o status da tarefa como True (concluida)
                t.setStatus(true);
            }
            break;
        }
    }

    public void marcarTarefaPendente(String descricao){

        // Itera sobre os elementos da lista para encontrar a tarefa com a descrição fornecida
        for (Tarefa t : listaTarefas){
            if (t.getDescricao().equals(descricao)){

                // Seta o status da tarefa como False (pendente)
                t.setStatus(false);
            }
            break;
        }
    }

    public void limparListaTarefas(){

        listaTarefas.removeAll(listaTarefas);

    }

    public static void main(String[] args) {
        ListaTarefas testList = new ListaTarefas();

        testList.adicionarTarefa("Varrer a casa");
        testList.adicionarTarefa("Fazer almoço");
        testList.adicionarTarefa("Lavar a louça");
        testList.adicionarTarefa("Tomar banho");
        testList.contarTarefas();
        testList.exibirTarefas();
        testList.removerTarefa("Varrer a casa");
        testList.exibirTarefas();
        testList.marcarTarefaConcluida("Lavar a louça");
        testList.marcarTarefaConcluida("Tomar banho");
        testList.obterTarefasConcluidas();
        testList.obterTarefasPendentes();


    }
}
