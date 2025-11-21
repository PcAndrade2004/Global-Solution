package org.ZypherX.dto;

public class HabilidadesClienteDTO {

    private Long id;
    private Long clienteId;
    private Long habilidadeId;

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

    public Long getHabilidadeId() {
        return habilidadeId;
    }

    public void setHabilidadeId(Long habilidadeId) {
        this.habilidadeId = habilidadeId;
    }
}
