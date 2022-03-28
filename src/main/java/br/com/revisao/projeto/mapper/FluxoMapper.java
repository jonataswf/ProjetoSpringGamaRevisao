package br.com.revisao.projeto.mapper;

import br.com.revisao.projeto.dto.fluxo.FluxoDto;
import br.com.revisao.projeto.model.fluxo.FluxoCaixa;
import br.com.revisao.projeto.model.fluxo.FluxoCaixaId;
import org.springframework.stereotype.Component;

@Component
public class FluxoMapper {

    public static FluxoDto parse(FluxoCaixa fluxoCaixa) {
        var fluxoDto = new FluxoDto();
        fluxoDto.setAg(fluxoCaixa.getId().getAg());
        fluxoDto.setConta(fluxoCaixa.getId().getConta());
        fluxoDto.setFluxo(fluxoCaixa.getId().getFluxo());
        fluxoDto.setEntrada(fluxoCaixa.getEntrada());
        fluxoDto.setSaida(fluxoCaixa.getSaida());
        return fluxoDto;
    }

    public static FluxoCaixa parse(FluxoDto fluxoDto){
        var fluxoCaixa = new FluxoCaixa();
        var fluxoCaixaId = new FluxoCaixaId(fluxoDto.getAg(), fluxoDto.getConta(), fluxoDto.getFluxo());
        fluxoCaixa.setId(fluxoCaixaId);
        fluxoCaixa.setEntrada(fluxoDto.getEntrada());
        fluxoCaixa.setSaida(fluxoDto.getSaida());
        return fluxoCaixa;
    }

}
