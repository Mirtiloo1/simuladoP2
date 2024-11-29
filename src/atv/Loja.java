package atv;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public boolean removerProduto(Produto produto) {
        return produtos.remove(produto);
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
        }
    }

    public void atualizarQuantidadeProduto(String codigoProduto, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigoProduto)) {
                produto.atualizarQuantidade(novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : this.produtos) {
            valorTotal += produto.calcularValorEstoque();
        }
        return valorTotal;
    }
}
