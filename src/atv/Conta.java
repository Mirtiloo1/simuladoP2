package atv;

import java.util.ArrayList;

public class Conta {
    private double saldo;
    private ArrayList<Transacao> transacoes;

    public Conta() {
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
        if (transacao.getTipo().equals("receita")) {
            saldo += transacao.getValor();
        } else if (transacao.getTipo().equals("despesa")) {
            saldo -= transacao.getValor();
        }
    }

    public boolean removerTransacao(int id) {
        for (Transacao transacao : transacoes) {
            if (transacao.getId() == id) {
                transacoes.remove(transacao);
                if (transacao.getTipo().equals("receita")) {
                    saldo -= transacao.getValor();
                } else if (transacao.getTipo().equals("despesa")) {
                    saldo += transacao.getValor();
                }
                return true;
            }
        }
        return false;
    }

    public Transacao buscarTransacao(int id) {
        for (Transacao transacao : transacoes) {
            if (transacao.getId() == id) {
                return transacao;
            }
        }
        return null;
    }

    public double calcularSaldo() {
        return saldo;
    }

    public void exibirTodasTransacoes() {
        for (Transacao transacao : transacoes) {
            transacao.exibirInformacoes();
        }
    }
}

