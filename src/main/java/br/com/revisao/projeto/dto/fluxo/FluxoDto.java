package br.com.revisao.projeto.dto.fluxo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FluxoDto {

    private Integer ag;
    private Integer conta;
    private Integer fluxo;
    private BigDecimal entrada;
    private BigDecimal saida;

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
