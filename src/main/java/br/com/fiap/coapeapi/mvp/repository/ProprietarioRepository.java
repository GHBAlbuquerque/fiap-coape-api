package br.com.fiap.coapeapi.mvp.repository;

import br.com.fiap.coapeapi.mvp.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

}
