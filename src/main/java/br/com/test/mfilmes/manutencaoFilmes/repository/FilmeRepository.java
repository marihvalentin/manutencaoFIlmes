package br.com.test.mfilmes.manutencaoFilmes.repository;

import br.com.test.mfilmes.manutencaoFilmes.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer>
{

}
