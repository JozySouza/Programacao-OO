package Fundamentos;

public class Ex01_Livro {

    private String titulo,autor,assunto,editora,resumo;
    private int quantidadePaginas,isbn;

    //construtores

    public Ex01_Livro(String titulo, String autor, String assunto, String editora, String resumo, int quantidadePaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.editora = editora;
        this.resumo = resumo;
        this.quantidadePaginas = quantidadePaginas;
        this.isbn = isbn;
    }


    //getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getEditora() {
        return editora;
    }

    public String getResumo() {
        return resumo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public int getIsbn() {
        return isbn;
    }


    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Ex01_Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", assunto='" + assunto + '\'' +
                ", editora='" + editora + '\'' +
                ", resumo='" + resumo + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                ", isbn=" + isbn +
                '}';
    }
}
