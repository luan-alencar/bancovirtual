package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.service.dto.ContaDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ContaMapper extends EntityMapper<ContaDTO, Conta> {

    @Override
    Conta toEntity(ContaDTO dto);

    @Override
    ContaDTO toDto(Conta entity);

    @Override
    List<Conta> toEntity(List<ContaDTO> dtoList);

    @Override
    List<ContaDTO> toDto(List<Conta> entityList);
}
