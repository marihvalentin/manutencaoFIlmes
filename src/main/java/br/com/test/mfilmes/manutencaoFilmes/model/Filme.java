package br.com.test.mfilmes.manutencaoFilmes.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Filme
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //hibernate gera id auto-increment
    private Integer id;

    private String titulo;
    private String diretor;
    private String genero;
    private String sinopse;
    private int ano;

    //construtor para cadastro de novos filmes
    public Filme(String titulo, String diretor, String genero, String sinopse, int ano)
    {
        super();
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.ano = ano;
    }

    //getter and setters
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getDiretor()
    {
        return diretor;
    }

    public void setDiretor(String diretor)
    {
        this.diretor = diretor;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getSinopse()
    {
        return sinopse;
    }

    public void setSinopse(String sinopse)
    {
        this.sinopse = sinopse;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }
}
