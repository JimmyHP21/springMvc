package com.renan.repository;

import com.renan.model.Oportunidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OportunidadeRepository extends JpaRepository<Oportunidade,Long> {

    Optional<Oportunidade> findByNomeAndSobrenomeAndTelefone(String nome, String sobrenome,String telefone);

    Optional<Oportunidade> findByNome(String nome);

    Optional<Oportunidade> findBySobrenome(String sobrenome);

    Optional<Oportunidade> findByTelefone(String telefone);
}
