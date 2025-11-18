package org.ZypherX.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ZPX_HABILIDADE")
public class Habilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habilidade")
    private Long id;

    @Column(name = "nome_habilidade", length = 25)
    private String nome;

    @Column(name = "descricao_habilidade", length = 100)
    private String descricao;

    @Column(name = "nivel_habilidade", length = 2)
    private String nivel;
}