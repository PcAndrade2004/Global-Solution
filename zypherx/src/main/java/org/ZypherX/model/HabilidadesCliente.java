package org.ZypherX.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ZPX_HABILIDADES")
public class HabilidadesCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habilidades")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_habilidade")
    private Habilidade habilidade;
}
