package david.augusto.luan.service.mapper;

import org.mapstruct.Mapper;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.service.dto.ContaDTO;

@Mapper
public interface ContaMapper extends EntityMapper<ContaDTO, Conta> {

}
