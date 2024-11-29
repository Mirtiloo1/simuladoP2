package atv;

public class Tarefa {
    private int id;
    private String descricao;
    private int prioridade;
    private String status;
    private String responsavel;

    public Tarefa(int id, String descricao, int prioridade, String status, String responsavel) {
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
        this.responsavel = responsavel;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void atribuirResponsavel(String novoResponsavel) {
        this.responsavel = novoResponsavel;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + (prioridade == 1 ? "Alta" : (prioridade == 2 ? "Média" : "Baixa")));
        System.out.println("Status: " + status);
        System.out.println("Responsável: " + responsavel);
        System.out.println("--------------------------------");
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
