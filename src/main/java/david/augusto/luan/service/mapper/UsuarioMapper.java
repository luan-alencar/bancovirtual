package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UsuarioMapper extends EntityMapper<UsuarioDTO, Usuario> {

}
