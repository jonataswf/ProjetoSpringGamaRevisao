package br.com.revisao.projeto.controller;

import br.com.revisao.projeto.dto.correntista.CorrentistaDto;
import br.com.revisao.projeto.dto.fluxo.FluxoDto;
import br.com.revisao.projeto.mapper.CorrentistaMapper;
import br.com.revisao.projeto.mapper.FluxoMapper;
import br.com.revisao.projeto.model.fluxo.FluxoCaixa;
import br.com.revisao.projeto.repository.FluxoCaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fluxo")
public class FluxoCaixaController {

    @Autowired
    FluxoCaixaRepository fluxoCaixaRepository;

    @GetMapping
    public ResponseEntity<List<FluxoDto>> getFluxos() {
        List<FluxoCaixa> fluxoCaixaEntity = fluxoCaixaRepository.findAll();
        List<FluxoDto> flu= new ArrayList<>();
        for (FluxoCaixa i : fluxoCaixaEntity) {
            FluxoDto fluxoDto = FluxoMapper.parse(i);
            flu.add(fluxoDto);
        }
        return ResponseEntity.status(HttpStatus.OK).body(flu);
    }

    @PostMapping
    public ResponseEntity<FluxoDto> saveFluxo(@RequestBody FluxoDto fluxoDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(FluxoMapper.parse(fluxoCaixaRepository.save(FluxoMapper.parse(fluxoDto))));
    }
}
