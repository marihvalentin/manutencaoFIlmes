package br.com.test.mfilmes.manutencaoFilmes.controller.dto;

import br.com.test.mfilmes.manutencaoFilmes.model.Filme;

import java.util.List;
import java.util.stream.Collectors;

public class FilmeDto
{
    private String titulo;
    private String diretor;

    public FilmeDto(Filme filme)
    {
        this.titulo = filme.getTitulo();
        this.diretor = filme.getDiretor();
    }

    //Converter uma lista de Filme para uma lista de FilmeDto com o Java8
    public static List<FilmeDto> converter(List<Filme> filmes)
    {
        return filmes.stream().map(FilmeDto::new).collect(Collectors.toList());
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getDiretor()
    {
        return diretor;
    }
}
