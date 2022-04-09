package br.com.fiap.coapeapi.mvp.repository;

import br.com.fiap.coapeapi.mvp.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
