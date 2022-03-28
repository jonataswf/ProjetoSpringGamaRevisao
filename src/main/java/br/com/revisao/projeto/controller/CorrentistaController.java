package br.com.revisao.projeto.controller;

import br.com.revisao.projeto.dto.correntista.CorrentistaDto;
import br.com.revisao.projeto.mapper.CorrentistaMapper;
import br.com.revisao.projeto.model.correntista.Correntista;
import br.com.revisao.projeto.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController {

    @Autowired
    CorrentistaRepository correntistaRepository;

    @GetMapping
    public ResponseEntity<List<CorrentistaDto>> getCorrentistas() {
        List<Correntista> correntistasEntity = correntistaRepository.findAll();
        List<CorrentistaDto> corr = new ArrayList<>();
        for (Correntista i : correntistasEntity) {
            CorrentistaDto correntistaDto = CorrentistaMapper.parse(i);
            corr.add(correntistaDto);
        }
        return ResponseEntity.status(HttpStatus.OK).body(corr);
    }

    @PostMapping
    public ResponseEntity<CorrentistaDto> saveCorrentista(@RequestBody CorrentistaDto correntistaDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(CorrentistaMapper.parse(correntistaRepository.save(CorrentistaMapper.parse(correntistaDto))));
    }

}
