package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ContaMapper.class})
public interface UsuarioMapper  {

    Usuario toEntity(UsuarioDTO usuarioDTO);

    UsuarioDTO toDTO(Usuario usuario);

    List<Usuario> listagemEntity(List<UsuarioDTO> usuarioDTOList);

    List<UsuarioDTO> listagemDTO(List<Usuario> usuarioList);
}
