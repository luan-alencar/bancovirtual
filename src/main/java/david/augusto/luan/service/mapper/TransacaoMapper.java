package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Transacao;
import david.augusto.luan.service.dto.TransacaoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ContaMapper.class})
public interface TransacaoMapper {

    Transacao toEntity(TransacaoDTO transacaoDTO);

    TransacaoDTO toDTO(Transacao transacao);

    List<Transacao> listagemEntity(List<TransacaoDTO> transacaoDTOList);

    List<TransacaoDTO> listagemDTO(List<Transacao> transacaoList);
}
