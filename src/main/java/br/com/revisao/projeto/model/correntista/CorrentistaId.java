package br.com.revisao.projeto.model.correntista;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public final class CorrentistaId implements Serializable {

    private Integer ag;
    private Integer conta;

    public CorrentistaId() {
    }

    public CorrentistaId(Integer ag, Integer conta) {
        this.ag = ag;
        this.conta = conta;
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
}


