package david.augusto.luan.service.mapper;

import org.mapstruct.Mapper;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.service.dto.ContaDTO;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ContaMapper extends EntityMapper<ContaDTO, Conta> {

    Conta toEntity(ContaDTO dto);

    ContaDTO toDto(Conta entity);

    List<Conta> toEntity(List<ContaDTO> dtoList);

    List<ContaDTO> toDto(List<Conta> entityList);
}
