package br.com.fiap.coapeapi.mvp.repository;

import br.com.fiap.coapeapi.mvp.model.Propriedade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropriedadeRepository extends JpaRepository<Propriedade, Long> {

}
