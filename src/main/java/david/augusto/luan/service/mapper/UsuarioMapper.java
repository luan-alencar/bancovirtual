package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ContaMapper.class})
public interface UsuarioMapper  {

    UsuarioDTO toDTO(Usuario usuario);

    Usuario toEntity(UsuarioDTO usuarioDTO);

    List<UsuarioDTO> listagemDTO(List<Usuario> usuarioList);

    List<Usuario> listagemEntity(List<UsuarioDTO> usuarioDTOList);
}
