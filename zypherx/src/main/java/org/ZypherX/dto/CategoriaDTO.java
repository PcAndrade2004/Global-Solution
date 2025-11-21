package org.ZypherX.dto;

public class CategoriaDTO {

    private Long id;
    private String descricao;
    private Double salarioMedio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
