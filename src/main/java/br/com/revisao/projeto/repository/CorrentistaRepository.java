package br.com.revisao.projeto.repository;

import br.com.revisao.projeto.model.correntista.Correntista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrentistaRepository extends CrudRepository<Correntista, Integer> {
}
