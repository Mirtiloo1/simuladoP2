package atv;

public class livro {
    private String titulo;
    private String autor;
    private int isbn;
    private boolean disponibilidade;

    public livro(String tit, String aut, int isbn, boolean disp) {
        this.titulo = tit;
        this.autor = aut;
        this.isbn = isbn;
        this.disponibilidade = disp;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    boolean realizarEmprestimo() {
    	if(disponibilidade) {
    		disponibilidade = false;
    		System.out.println("Você pegou o livro emprestado.");
    		return true;
    	}else {
    		System.out.println("Falha! Livro já foi emprestado.");
    		return false;
    	}
    }
    
    boolean devolverLivro() {
    	if(!disponibilidade) {
    		disponibilidade = true;
    		System.out.println("Livro devolvido.");
    		return true;
    	}else {
    		System.out.println("Falha! Livro já foi devolvido.");
    		return false;
    	}
    }
    
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível"));
    }
    
    
    
    
 }
