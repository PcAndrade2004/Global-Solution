package org.ZypherX.dto;

public class ExperienciaDTO {

    private Long id;
    private Long clienteId;
    private Long profAnteriorId;
    private Double salario;
    private Double tempoPermanencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getProfAnteriorId() {
        return profAnteriorId;
    }

    public void setProfAnteriorId(Long profAnteriorId) {
        this.profAnteriorId = profAnteriorId;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTempoPermanencia() {
        return tempoPermanencia;
    }

    public void setTempoPermanencia(Double tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }
}
