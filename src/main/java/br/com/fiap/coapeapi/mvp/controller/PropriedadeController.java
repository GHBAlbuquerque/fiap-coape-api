package br.com.fiap.coapeapi.mvp.controller;

import br.com.fiap.coapeapi.mvp.model.Propriedade;
import br.com.fiap.coapeapi.mvp.repository.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/propriedades")
public class PropriedadeController {

    @Autowired
    private PropriedadeRepository propriedadeRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Propriedade> listar(){
        return propriedadeRepository.findAll();
    }
}
