package br.com.test.mfilmes.manutencaoFilmes.controller;

import br.com.test.mfilmes.manutencaoFilmes.controller.dto.FilmeDto;
import br.com.test.mfilmes.manutencaoFilmes.controller.form.FilmeForm;
import br.com.test.mfilmes.manutencaoFilmes.model.Filme;
import br.com.test.mfilmes.manutencaoFilmes.repository.FilmeRepository;
import br.com.test.mfilmes.manutencaoFilmes.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class FilmeController
{
    //injeção dos atributos repository
    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private GeneroRepository generoRepository;

    //redirecionamento para página index
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    //método Listar Filmes
    @RequestMapping(value ="/listarFilmes", method = RequestMethod.GET)
    @ResponseBody
    public List<FilmeDto> listaFilmes(@RequestBody String titulo, String genero)
    {
        //filtrar resultados por título ou genero
        if(!(titulo == null))
        {
            List<Filme> filmes = filmeRepository.findByTitulo(titulo);
            return FilmeDto.converter(filmes);
        }
        else if(!(genero == null))
        {
            List<Filme> filmes = filmeRepository.findByGenero(genero);
            return FilmeDto.converter(filmes);
        }
        else
        {
            List<Filme> filmes = filmeRepository.findAll(); //consulta e traz todos os registros do banco de dados
            return FilmeDto.converter(filmes);
        }
    }

    //método para inclusão de filmes
    @RequestMapping(value = "/incluirFilme", method = RequestMethod.POST)
    public void incluir(@RequestBody FilmeForm form)
    {
        Filme filme = form.converter(generoRepository);
        filmeRepository.save(filme);
    }

}
