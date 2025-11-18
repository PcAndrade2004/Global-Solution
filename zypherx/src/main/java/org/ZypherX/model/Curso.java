package org.ZypherX.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_ZPX_CURSO")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id;

    @Column(name = "nome_curso", length = 50)
    private String nome;

    @Column(name = "salario_esperado")
    private Double salarioEsperado;

    @Column(name = "mensalidade_curso")
    private Double mensalidade;

    @Column(name = "duracao_meses")
    private Integer duracaoMeses;

    @Column(name = "cargo_alvo", length = 100)
    private String cargoAlvo;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioEsperado() {
        return salarioEsperado;
    }

    public void setSalarioEsperado(Double salarioEsperado) {
        this.salarioEsperado = salarioEsperado;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Integer getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(Integer duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public String getCargoAlvo() {
        return cargoAlvo;
    }

    public void setCargoAlvo(String cargoAlvo) {
        this.cargoAlvo = cargoAlvo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(nome, curso.nome) && Objects.equals(salarioEsperado, curso.salarioEsperado) && Objects.equals(mensalidade, curso.mensalidade) && Objects.equals(duracaoMeses, curso.duracaoMeses) && Objects.equals(cargoAlvo, curso.cargoAlvo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, salarioEsperado, mensalidade, duracaoMeses, cargoAlvo);
    }
}
