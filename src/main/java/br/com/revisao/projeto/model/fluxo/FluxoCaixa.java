package br.com.revisao.projeto.model.fluxo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "fluxo_caixa")
public class FluxoCaixa {

    @EmbeddedId
    private FluxoCaixaId id;

    @Column(precision = 8, scale = 2, nullable = false)
    private BigDecimal entrada;

    @Column(precision = 8, scale = 2, nullable = false)
    private BigDecimal saida;

    public FluxoCaixa() {
    }

    public FluxoCaixa(FluxoCaixaId id, BigDecimal entrada, BigDecimal saida) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
    }

    public FluxoCaixaId getId() {
        return id;
    }

    public void setId(FluxoCaixaId id) {
        this.id = id;
    }

    public BigDecimal getEntrada() {
        return entrada;
    }

    public void setEntrada(BigDecimal entrada) {
        this.entrada = entrada;
    }

    public BigDecimal getSaida() {
        return saida;
    }

    public void setSaida(BigDecimal saida) {
        this.saida = saida;
    }
}
