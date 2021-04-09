package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.TransacaoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ContaMapper.class})
public interface TransacaoMapper {

    TransacaoDTO toDTO(Transacao transacao);

    Transacao toEntity(TransacaoDTO transacaoDTO);

    List<TransacaoDTO> listagemDTO(List<Transacao> transacaoList);

    List<Transacao> listagemEntity(List<TransacaoDTO> transacaoDTOList);
}
