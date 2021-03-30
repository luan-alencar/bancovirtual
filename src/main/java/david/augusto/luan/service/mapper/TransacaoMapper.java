package david.augusto.luan.service.mapper;

import org.mapstruct.Mapper;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.TransacaoDTO;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface TransacaoMapper extends EntityMapper<TransacaoDTO, Transacao> {

    Transacao toEntity(TransacaoDTO dto);

    TransacaoDTO toDto(Transacao entity);

    List<Transacao> toEntity(List<TransacaoDTO> dtoList);

    List<TransacaoDTO> toDto(List<Transacao> entityList);
}
