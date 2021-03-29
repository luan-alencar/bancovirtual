package david.augusto.luan.service.mapper;

import org.mapstruct.Mapper;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.TransacaoDTO;

@Mapper
public interface TransacaoMapper extends EntityMapper<TransacaoDTO, Transacao>{

}
