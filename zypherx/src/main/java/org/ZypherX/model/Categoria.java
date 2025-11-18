package org.ZypherX.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_ZPX_CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;

    @Column(name = "descricao_categoria", length = 50)
    private String descricao;

    @Column(name = "salario_medio")
    private Double salarioMedio;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(Double salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id) && Objects.equals(descricao, categoria.descricao) && Objects.equals(salarioMedio, categoria.salarioMedio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, salarioMedio);
    }
}
