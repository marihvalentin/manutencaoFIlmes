package br.com.test.mfilmes.manutencaoFilmes.controller.form;

import br.com.test.mfilmes.manutencaoFilmes.model.Filme;
import br.com.test.mfilmes.manutencaoFilmes.model.Genero;
import br.com.test.mfilmes.manutencaoFilmes.repository.GeneroRepository;

public class FilmeForm
{
    private String titulo;
    private String diretor;
    private String tipoGenero;
    private String sinopse;
    private int ano;

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //metodo que converte o form preenchido para um filme
    public Filme converter(GeneroRepository generoRepository)
    {
        Genero genero = generoRepository.findByTipo(tipoGenero);
        return new Filme(titulo, diretor, genero, sinopse, ano);
    }
}
