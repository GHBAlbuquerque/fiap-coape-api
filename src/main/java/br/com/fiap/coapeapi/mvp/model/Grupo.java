package br.com.fiap.coapeapi.mvp.model;

import br.com.fiap.coapeapi.mvp.model.enums.GrupoEnum;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Enumerated
    @Column(nullable = false)
    private GrupoEnum nome;
}
