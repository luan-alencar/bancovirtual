package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface UsuarioMapper extends EntityMapper<UsuarioDTO, Usuario> {

    Usuario toEntity(UsuarioDTO dto);

    UsuarioDTO toDto(Usuario entity);

    List<Usuario> toEntity(List<UsuarioDTO> dtoList);

    List<UsuarioDTO> toDto(List<Usuario> entityList);
}
