package br.com.fiap.coapeapi.mvp.repository;

import br.com.fiap.coapeapi.mvp.model.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long> {

}
