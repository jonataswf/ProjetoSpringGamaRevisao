package br.com.revisao.projeto.mapper;

import br.com.revisao.projeto.dto.correntista.CorrentistaDto;
import br.com.revisao.projeto.model.correntista.Correntista;
import br.com.revisao.projeto.model.correntista.CorrentistaId;
import org.springframework.stereotype.Component;

@Component
public class CorrentistaMapper {

    public static CorrentistaDto parse(Correntista correntista) {
        var correntistaDto = new CorrentistaDto();
        correntistaDto.setAg(correntista.getId().getAg());
        correntistaDto.setConta(correntista.getId().getConta());
        correntistaDto.setNome(correntista.getNome());
        correntistaDto.setEmail(correntista.getEmail());
        correntistaDto.setTelefone(correntista.getTelefone());
        correntistaDto.setSaldo(correntista.getSaldo());
        return correntistaDto;
    }

    public static Correntista parse(CorrentistaDto correntistaDto){
        var correntista = new Correntista();
        var correntistaId = new CorrentistaId(correntistaDto.getAg(), correntistaDto.getConta());
        correntista.setId(correntistaId);
        correntista.setNome(correntistaDto.getNome());
        correntista.setEmail(correntistaDto.getEmail());
        correntista.setTelefone(correntistaDto.getTelefone());
        correntista.setSaldo(correntistaDto.getSaldo());
        return correntista;
    }

}
