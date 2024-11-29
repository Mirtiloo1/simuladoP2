package atv;

public class Main {

	public static void main(String[] args) {
		
		/////////////// BIBLIOTECA //////////////////
		
		livro livro = new livro("Cidade de Papéis", "John Green", 123, true);
		livro livro2 = new livro("Harry Potter", "J.K Rowling", 123, true);
		
		livro.realizarEmprestimo();
		livro.devolverLivro();
		
		Biblioteca Biblioteca = new Biblioteca();
		
		Biblioteca.adicionarLivro(livro);
		Biblioteca.adicionarLivro(livro2);
		Biblioteca.exibirLivros();
		
		/////////////// LISTA DE TAREFAS //////////////////
		
//		ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
//
//        Tarefa tarefa1 = new Tarefa(1, "Desenvolver o sistema de gestão", 1, "Pendente", "Carlos");
//        Tarefa tarefa2 = new Tarefa(2, "Reunião de equipe", 2, "Em andamento", "Maria");
//        Tarefa tarefa3 = new Tarefa(3, "Preparar apresentação", 3, "Concluída", "João");
//
//        listaDeTarefas.adicionarTarefa(tarefa1);
//        listaDeTarefas.adicionarTarefa(tarefa2);
//        listaDeTarefas.adicionarTarefa(tarefa3);
//
//        System.out.println("Exibindo todas as tarefas:");
//        listaDeTarefas.exibirTodasTarefas();
//
//        System.out.println("\nAtualizando o status da tarefa 1:");
//        tarefa1.atualizarStatus("Em andamento");
//        listaDeTarefas.exibirTodasTarefas();
//
//        System.out.println("\nAtribuindo novo responsável à tarefa 2:");
//        tarefa2.atribuirResponsavel("Fernanda");
//        listaDeTarefas.exibirTodasTarefas();
//
//        System.out.println("\nBuscando tarefas com status 'Pendente':");
//        listaDeTarefas.filtrarPorStatus("Pendente");
//
//        System.out.println("\nBuscando tarefas com prioridade 1 (Alta):");
//        listaDeTarefas.filtrarPorPrioridade(1);
//
//        System.out.println("\nBuscando tarefas de responsável 'Carlos':");
//        listaDeTarefas.filtrarPorResponsavel("Carlos");
//
//        System.out.println("\nRemovendo a tarefa 3:");
//        listaDeTarefas.removerTarefa(3);
//        listaDeTarefas.exibirTodasTarefas();
		
		/////////////// GESTAO DE FINANÇAS //////////////////
		
//		 Conta conta = new Conta();
//
//        Transacao transacao1 = new Transacao(1, "Salário", 5000.00, "receita", "2024-11-01");
//        Transacao transacao2 = new Transacao(2, "Compra de supermercado", 200.00, "despesa", "2024-11-05");
//
//        conta.adicionarTransacao(transacao1);
//        conta.adicionarTransacao(transacao2);
//
//        System.out.println("Exibindo todas as transações:");
//        conta.exibirTodasTransacoes();
//
//        System.out.println("Saldo atual: " + conta.calcularSaldo());
//
//        transacao2.atualizarDescricao("Compra de supermercado e medicamentos");
//        System.out.println("\nApós atualizar a descrição da transação 2:");
//        conta.exibirTodasTransacoes();
//
//        System.out.println("\nRemovendo a transação 1:");
//        conta.removerTransacao(1);
//        conta.exibirTodasTransacoes();
//
//        System.out.println("Saldo atual após remoção: " + conta.calcularSaldo());
		
		/////////////// CONTROLE DE ESTOQUE  //////////////////
		
//		 Loja minhaLoja = new Loja();
//
//        Produto p1 = new Produto("001", "Camiseta", 50, 29.90);
//        Produto p2 = new Produto("002", "Calça Jeans", 30, 79.90);
//        Produto p3 = new Produto("003", "Tênis", 20, 199.90);
//
//        minhaLoja.adicionarProduto(p1);
//        minhaLoja.adicionarProduto(p2);
//        minhaLoja.adicionarProduto(p3);
//
//        p1.atualizarQuantidade(60);
//
//        minhaLoja.removerProduto(p2);
//
//        minhaLoja.exibirProdutos();
//
//        double valorTotalEstoque = minhaLoja.calcularValorTotalEstoque();
//        System.out.println("Valor total do estoque: R$ " + valorTotalEstoque);

	}
	
}
