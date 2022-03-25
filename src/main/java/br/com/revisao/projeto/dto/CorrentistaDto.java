package br.com.revisao.projeto.dto;

import br.com.revisao.projeto.model.correntista.Correntista;
import java.math.BigDecimal;

public class CorrentistaDto {

    private Integer  ag;
    private Integer  conta;
    private String nome;
    private String email;
    private String telefone;
    private BigDecimal saldo;

    public CorrentistaDto(Correntista correntistas) {
            this.ag = correntistas.getId().getAg();
            this.conta = correntistas.getId().getConta();
            this.nome = correntistas.getNome();
            this.email = correntistas.getEmail();
            this.telefone = correntistas.getTelefone();
            this.saldo = correntistas.getSaldo();
    }
}
