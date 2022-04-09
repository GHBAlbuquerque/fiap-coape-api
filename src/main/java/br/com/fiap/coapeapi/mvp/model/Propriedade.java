package br.com.fiap.coapeapi.mvp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Propriedade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private Float metragem;

    @Column(nullable = false)
    private Float valor_aluguel;

    @Embedded
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Proprietario proprietario;

    @Column(nullable = false)
    private Boolean ativa;

}
