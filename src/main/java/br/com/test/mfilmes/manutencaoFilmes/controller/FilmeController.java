package br.com.test.mfilmes.manutencaoFilmes.controller;

import br.com.test.mfilmes.manutencaoFilmes.controller.dto.FilmeDto;
import br.com.test.mfilmes.manutencaoFilmes.model.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class FilmeController
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/listarFilmes.html")
    @ResponseBody
    public List<FilmeDto> listaFilmes()
    {
        Filme filme = new Filme("Marvel's The Avengers", "Joss Whedon",
                "Ação, Ficção Científica", "Loki, o irmão de Thor, ganha acesso ao poder ilimitado " +
                "do cubo cósmico ao roubá-lo de dentro das instalações da S.H.I.E.L.D. Nick Fury, o diretor desta " +
                "agência internacional que mantém a paz, logo reúne os únicos super-heróis que serão capazes de " +
                "defender a Terra de ameaças sem precedentes. Homem de Ferro, Capitão América, Hulk, Thor, Viúva Negra " +
                "e Gavião Arqueiro formam o time dos sonhos de Fury, mas eles precisam aprender a colocar os egos de " +
                "lado e agir como um grupo em prol da humanidade.", 2012);

        return FilmeDto.converter(Arrays.asList(filme, filme, filme));
    }

}
