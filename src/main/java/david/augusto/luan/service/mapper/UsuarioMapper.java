package david.augusto.luan.service.mapper;

import org.mapstruct.Mapper;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.UsuarioDTO;

@Mapper
public interface UsuarioMapper extends EntityMapper<UsuarioDTO, Usuario> {

}
