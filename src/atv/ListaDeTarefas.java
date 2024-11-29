package atv;

import java.util.ArrayList;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public boolean removerTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefas.remove(tarefa);
                return true;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                return tarefa;
            }
        }
        return null;
    }

    public void exibirTodasTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibirInformacoes();
        }
    }

    public void filtrarPorStatus(String status) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().equalsIgnoreCase(status)) {
                tarefa.exibirInformacoes();
            }
        }
    }

    public void filtrarPorPrioridade(int prioridade) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getPrioridade() == prioridade) {
                tarefa.exibirInformacoes();
            }
        }
    }

    public void filtrarPorResponsavel(String responsavel) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getResponsavel().equalsIgnoreCase(responsavel)) {
                tarefa.exibirInformacoes();
            }
        }
    }
}
