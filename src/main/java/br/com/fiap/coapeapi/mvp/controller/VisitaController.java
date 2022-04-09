package br.com.fiap.coapeapi.mvp.controller;

import br.com.fiap.coapeapi.mvp.model.Visita;
import br.com.fiap.coapeapi.mvp.repository.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitas")
public class VisitaController {

    @Autowired
    private VisitaRepository visitaRepository;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Visita buscar(@PathVariable Long id) {
        var optional = visitaRepository.findById(id);
        return optional.orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> agendarVisita(@RequestBody Visita visita) {
        return ResponseEntity.noContent().build();
    }
}
