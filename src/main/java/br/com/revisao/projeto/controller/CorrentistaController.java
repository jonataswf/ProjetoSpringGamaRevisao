package br.com.revisao.projeto.controller;

import br.com.revisao.projeto.dto.CorrentistaDto;
import br.com.revisao.projeto.model.correntista.Correntista;
import br.com.revisao.projeto.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController {

    @Autowired
    CorrentistaRepository correntistaRepository;

    @GetMapping
    public ResponseEntity<List<CorrentistaDto>> getCorrentistas(){
        Iterable<Correntista> ee = correntistaRepository.findAll();
        for (Correntista dto : ee) {
            dto.getId();

        }

        return ResponseEntity.status(HttpStatus.OK).body(listaCorrentistas);
    }

    @PostMapping
    public ResponseEntity<Correntista> saveCorrentistas(@RequestBody Correntista correntista){
        Correntista corrent = correntistaRepository.save(correntista);
        return ResponseEntity.status(HttpStatus.CREATED).body(corrent);

    }
}
