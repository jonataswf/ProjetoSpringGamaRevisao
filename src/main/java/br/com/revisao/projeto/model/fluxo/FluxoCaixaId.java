package br.com.revisao.projeto.model.fluxo;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FluxoCaixaId implements Serializable {

    private Integer ag;
    private Integer conta;
    private Integer fluxo;

    public FluxoCaixaId() {
    }

    public FluxoCaixaId(Integer ag, Integer conta, Integer fluxo) {
        this.ag = ag;
        this.conta = conta;
        this.fluxo = fluxo;
    }

    public Integer getAg() {
        return ag;
    }

    public void setAg(Integer ag) {
        this.ag = ag;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Integer getFluxo() {
        return fluxo;
    }

    public void setFluxo(Integer fluxo) {
        this.fluxo = fluxo;
    }
}
