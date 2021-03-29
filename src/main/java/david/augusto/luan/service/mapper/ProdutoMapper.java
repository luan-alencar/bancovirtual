package david.augusto.luan.service.mapper;

import org.mapstruct.Mapper;

import david.augusto.luan.domain.Pessoa;
import david.augusto.luan.service.dto.PessoaDTO;

@Mapper
public interface ProdutoMapper extends EntityMapper<PessoaDTO, Pessoa> {

}
