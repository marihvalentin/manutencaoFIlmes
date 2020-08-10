package br.com.test.mfilmes.manutencaoFilmes.controller;

import br.com.test.mfilmes.manutencaoFilmes.controller.dto.FilmeDto;
import br.com.test.mfilmes.manutencaoFilmes.model.Filme;
import br.com.test.mfilmes.manutencaoFilmes.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class FilmeController
{
    @Autowired
    private FilmeRepository filmeRepository;

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/listarFilmes")
    @ResponseBody
    public List<FilmeDto> listaFilmes(String titulo)
    {
        //filtrar resultados por título
        if(titulo == null)
        {
            List<Filme> filmes = filmeRepository.findAll(); //consulta e traz todos os registros do banco de dados
            return FilmeDto.converter(filmes);
        }
        else
        {
            List<Filme> filmes = filmeRepository.findByTitulo(titulo);

            return FilmeDto.converter(filmes);
        }
    }

}
