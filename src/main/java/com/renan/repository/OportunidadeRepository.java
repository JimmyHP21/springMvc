package com.renan.repository;

import com.renan.model.Oportunidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OportunidadeRepository extends JpaRepository<Oportunidade,Long> {

    Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);

    Optional<Oportunidade> findByDescricao(String descricao);

    Optional<Oportunidade> findByNomeProspecto(String momeProspecto);
}
