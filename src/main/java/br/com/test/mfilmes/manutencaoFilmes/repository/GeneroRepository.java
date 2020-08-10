package br.com.test.mfilmes.manutencaoFilmes.repository;

import br.com.test.mfilmes.manutencaoFilmes.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Integer>
{
    Genero findByTipo(String tipo);
}
