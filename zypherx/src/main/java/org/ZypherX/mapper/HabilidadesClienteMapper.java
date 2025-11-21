package org.ZypherX.mapper;

import org.ZypherX.dto.HabilidadesClienteDTO;
import org.ZypherX.model.Cliente;
import org.ZypherX.model.Habilidade;
import org.ZypherX.model.HabilidadesCliente;
import org.mapstruct.*;

@Mapper(componentModel = "cdi")
public interface HabilidadesClienteMapper {

    @Mapping(source = "cliente.id", target = "clienteId")
    @Mapping(source = "habilidade.id", target = "habilidadeId")
    HabilidadesClienteDTO toDTO(HabilidadesCliente entity);

    @Mapping(source = "clienteId", target = "cliente")
    @Mapping(source = "habilidadeId", target = "habilidade")
    HabilidadesCliente toEntity(HabilidadesClienteDTO dto);

    // Métodos auxiliares para converter IDs em entidades com apenas o ID preenchido
    default Cliente mapCliente(Long id) {
        if (id == null) return null;
        Cliente c = new Cliente();
        c.setId(id);
        return c;
    }

    default Habilidade mapHabilidade(Long id) {
        if (id == null) return null;
        Habilidade h = new Habilidade();
        h.setId(id);
        return h;
    }
}

