package david.augusto.luan.service.mapper;

import david.augusto.luan.domain.Usuario;
import david.augusto.luan.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ContaMapper.class})
public interface UsuarioMapper extends EntityMapper<UsuarioDTO, Usuario> {

}
