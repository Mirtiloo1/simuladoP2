package atv;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<livro> livros; 

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(livro livro) {
        livros.add(livro);
    }

    public boolean removerLivro(livro livro) {
        return livros.remove(livro);
    }

    public void exibirLivros() {
        for (livro livro : livros) {
            livro.exibirInformacoes(); 
        }
    }

    public ArrayList<livro> buscarLivro(String termo) {
        ArrayList<livro> resultados = new ArrayList<>();
        for (livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(termo.toLowerCase()) || 
                livro.getAutor().toLowerCase().contains(termo.toLowerCase())) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

}
