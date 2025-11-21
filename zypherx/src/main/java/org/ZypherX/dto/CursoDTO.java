package org.ZypherX.dto;

public class CursoDTO {

    private Long id;
    private String nome;
    private Double salarioEsperado;
    private Double mensalidade;
    private Integer duracaoMeses;
    private String cargoAlvo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
