package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.service.dto.ContaDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ContaMapper extends EntityMapper<ContaDTO, Conta> {

}
