package br.com.fiap.coapeapi.mvp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private LocalDate data_visita;

    @CreationTimestamp
    private LocalDate data_agendamento;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Propriedade propriedade;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Proprietario proprietario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Inquilino inquilino;

    @Column(nullable = false)
    private Boolean ativa;

}
