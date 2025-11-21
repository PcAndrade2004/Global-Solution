package org.ZypherX.mapper;

import org.ZypherX.dto.ProfAnteriorDTO;
import org.ZypherX.model.ProfAnterior;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProfAnteriorMapper {

    ProfAnteriorDTO toDTO(ProfAnterior entity);

    ProfAnterior toEntity(ProfAnteriorDTO dto);
}
