package atv;

public class Transacao {
    private int id;
    private String descricao;
    private double valor;
    private String tipo;
    private String data;

    public Transacao(int id, String descricao, double valor, String tipo, String data) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public void atualizarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Data: " + data);
        System.out.println("--------------------------------");
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}

