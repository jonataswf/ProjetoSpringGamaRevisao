package br.com.revisao.projeto.model.fluxo;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FluxoCaixaId implements Serializable {

    private Integer ag;
    private Integer conta;
    private Integer fluxo;

}
