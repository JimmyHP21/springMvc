package com.renan.controller;

import com.renan.model.ClienteModel;
import com.renan.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClientesRepository clientes;

    @GetMapping
    public List<ClienteModel> listar(Pageable pageable){
        return (List<ClienteModel>) this.clientes.findAll(pageable);
    }
}
