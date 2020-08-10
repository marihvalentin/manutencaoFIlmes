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
    public List<FilmeDto> listaFilmes()
    {
        List<Filme> filmes = filmeRepository.findAll(); //consulta e traz todos os registros do banco de dados
        return FilmeDto.converter(filmes);
    }

}
