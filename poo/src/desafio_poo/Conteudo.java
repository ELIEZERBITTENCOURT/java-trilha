package desafio;

public abstract class Conteudo {
    protected String titulo;
    protected String descricao;
    protected static final double XP_PADRAO = 10d;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    @Override
    public String toString() {
        return "Título: " + titulo + ", Descrição: " + descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
