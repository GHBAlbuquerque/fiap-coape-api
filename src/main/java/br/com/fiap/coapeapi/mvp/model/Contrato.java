package br.com.fiap.coapeapi.mvp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private LocalDate dt_assinatura;

    @Column(nullable = false)
    private LocalDate dt_fim;

    @Column(nullable = false)
    private Float valor_aluguel;

    @Column(nullable = false)
    private Float valor_taxa;

    @Column
    private String termos;

    @Column(nullable = false)
    private boolean vigente;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Propriedade propriedade;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Proprietario proprietario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Inquilino inquilino;
}
