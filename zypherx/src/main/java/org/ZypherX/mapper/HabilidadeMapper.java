package org.ZypherX.mapper;

import org.ZypherX.dto.HabilidadeDTO;
import org.ZypherX.model.Habilidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface HabilidadeMapper {

    HabilidadeDTO toDTO(Habilidade entity);

    Habilidade toEntity(HabilidadeDTO dto);
}
