package br.com.fiap.coapeapi.mvp.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

public class FotoPropriedade {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "produto_id") //mapeio no id da entidade, a entidade mãe
    private Long id;

    @Column(nullable = false)
    private String nomeArquivo;

    private String descricao;

    @Column(nullable = false)
    private String contentType;

    private Long tamanho;
}
