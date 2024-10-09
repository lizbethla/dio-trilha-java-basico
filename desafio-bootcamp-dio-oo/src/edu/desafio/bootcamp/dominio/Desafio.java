package edu.desafio.bootcamp.dominio;

public class Desafio extends Conteudo {

    private String repositorio;

    public Desafio() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 30d;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public String toString() {
        return "Desafio [ Titulo = " + getTitulo() + ", Descricao = "
                + getDescricao() + ", Repositorio = " + repositorio + "]";
    }

}
