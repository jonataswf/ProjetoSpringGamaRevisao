package br.com.revisao.projeto.model.correntista;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "correntista")
public class Correntista implements Serializable {


    @EmbeddedId
    private CorrentistaId id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 80, nullable = false)
    private String email;

    @Column(length = 11, nullable = false)
    private String telefone;

    @Column(precision = 8, scale = 2, nullable = false)
    private BigDecimal saldo;

    public Correntista() {
    }

    public Correntista(CorrentistaId id, String nome, String email, String telefone, BigDecimal saldo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public CorrentistaId getId() {
        return id;
    }

    public void setId(CorrentistaId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
