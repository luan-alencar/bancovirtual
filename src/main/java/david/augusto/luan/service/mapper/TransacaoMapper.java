package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.TransacaoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TransacaoMapper extends EntityMapper<TransacaoDTO, Transacao> {

    @Override
    Transacao toEntity(TransacaoDTO dto);

    @Override
    TransacaoDTO toDto(Transacao entity);

    @Override
    List<Transacao> toEntity(List<TransacaoDTO> dtoList);

    @Override
    List<TransacaoDTO> toDto(List<Transacao> entityList);
}
