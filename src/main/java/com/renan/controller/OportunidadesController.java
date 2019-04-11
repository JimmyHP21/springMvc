package com.renan.controller;

import com.renan.model.Oportunidade;
import com.renan.repository.OportunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/oportunidades")
public class OportunidadesController {

    @Autowired
    private OportunidadeRepository oportunidaderepository;

    @GetMapping
    public List<Oportunidade> listar() {
        return oportunidaderepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oportunidade> buscar(@PathVariable Long id) {
        Optional<Oportunidade> opt = oportunidaderepository.findById(id);

        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(opt.get());
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Oportunidade adicionar(@Valid @RequestBody Oportunidade oportunidade) {

        Optional<Oportunidade> oportunidadeExistente = oportunidaderepository
            .findByDescricaoAndNomeProspecto(oportunidade.getDescricao(), oportunidade.getNomeProspecto());

        if (oportunidadeExistente.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ja existe uma oportunidade com a mesma descricao");
        }

        return oportunidaderepository.save(oportunidade);
    }

    @PutMapping("/atualizar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Oportunidade atualizar(@Valid @RequestBody Oportunidade oportunidade, @PathVariable Long id) {

        Optional<Oportunidade> opor = oportunidaderepository.findById(id);
        Optional<Oportunidade> optExistente = oportunidaderepository.findByDescricaoAndNomeProspecto(oportunidade.getDescricao(), oportunidade.getNomeProspecto());

        return oportunidaderepository.findById(id)
            .map(opt -> {
                if (optExistente.isPresent())
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ja existe uma oportunidade com a mesma descricao");

                opt.setNomeProspecto(oportunidade.getNomeProspecto());
                opt.setDescricao(oportunidade.getDescricao());
                opt.setValor(Optional.ofNullable(oportunidade.getValor()).isEmpty() ? opor.get().getValor() : oportunidade.getValor());

                return oportunidaderepository.save(opt);
            })
            .orElseGet(() -> {
                oportunidade.setId(id);
                return oportunidaderepository.save(oportunidade);
            });
    }

    @DeleteMapping("/remover/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {

        Optional<Oportunidade> opt = oportunidaderepository.findById(id);

        if (opt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("ID = %d nao encontrado no banco!!", id));
        }

        oportunidaderepository.delete(opt.get());
    }
}
