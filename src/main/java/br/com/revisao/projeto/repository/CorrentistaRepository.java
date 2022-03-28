package br.com.revisao.projeto.repository;

import br.com.revisao.projeto.model.correntista.Correntista;
import br.com.revisao.projeto.model.correntista.CorrentistaId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CorrentistaRepository extends CrudRepository<Correntista, CorrentistaId> {

    List<Correntista> findAll();

}
