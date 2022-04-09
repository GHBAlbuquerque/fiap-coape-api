package br.com.fiap.coapeapi.mvp.controller;

import br.com.fiap.coapeapi.mvp.model.Contrato;
import br.com.fiap.coapeapi.mvp.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private ContratoRepository contratoRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Contrato> listar(){
        return contratoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> gerarContrato(@RequestBody Contrato contrato) {
        contratoRepository.save(contrato);
        return ResponseEntity.noContent().build();
    }
}
