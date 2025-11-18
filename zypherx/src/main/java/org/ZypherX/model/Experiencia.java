package org.ZypherX.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ZPX_EXPERIENCIA")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_experiencia")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_prof_anterior")
    private ProfAnterior profAnterior;

    @Column(name = "salario_exp")
    private Double salario;

    @Column(name = "tempo_permanencia")
    private Double tempoPermanencia;
}