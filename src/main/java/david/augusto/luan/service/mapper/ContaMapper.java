package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Conta;
import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.ContaDTO;
import david.augusto.luan.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UsuarioMapper.class, TransacaoMapper.class})
public interface ContaMapper  {

    Conta toEntity(ContaDTO contaDTO);

    ContaDTO toDTO(Conta conta);

    List<Usuario> listagemEntity(List<UsuarioDTO> usuarioDTOList);

    List<UsuarioDTO> listagemDTO(List<Usuario> usuarios);
}
