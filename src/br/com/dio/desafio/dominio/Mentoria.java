package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate datal;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatal() {
        return datal;
    }

    public void setDatal(LocalDate datal) {
        this.datal = datal;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", datal=" + datal +
                '}';
    }

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate datal) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.datal = datal;
    }
}
