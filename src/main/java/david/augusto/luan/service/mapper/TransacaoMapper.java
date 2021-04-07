package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.TransacaoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ContaMapper.class})
public interface TransacaoMapper extends EntityMapper<TransacaoDTO, Transacao> {

}
