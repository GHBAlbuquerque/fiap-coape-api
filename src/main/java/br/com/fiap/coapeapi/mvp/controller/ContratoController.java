package br.com.fiap.coapeapi.mvp.controller;

import br.com.fiap.coapeapi.mvp.model.Contrato;
import br.com.fiap.coapeapi.mvp.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/contratos")
public class ContratoController {

    @Autowired
    private ContratoRepository contratoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> gerarContrato(@RequestBody Contrato contrato) {
        return ResponseEntity.noContent().build();
    }
}
