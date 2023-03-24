public class Livro extends Item {
    private int numeroPaginas;
    private int anoPublicacao;
    private String editora;

    public Livro(String titulo, String autor, boolean disponivel, int numeroPaginas, int anoPublicacao, String editora) {
        super(titulo, autor, disponivel);
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}

