package atv;

public class Produto {

    private String codigo;
    private String nome;
    private int quantidadeEst;
    private double preco;

    public Produto(String cd, String nom, int qts, double pc) {
        this.codigo = cd;
        this.nome = nom;
        this.quantidadeEst = qts;
        this.preco = pc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double pc) {
        this.preco = pc;
    }

    public int getQuantidadeEst() {
        return quantidadeEst;
    }

    public void setQuantidadeEst(int qts) {
        this.quantidadeEst = qts;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String cd) {
        this.codigo = cd;
    }


    public void atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeEst = novaQuantidade;
        } else {
            System.out.println("Erro: quantidade negativa");
        }
    }

    public double calcularValorEstoque() {
        return this.quantidadeEst * this.preco;
    }

    public void exibirInformacoes() {
        System.out.println("PRODUTO:");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidadeEst);
        System.out.println("Preço: " + preco);
    }
}
