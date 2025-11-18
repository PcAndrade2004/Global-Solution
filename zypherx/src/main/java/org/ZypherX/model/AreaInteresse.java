package org.ZypherX.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_ZPX_AREA_INTERESSE")
public class AreaInteresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area_interesse")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        AreaInteresse that = (AreaInteresse) o;
        return Objects.equals(id, that.id) && Objects.equals(cliente, that.cliente) && Objects.equals(categoria, that.categoria) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, categoria, curso);
    }
}