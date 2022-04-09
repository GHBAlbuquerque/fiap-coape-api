package br.com.fiap.coapeapi.mvp.repository;

import br.com.fiap.coapeapi.mvp.model.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquilinoRepository extends JpaRepository<Inquilino, Long> {

}
