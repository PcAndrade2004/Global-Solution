package org.ZypherX.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ZPX_PROF_ANTERIOR")
public class ProfAnterior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prof_anterior")
    private Long id;

    @Column(name = "cargo_prof_anterior", length = 50)
    private String cargo;
}
