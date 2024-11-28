package br.com.robsonlmds.random_pharses.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.robsonlmds.random_pharses.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase buscaFraseAleatoria();
}
