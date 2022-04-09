package br.com.fiap.coapeapi.mvp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Column(name = "endereco_logradouro", nullable = false, length = 50)
    private String logradouro;

    @Column(name = "endereco_numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "endereco_complemento", length = 10)
    private String complemento;

    @Column(name = "endereco_bairro", nullable = false, length = 50)
    private String bairro;

    @Column(name = "endereco_cidade", nullable = false, length = 50)
    private String cidade;

    @Column(name = "endereco_estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "endereco_cep", nullable = false, length = 8)
    private String cep;
}
