package br.com.revisao.projeto.repository;

import br.com.revisao.projeto.model.fluxo.FluxoCaixa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FluxoCaixaRepository extends CrudRepository<FluxoCaixa, Integer> {
}
