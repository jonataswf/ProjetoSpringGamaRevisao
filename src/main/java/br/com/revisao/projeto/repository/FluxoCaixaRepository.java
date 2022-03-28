package br.com.revisao.projeto.repository;

import br.com.revisao.projeto.model.fluxo.FluxoCaixa;
import br.com.revisao.projeto.model.fluxo.FluxoCaixaId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FluxoCaixaRepository extends CrudRepository<FluxoCaixa, FluxoCaixaId> {

    List<FluxoCaixa> findAll();
}
