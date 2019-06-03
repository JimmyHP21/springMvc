package com.renan.repository;

import com.renan.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClienteModel,Long>  {
}
