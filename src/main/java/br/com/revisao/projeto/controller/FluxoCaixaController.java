package br.com.revisao.projeto.controller;

import br.com.revisao.projeto.repository.FluxoCaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fluxo")
public class FluxoCaixaController {

    @Autowired
    FluxoCaixaRepository fluxoCaixaRepository;
}
